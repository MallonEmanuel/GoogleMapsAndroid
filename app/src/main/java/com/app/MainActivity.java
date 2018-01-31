package com.app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Activity perteneciente al menu.
 */
public class MainActivity extends Activity {

    private Button btnUno;
    private Button btnDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button) findViewById(R.id.btn_uno);
        btnDos = (Button) findViewById(R.id.btn_dos);
        // Crea un evento al hacer click
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewActivity(MapsActivity.class);
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Hacer algo.
                viewActivity(MapsActivity2.class);
            }
        });

    }

    // Muestra un activity que se le pasa como parametro
    private void viewActivity(Class activity){
        Intent intent = new Intent(MainActivity.this,activity);
        startActivity(intent);
    }

}


