package com.app.http;

import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.ConnectException;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.conn.ConnectTimeoutException;

/**
 * Controlador de consultas Http, se ocupa de realizar las consultas al servidor, pasa los parametros,
 * permite realizar consultar por GET y POST
 *
 */
public class HttpHandler extends JsonHttpResponseHandler {
    // Tipo de consultas, las consultas puenden ser x medio de GET o POST
    public static final int GET_REQUEST= 0;
    public static final int POST_REQUEST= 1;
    // Url a consultar
    private String baseUrl;
    // HttpResponseHandler es la clase que se ocupara
    // de recibir el resultado de la consulta. Para ello, se debe definir un HttpResponseHandler para
    // cada consulta que se desee realizar.
    private HttpResponseHandler listener;
    // Parametros de la consulta
    private RequestParams requestParams;
    // Tipo de consulta a realizar = GET o POST
    private int requestMode;

    /**
     * El constructor de esta clase brinda la URL adonde se realizara la consulta y el modo de la
     * consulta (ya sea GET o POST, siempre que un servidor solo brinda datos, utilizara las consultas en forma
     * de GET 'estas son las consultas que tenemos'. Si la consulta pretende guardar informacion, en el servidor,
     * o pasar datos censibles "como contraseña al logearce" se usara POST. Esta a grandes razgos la forma de utilizar
     * los modos de consulta)
     * @param baseUrl la url donde se realiza la consulta.
     * @param requestMode el modo de la consulta (GET o POST)
     */
    public HttpHandler(String baseUrl, int requestMode) {
        this.baseUrl = baseUrl;
        this.requestParams = new RequestParams();
        this.requestMode = requestMode;
    }

    /**
     * Este metodo permite mandar la consulta. Debe tenerce en cuenta que la URL ya se inicializo al
     * igual que el tipo de consulta.
     * Si la consulta tiene parametros, estas deben ser agregadas (con addParams) antes de llamar a "sendRequest()"
     */
    public Boolean sendRequest() {
        Boolean request = true;
        Log.e("HttpHandler","sending request");
        try {
            // AsyncHttpClient permite realizar consultas asincronas
            AsyncHttpClient client = new AsyncHttpClient();
            client.setConnectTimeout(10);
            client.setTimeout(10);
            client.setResponseTimeout(10);
            if(requestMode == GET_REQUEST){
                client.get(baseUrl, requestParams, this);
                Log.e("HttpHandler", "sending request GET");
            }else{
                client.post(baseUrl, requestParams, this);
                Log.e("HttpHandler", "sending request POST");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("HttpHandlerExcetion", e + "");
        }
        return request;
    }

    /**
     * Permite agregar un parametro a la URL donde se realizara la consulta, por ej:
     * para la consulta "http://obtenerDireccion?lat=0001&lng=002" podemos ver
     * que la consulta tiene 2 parametros (lat,lng). Estos parametros son agregados
     * a travez de addParam(key,value). Donde key es lat y value es 0001
     * @param key
     * @param value
     */
    public void addParams(String key, String value) {
        requestParams.add(key, value);
        Log.e("HttpHandler","addParams : "+key +"  "+value);
    }

    /**
     * Setea la clase que se encargara de recibir las consultas
     */
    public void setListener(HttpResponseHandler listener) {
        this.listener = listener;
    }

    /**
     * En caso de exito en la consulta se llama al metodo onSuccess del listener (la clase que escucha )
     * @param statusCode
     * @param headers
     * @param response
     */
    public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
        try {
            listener.onSuccess(response);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
        Log.e("HttpHandler onFailure", "");
        super.onFailure(statusCode, headers, throwable, errorResponse);
    }


    @Override
    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
        try {
            listener.onSuccess(response);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
        Log.e("HttpHandler Failure", responseString);
        super.onFailure(statusCode, headers, responseString, throwable);
    }

    @Override
    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
        Log.e("HttpHandler Failure", statusCode +" "+throwable.toString());
        if(throwable instanceof ConnectTimeoutException || throwable instanceof ConnectException){
            listener.onFailure();
        }else {
            super.onFailure(statusCode, headers, throwable, errorResponse);
            sendRequest();
        }
    }



}