package com.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by emanuel on 31/01/18.
 */
public class DataSetRecorridos {
    private HashMap<String, List<Recorrido> > mLists;

    public DataSetRecorridos() {
        this.mLists = new HashMap<>();
        this.mLists.put("A",new ArrayList<Recorrido>());
        this.mLists.put("B",new ArrayList<Recorrido>());
        this.mLists.put("C",new ArrayList<Recorrido>());
        this.mLists.put("D",new ArrayList<Recorrido>());
        this.mLists.put("E",new ArrayList<Recorrido>());
    }

    public void add(int color, Recorrido recorrido){
        if(Data.A == color)
            this.mLists.get("A").add(recorrido);
        if(Data.B == color)
            this.mLists.get("B").add(recorrido);
        if(Data.C == color)
            this.mLists.get("C").add(recorrido);
        if(Data.D == color)
            this.mLists.get("D").add(recorrido);
        if(Data.E == color)
            this.mLists.get("E").add(recorrido);
    }

    public void mostrarRecorridos(String tag){
        List<Recorrido> list = mLists.get(tag);
        setVisible(list,true);
    }

    public void ocultarRecorridos(String tag){
        List<Recorrido> list = mLists.get(tag);
        setVisible(list,false);
    }

    /** Muestra u oculta los recorridos.  */
    private void setVisible(List<Recorrido> recorridos,boolean visible){
        for (int i = 0; i < recorridos.size(); i++) {
            recorridos.get(i).setVisible(visible);
        }
    }

    public void mostrarTodo(){
        mostrarRecorridos("A");
        mostrarRecorridos("B");
        mostrarRecorridos("C");
        mostrarRecorridos("D");
        mostrarRecorridos("E");
    }

    public void ocultarTodo(){
        ocultarRecorridos("A");
        ocultarRecorridos("B");
        ocultarRecorridos("C");
        ocultarRecorridos("D");
        ocultarRecorridos("E");
    }
}
