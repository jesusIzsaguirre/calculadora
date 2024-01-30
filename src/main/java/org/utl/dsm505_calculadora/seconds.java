package org.utl.dsm505_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class seconds extends AppCompatActivity {
    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconds);

        btnRegresar = findViewById(R.id.btnRegresar);


        btnRegresar.setOnClickListener(view -> {
            Intent regresarVistaPrimera = new Intent(this, MainActivity.class);
            startActivity(regresarVistaPrimera);
        });
    }
}