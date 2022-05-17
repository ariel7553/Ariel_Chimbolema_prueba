package com.example.ariel_chimbolema;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);


        text_nombre = findViewById(R.id.text_nombre);
        text_Apellido = findViewById(R.id.text_Apellido);
        text_base = findViewById(R.id.text_base);
        text_exponente = findViewById(R.id.text_exponente);
        text_factorial = findViewById(R.id.text_factorial);
        text_potencia = findViewById(R.id.text_potencia);
    }


    public void siguiente(View view){
        String nombre = text_nombre.getText().toString();
        String apellido = text_apellido.getText().toString();

        float base =  ;
        float apellido = text_edad.getText().toString();

        Intent intent = new Intent(activiy1.this,Activity2.class);
        intent.putExtra("nombre 1",nombre);
        intent.putExtra("edad 1",nombre);
        startActivity(intent);
    }
}