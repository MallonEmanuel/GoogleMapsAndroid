package com.app.http;

import org.json.JSONException;

/**
 * Created by jorge on 21/09/2015.
 * Permite recibir las consultas HTTP realizadas, permite a quien lo implemente controlar las
 * acciones a tomar en caso de exito o error en las consultas.
 * Recuerde que por cada peticion que se realice a un servidor se debe crear una clase que implemente
 * HttpResponseHandler(esta le permitira el manejo de las acciones a tomar segun el resultado de la consulta).
 * Tambien se debe crear una clase que implemente HttpResponseHandler, que sera la encargada
 * de realizar la consulta.
 */
public interface HttpResponseHandler {
    // En caso de que la consulta sea exitosa se llama a onSuccess
    void onSuccess(Object data) throws JSONException;
    // En caso de que la consulta no sea exitosa se llama a onFailure.
    void onFailure();

}
