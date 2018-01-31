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


public class HttpClient implements HttpResponseHandler{

    Context context;
    Coordinator coordinator;

    public HttpClient(Context context, Coordinator coordinator) {
        this.context = context;
        this.coordinator = coordinator;
    }

    public void sendRequest(String url){
        HttpHandler http = new HttpHandler(url ,HttpHandler.GET_REQUEST);
        http.addParams("north","1");
        http.addParams("south","9.9");
        http.addParams("east","22.4");
        http.addParams("west","55.2");
        http.addParams("lang","es");
        http.addParams("username","mallon");
        http.setListener(this);
        http.sendRequest();
    }

    @Override
    public void onSuccess(Object data) throws JSONException {

        Log.e("LOG",data.toString());
        JSONObject json = (JSONObject) data;
        JSONArray array = json.getJSONArray("geonames");
        ArrayList<LatLng> list = new ArrayList<LatLng>();

        for (int n = 0; n < array.length(); n++) {
            JSONObject object = array.getJSONObject(n);
            list.add(new LatLng(object.getDouble("lat"),object.getDouble("lng")));
        }
        Log.e("LOG2",list.toString());
        coordinator.addList(list);
    }

    @Override
    public void onFailure() {
        Toast.makeText(context, "Error al realizar la consulta.",Toast.LENGTH_SHORT);
    }
}
