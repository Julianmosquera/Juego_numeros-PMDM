package com.example.julian.juego_numeros;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button) findViewById(R.id.start);

        findViewById(R.id.button0).setOnClickListener(this);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);


    }





    /**
     * Arraylist donde guardamos las respuestas que entran por teclado y los numeros que salen en el toast.
     */

    ArrayList almacen=new ArrayList(7);
    ArrayList respuesta=new ArrayList(7);


    /***
     * Método que genera el número aleatorio para la tostada
     */

    public void aleatorio() {
        for (int i = 0; i < 8; i++) {
            int nt = (int) (Math.random() * 8);
            while (almacen.contains(nt)) {
                nt = (int) (Math.random() * 8);
            }
            almacen.add(nt);
        }
    }


    public void start(View v) {

        aleatorio();
        Toast.makeText(getApplicationContext(), almacen.toString(), Toast.LENGTH_SHORT).show();
    }

    /***
     * Método que compara la diferencia entre el array que gurda el numero y la respuesta
     */

    public void win_lose() {
        String x = almacen.toString();
        String y = respuesta.toString();


        if (x.equals(y)) {
            Toast.makeText(getApplicationContext(), "WIN", Toast.LENGTH_SHORT).show();

        } else
            Toast.makeText(getApplicationContext(), "LOSE", Toast.LENGTH_SHORT).show();
    }


    /**
     * Metodo que escucha a los botones  que se pulsan
     *
     * @param v
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button0:
                respuesta.add(this);
                break;
            case R.id.button1:
                respuesta.add(this);
                break;
            case R.id.button2:
                respuesta.add(this);
                break;
            case R.id.button3:
                respuesta.add(this);
                break;
            case R.id.button4:
                respuesta.add(this);
                break;
            case R.id.button5:
                respuesta.add(this);
                break;
            case R.id.button6:
                respuesta.add(this);
                break;
            case R.id.button7:
                respuesta.add(this);
                break;
            case R.id.button8:
                respuesta.add(this);
                break;

        }

    }
}
























