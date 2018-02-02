package com.app.http;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.app.Coordinator;
import com.google.android.gms.maps.model.LatLng;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Esta es la clase que se encarga de hacer la peticion propia, que muestra las ciudades.
 * Para mostrar los puntos como deseas, debes crear una clase parecida a esta, para hacer la peticion
 * con sendRequest() y obtiene el resultado con onSuccess() "metodo obligado a implementar por HttpResponseHandler"
 */
public class HttpClient implements HttpResponseHandler{

    Context context;
    Coordinator coordinator;

    public HttpClient(Context context, Coordinator coordinator) {
        this.context = context;
        this.coordinator = coordinator;
    }

    /**
     * Envia una peticion a una URL
     * @param url donde se realiza la peticion
     */
    public void sendRequest(String url){
        HttpHandler http = new HttpHandler(url ,HttpHandler.GET_REQUEST);
        // Se agregan los parametros.
        http.addParams("north","1");
        http.addParams("south","9.9");
        http.addParams("east","22.4");
        http.addParams("west","55.2");
        http.addParams("lang","es");
        http.addParams("username","mallon");
        // Se setea el listener, es decir que esta clase se encargara de el resultado de
        // la consulta. Muy bien podria ser otra clase, pero asi se mantiene mas simple.
        http.setListener(this);
        http.sendRequest();
    }

    /**
     * En caso de que la consulta sea exitosa. Se lee el Json
     * Recordar que un JSONArray esta encerrado entre []
     * y un JSONObject esta encerrado entre {}
     * Va a ser buena experiencia leer el otro Json.
     * @param data
     * @throws JSONException
     */
    @Override
    public void onSuccess(Object data) throws JSONException {

        Log.e("LOG",data.toString());// Se muestra la informacion obtenida en consola.
        JSONObject json = (JSONObject) data; // Se obtiene el Json
        JSONArray array = json.getJSONArray("geonames");// Se obtiene el Arreglo dentro del json
        ArrayList<LatLng> list = new ArrayList<LatLng>();

        // Ahora obtenemos los puntos de cada objeto en el arreglo.
        for (int n = 0; n < array.length(); n++) {
            JSONObject object = array.getJSONObject(n);
            list.add(new LatLng(object.getDouble("lat"),object.getDouble("lng")));
        }
        // se agrega la lista de puntos. Para crear otro conjunto de puntos se debe
        // crear otro metodo parecido a coordinator.addList().
        coordinator.addList(list);
    }

    @Override
    public void onFailure() {
        Toast.makeText(context, "Error al realizar la consulta.",Toast.LENGTH_SHORT);
    }
}
