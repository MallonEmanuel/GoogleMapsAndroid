package com.app;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.JointType;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.maps.android.PolyUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase se ocupa de generar recorridos y tramos.
 * Recordar que un recorrido esta formado por un conjunto de tramos.
 */
public class Generator {

    /**
     * Este metodo se ocupa de generar los recorridos a partir de Data y un formato establecido.
     * @param data contiene los recorridos (en forma de string)y su descripcion.
     * @param mMap referencia al mapa google
     * @return una lista de recorridos
     */
    public static List<Recorrido> generateRecorridos(Data data, GoogleMap mMap){
        List<Recorrido> recorridos = new ArrayList<>();

        for(int i = 0 ; i < data.getRecorridos().size(); i++){ // Para cada recorrido
            String descripcion = data.getDescripciones().get(i); // Se setea la informacion del recorrido
            Recorrido recorrido = new Recorrido(descripcion);
            int color = RandomColor.get(); // Se selecciona un color al azar.
            //Se generan los tramos del recorrido, todos con el mismo color y descripcion.
            recorrido.setTramos(getTramos(mMap,data.getRecorridos().get(i),descripcion,color));
            // Se agrega el recorrido recien generado a la lista de recorridos
            recorridos.add(recorrido);
        }
        return recorridos;
    }

    /**
     * Obtiene los tramos de una lista de Strings
     * @param mMap referencia al mapa google
     * @param tramosString los tramos (en forma de String)
     * @param descripcion descripcion que se agrega a cada tramo
     * @param color color de los tramos
     * @return una lista de tramos
     */
    private static List<Polyline> getTramos(GoogleMap mMap, List<String> tramosString,String descripcion, int color){
        List<Polyline> tramos = new ArrayList<>();
        for (int j = 0; j < tramosString.size(); j++) {
            //genera un tramo (polyLine) que se agrega a un mapa.
            Polyline p =generatePolyline(mMap,tramosString.get(j),descripcion,color);
            tramos.add(p);// se agrega a la lista de tramos
        }
        return tramos;
    }

    /**
     * Permite generar un tramo a partir de un String, el tramo tiene un color y informacion a mostrar.
     * @param mMap referencia al mapa google
     * @param tramo (en formato de String)
     * @param info la informacion que se adjunta al tramo
     * @param color el color del tramo a crear
     * @return Un tramo (PolyLine).
     */
    private static Polyline generatePolyline(GoogleMap mMap, String tramo, String info, int color){
        List<LatLng> decodedPath = PolyUtil.decode(tramo);
        RoundCap roundCap =new RoundCap();
        Polyline polyLine = mMap.addPolyline(new PolylineOptions()
                .addAll(decodedPath)
                .width(5)
                .color(color));

        polyLine.setJointType(JointType.ROUND);
        polyLine.setClickable(true);
        polyLine.setStartCap(roundCap);
        polyLine.setEndCap(roundCap);
        polyLine.setTag(info);

        return polyLine;
    }

}
