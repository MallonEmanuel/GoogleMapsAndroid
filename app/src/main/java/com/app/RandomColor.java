package com.app;

import android.graphics.Color;

import java.util.Random;

/**
 * Esta clase permite obtener un color al azar.
 */
public class RandomColor {
    /**
     * @return un color al azar.
     */
    public static int get(){
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        return  Color.rgb(r,g,b);
    }
}
