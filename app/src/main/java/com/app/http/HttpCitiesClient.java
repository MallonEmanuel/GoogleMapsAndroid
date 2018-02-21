package com.app.http;

import android.content.Context;
import android.util.Log;

import com.app.Coordinator;
import com.google.android.gms.maps.model.LatLng;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by emanuel on 21/02/18.
 */
public class HttpCitiesClient extends HttpClient {


    public HttpCitiesClient(Context context, Coordinator coordinator, String base_url, String title) {
        super(context, coordinator, base_url, title);
    }

    @Override
    public void sendRequest() {
        HttpHandler http = new HttpHandler(this.base_url,HttpHandler.GET_REQUEST);
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

        coordinator.addList(list, this.base_url, this.title);
    }

    @Override
    public void onFailure() {
        super.onFailure();
    }
}
