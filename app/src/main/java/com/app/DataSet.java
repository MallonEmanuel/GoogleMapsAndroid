package com.app;


import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Helper class - stores data sets and sources.
 */
public class DataSet {
    private ArrayList<LatLng> mDataset;
    private String mUrl;

    public DataSet(ArrayList<LatLng> dataSet, String url) {
        this.mDataset = dataSet;
        this.mUrl = url;
    }

    public ArrayList<LatLng> getData() {
        return mDataset;
    }

    public String getUrl() {
        return mUrl;
    }
}
