package com.example.julian.juego_numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void aleatorio(){
        Math.random();
        
    }

public void evento(View v){
        Toast toast1 =
                Toast.makeText(getApplicationContext(),
                        aleatorio(); Toast.LENGTH_SHORT);

        toast1.show();
        Button miBoton=(Button)v;



}



}
