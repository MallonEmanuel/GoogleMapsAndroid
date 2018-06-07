package com.app;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Polyline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Esta clase se encarga de mostrar un mapa, tambien se ocupa de mostrar recorridos, en distintos colores,
 * e informa la informacion del recorrido.
 */
public class MapsActivity extends FragmentActivity implements
        OnMapReadyCallback {

    private GoogleMap mMap;
    private static final int LOCATION_REQUEST_CODE = 1;

    private CheckBox mTipificacionCheckboxA;
    private CheckBox mTipificacionCheckboxB;
    private CheckBox mTipificacionCheckboxC;
    private CheckBox mTipificacionCheckboxD;
    private CheckBox mTipificacionCheckboxE;

    private Data data;
    private DataSetRecorridos recorridos;
    //private TextView tv;

    private String type = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        //inicializacion de clases auxiliares.
        data = Data.getInstance();
        mTipificacionCheckboxA = (CheckBox) findViewById(R.id.tipificacionA);
        mTipificacionCheckboxB = (CheckBox) findViewById(R.id.tipificacionB);
        mTipificacionCheckboxC = (CheckBox) findViewById(R.id.tipificacionC);
        mTipificacionCheckboxD = (CheckBox) findViewById(R.id.tipificacionD);
        mTipificacionCheckboxE = (CheckBox) findViewById(R.id.tipificacionE);
        // tv = (TextView) findViewById(R.id.info);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setBuildingsEnabled(false);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(19.9769, -97.8107), 4));

        //MapStyleOptions style = MapStyleOptions.loadRawResourceStyle(this, R.raw.mapstyle_especial3);
        // googleMap.setMapStyle(style);

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        initMap();

    }// Fin onMapReady

    /** Se inicializa el mapa. Es decir los eventos y recorridos.
     * Recordar que el mapa haya podido ser creado. En caso contrario la aplicacion finaliza.
     * Por eso se inicializa en "onMapReady()"
     */
    private void initMap(){
        initEvents();
        initRecorridos();
    }

    /** Se inicializan los eventos del mapa.*/
    private void initEvents(){
        mMap.setOnPolylineClickListener(new GoogleMap.OnPolylineClickListener() {
            @Override
            public void onPolylineClick(Polyline polyline) {
                if(polyline.isVisible()){
                    // String type = "";
                    // Obtener el objeto data almacenado en la polilínea.
                    if (polyline.getTag() != null) {
                        type = polyline.getTag().toString();
                    }
                    //  tv.setText(type);
                    alerta();
                }
            }
        });
    }

    private void alerta() {

        // Utils.showAlert_T(this, "Carretera Federal", type );
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle("Carretera Federal");
        adb.setCancelable(false);
        adb.setMessage(type);
        adb.setPositiveButton("OK", null);
        adb.setNegativeButton("Tabla", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                openDialog();//
            }
        });
        adb.create().show();
    }

    private void openDialog() {
        final Dialog dialog = new Dialog(this); // Context, this, etc.
        dialog.setContentView(R.layout.tabla);
        dialog.setTitle("TABLA");
        dialog.show();
    }

    /*
            public static void showAlert_T(Context context, String title, String msg) {
                AlertDialog.Builder adb = new AlertDialog.Builder(context);
                adb.setTitle(title);
                adb.setMessage(msg);
                adb.setIcon(R.drawable.road);
                adb.setNegativeButton("Ok", null);
                adb.create().show();
        }

        /** Se inicializan los recorridos del mapa. */
    private void initRecorridos(){
        recorridos = Generator.generateRecorridos(data,mMap);
        recorridos.ocultarTodo();
    }



    /** Controla el evento del Toggle que muestra u oculta los recorridos*/
    public void onTipificacionToggled(View view) {
        if (mTipificacionCheckboxA.isChecked()) {
            recorridos.mostrarRecorridos("A");
        }else {
            recorridos.ocultarRecorridos("A");
        }
    }
    /** Controla el evento del Toggle que muestra u oculta los recorridos*/
    public void onTipificacionToggledB(View view) {
        if (mTipificacionCheckboxB.isChecked()) {
            recorridos.mostrarRecorridos("B");
        }else {
            recorridos.ocultarRecorridos("B");
        }
    }
    /** Controla el evento del Toggle que muestra u oculta los recorridos*/
    public void onTipificacionToggledC(View view) {
        if (mTipificacionCheckboxC.isChecked()) {
            recorridos.mostrarRecorridos("C");
        }else {
            recorridos.ocultarRecorridos("C");
        }
    }
    /** Controla el evento del Toggle que muestra u oculta los recorridos*/
    public void onTipificacionToggledD(View view) {
        if (mTipificacionCheckboxD.isChecked()) {
            recorridos.mostrarRecorridos("D");
        }else {
            recorridos.ocultarRecorridos("D");
        }
    }
    /** Controla el evento del Toggle que muestra u oculta los recorridos*/
    public void onTipificacionToggledE(View view) {
        if (mTipificacionCheckboxE.isChecked()) {
            recorridos.mostrarRecorridos("E");
        }else {
            recorridos.ocultarRecorridos("E");
        }
    }

    @Override
    public void onBackPressed() {
        MapsActivity.this.finish();

    }

}

