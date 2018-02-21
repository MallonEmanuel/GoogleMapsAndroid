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
public abstract class HttpClient implements HttpResponseHandler{

    protected Context context;
    protected Coordinator coordinator;
    protected String base_url;
    protected String title;

    public HttpClient(Context context, Coordinator coordinator, String base_url, String title) {
        this.context = context;
        this.coordinator = coordinator;
        this.base_url = base_url;
        this.title =title;
    }

    /**
     * Envia una peticion a una URL
     */
    public abstract void sendRequest();

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

    }

    @Override
    public void onFailure() {
        Toast.makeText(context, "Error al realizar la consulta.",Toast.LENGTH_SHORT);
    }
}
