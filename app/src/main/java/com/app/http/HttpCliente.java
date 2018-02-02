package com.app.http;

import android.content.Context;
import android.widget.Toast;

import com.app.Coordinator;
import com.google.android.gms.maps.model.LatLng;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by okui_ on 01/02/2018.
 */

public class HttpCliente implements HttpResponseHandler{

    Context context;
    Coordinator coordinator;

    public HttpCliente(Context context, Coordinator coordinator) {
        this.context = context;
        this.coordinator = coordinator;
    }


    public void sendRequest(String url){
        HttpHandler http = new HttpHandler(url ,HttpHandler.GET_REQUEST);
        http.setListener(this);
        http.sendRequest();
    }


    @Override
    public void onSuccess(Object data) throws JSONException {

        JSONObject json = (JSONObject) data; // Se obtiene el Json
        JSONArray array = json.getJSONArray("coordenadas");
        ArrayList<LatLng> list = new ArrayList<LatLng>();

        for (int n = 0; n < array.length(); n++) {
            JSONObject object = array.getJSONObject(n);
            list.add(new LatLng(object.getDouble("lat"),object.getDouble("lng")));
        }

        coordinator.addList(list);
    }

    @Override
    public void onFailure() {
        Toast.makeText(context, "Error al realizar la consulta.",Toast.LENGTH_SHORT);
    }
}
