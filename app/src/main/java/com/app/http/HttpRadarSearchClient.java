package com.app.http;

import android.content.Context;
import android.widget.Toast;

import com.app.Coordinator;
import com.app.DataSet;
import com.app.R;
import com.google.android.gms.maps.model.LatLng;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by okui_ on 01/02/2018.
 */

public class HttpRadarSearchClient extends HttpClient{


    public HttpRadarSearchClient(Context context, Coordinator coordinator, String base_url, String title) {
        super(context, coordinator, base_url, title);
    }

    @Override
    public void sendRequest() {
        HttpHandler http = new HttpHandler(this.base_url,HttpHandler.GET_REQUEST);
        http.setListener(this);
        http.sendRequest();
    }

    @Override
    public void onSuccess(Object data) throws JSONException {

        //Correcion la data es un JsonArray
        //JSONObject json = (JSONObject) data; // Se obtiene el Json
        JSONArray array = (JSONArray) data; // Se obtiene el Json
        // En este caso solo tenes un Json sin nombre, por lo que la sentencia de abajo no tiene sentido.
        //JSONArray array = json.getJSONArray("coordenadas");
        ArrayList<LatLng> list = new ArrayList<LatLng>();

        for (int n = 0; n < array.length(); n++) {
            JSONObject object = array.getJSONObject(n);
            list.add(new LatLng(object.getDouble("lat"),object.getDouble("lng")));
        }

        //mLists.put(getString(R.string.cities), new DataSet(list,
        //      getString(R.string.base_url)));

        coordinator.addList(list,this.base_url, this.title);
    }

}
