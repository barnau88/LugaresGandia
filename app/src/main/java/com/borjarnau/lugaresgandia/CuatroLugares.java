package com.borjarnau.lugaresgandia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ArnAu on 13/12/2016.
 */
public class CuatroLugares extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lugares_cuatro);


    }

    public void irPalacio (View v){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void irBayren (View v){
        Intent i = new Intent(this, MapsActivityBayren.class);
        startActivity(i);
    }

    public void irColegiata (View v){
        Intent i = new Intent(this, MapsActivityColegiata.class);
        startActivity(i);
    }

    public void irVital (View v){
        Intent i = new Intent(this, MapsActivityVital.class);
        startActivity(i);
    }
}
