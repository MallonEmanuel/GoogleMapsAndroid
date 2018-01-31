package com.app;

import android.Manifest;
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
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Polyline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Esta clase se encarga de mostrar un mapa, tambien se ocupa de mostrar recorridos, en distintos colores,
 * e informa la informacion del recorrido.
 */
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback{

    private GoogleMap mMap;

    private static final int LOCATION_REQUEST_CODE = 1;
    private CheckBox mTipificacionCheckbox;
    private CheckBox mTipificacionCheckboxB;
    private CheckBox mTipificacionCheckboxC;
    private CheckBox mTipificacionCheckboxD;
    private CheckBox mTipificacionCheckboxE;
    private Data data;
    private DataSetRecorridos recorridos;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        //inicializacion de clases auxiliares.
        data = Data.getInstance();
        mTipificacionCheckbox = (CheckBox) findViewById(R.id.tipificacion);
        mTipificacionCheckboxB = (CheckBox) findViewById(R.id.tipificacionB);
        mTipificacionCheckboxC = (CheckBox) findViewById(R.id.tipificacionC);
        mTipificacionCheckboxD = (CheckBox) findViewById(R.id.tipificacionD);
        mTipificacionCheckboxE = (CheckBox) findViewById(R.id.tipificacionE);

        tv = (TextView) findViewById(R.id.info);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setBuildingsEnabled(false);

        MapStyleOptions style = MapStyleOptions.loadRawResourceStyle(
                this, R.raw.style_json);
        googleMap.setMapStyle(style);


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {

            mMap.setMyLocationEnabled(true);
            initMap();

        }else {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {

                Toast.makeText(this,"Instalar de nuevo la aplicación", Toast.LENGTH_SHORT).show();
            } else {

                // Solicitar permiso
                Toast toast1 = Toast.makeText(this,"Los permisos de ubicación, son indispensables", Toast.LENGTH_LONG);
                toast1.setGravity(Gravity.CENTER,0 , 330);
                toast1.show();
                ActivityCompat.requestPermissions(
                        this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        LOCATION_REQUEST_CODE);
            }
        }
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
                    String type = "";
                    // Obtener el objeto data almacenado en la polilínea.
                    if (polyline.getTag() != null) {
                        type = polyline.getTag().toString();
                    }

                    tv.setText(type);
/*
                    Toast toast1 = new Toast(getApplicationContext());
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.toast_layout,
                            (ViewGroup) findViewById(R.id.lytLayout));
                    TextView txtMsg = (TextView)layout.findViewById(R.id.txtMensaje);
                    ImageView image = (ImageView) layout.findViewById(R.id.imgIcono);
                    txtMsg.setText(type);
                    toast1.setDuration(Toast.LENGTH_LONG);
                    toast1.setView(layout);
                    toast1.show();
                  */
                }
            }
        });
    }

    /** Se inicializan los recorridos del mapa. */
    private void initRecorridos(){
        recorridos = Generator.generateRecorridos(data,mMap);
        recorridos.ocultarTodo();
    }

    //Resultado de la solicitud de permisos
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        if (requestCode == LOCATION_REQUEST_CODE) {
            // ¿Permisos asignados?
            if (permissions.length > 0 &&
                    permissions[0].equals(Manifest.permission.ACCESS_FINE_LOCATION) &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                mMap.setMyLocationEnabled(true);
            } else {
                Toast.makeText(this, "Permisos de ubicación denegados", Toast.LENGTH_LONG).show();
            }
        }
    }// fin onRequestPermissionsResult


    /** Controla el evento del Toggle que muestra u oculta los recorridos*/
    public void onTipificacionToggled(View view) {
        if (mTipificacionCheckbox.isChecked()) {
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


}
