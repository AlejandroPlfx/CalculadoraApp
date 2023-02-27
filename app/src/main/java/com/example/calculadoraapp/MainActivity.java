package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Var1, Var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Var1 = findViewById(R.id.numero1);
        Var2 = findViewById(R.id.numero2);

        Button suma = findViewById(R.id.suma);
        Button resta = findViewById(R.id.resta);
        Button multiplicacion = findViewById(R.id.multiplicacion);
        Button division = findViewById(R.id.division);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float resultado = Float.parseFloat(Var1.getText().toString()) + Float.parseFloat(Var2.getText().toString());
                Toast.makeText(MainActivity.this, "La suma es " + resultado, Toast.LENGTH_SHORT).show();
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float resultado = Float.parseFloat(Var1.getText().toString()) - Float.parseFloat(Var2.getText().toString());
                Toast.makeText(MainActivity.this, "La resta es " + resultado, Toast.LENGTH_SHORT).show();
            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float resultado = Float.parseFloat(Var1.getText().toString()) * Float.parseFloat(Var2.getText().toString());
                Toast.makeText(MainActivity.this, "La multiplicación es " + resultado, Toast.LENGTH_SHORT).show();}
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float resultado = Float.parseFloat(Var1.getText().toString()) / Float.parseFloat(Var2.getText().toString());
                Toast.makeText(MainActivity.this, "La división es " + resultado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}