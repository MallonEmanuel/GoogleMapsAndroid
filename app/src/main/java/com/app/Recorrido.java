package com.app;

import com.google.android.gms.maps.model.Polyline;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un recorrido.
 * Recordar que un recorrido es un conjunto de tramos.
 *
 */
public class Recorrido {

    private List<Polyline> tramos;
    private String descripcion;

    /**
     * Constructor de clase.
     * @param descripcion la descripcion del recorrido esta informacion se muestra luego.
     */
    public Recorrido(String descripcion) {
        this.descripcion = descripcion;
        this.tramos = new ArrayList<>();
    }

    public List<Polyline> getTramos() {
        return tramos;
    }

    public void setTramos(List<Polyline> tramos) {
        this.tramos = tramos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setVisible(boolean visible){
        for (int i = 0; i < tramos.size(); i++) {
            tramos.get(i).setVisible(visible);
        }
    }
}
