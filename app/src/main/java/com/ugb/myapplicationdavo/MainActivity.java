package com.ugb.myapplicationdavo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button btL;

    Button btall;

    Spinner spL;

    TextView temL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btL=(Button) findViewById(R.id.btnconL);

        btL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temL = (TextView) findViewById(R.id.txtcantL);
                double cantidad = Double.parseDouble(temL.getText().toString());

                spL = findViewById(R.id.spinnerL1);
                int de = spL.getSelectedItemPosition();

                spL = findViewById(R.id.spinnerL2);
                int a = spL.getSelectedItemPosition();

                temL = findViewById(R.id.txtresL);
                temL.setText("Respuesta: "+ convertir(0, de, a, cantidad));
            }
        });
    }


    public double convertir(int opcion, int de, int a, double cantidad){
        double[][] Longitud = {
                { 1, 0.1, 0.0001, 0.000001, 0.39370, 0.003280, 0.001093, 6.21371192e-7, 5.39956803e-7, 39.37007},//longitud

        };
        return Longitud[opcion][a] / Longitud[opcion][de] * cantidad;
    }
}