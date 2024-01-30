package org.utl.dsm505_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //definir controles
    EditText txtNum1;
    EditText txtNum2;
    Button btnSumar;
    Button btnRestar;
    Button btnMultiplicar;
    Button btnDividir;
    Button btnLimpiar;
    Button btnSiguiente;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Enlazar botones o dataBinding
        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtResultado = findViewById(R.id.txtResultado);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        btnSiguiente = findViewById(R.id.btnSiguiente);

        btnSumar.setOnClickListener(view -> {
            saludar();
            sumar();
        });
        btnRestar.setOnClickListener(view -> {
            restar();
        });
        btnMultiplicar.setOnClickListener(view -> {
            multiplicar();
        });
        btnDividir.setOnClickListener(view -> {
            dividir();
        });
        btnLimpiar.setOnClickListener(view -> {
            limpiar();
        });
        btnSiguiente.setOnClickListener(View -> {
            Intent abrirSegundaVista = new Intent(this, seconds.class);
            startActivity(abrirSegundaVista);
        });
    }

    public void saludar() {
        Toast.makeText(this, "HOLA DESDE JAVA", Toast.LENGTH_SHORT).show();
    }

    public void sumar() {
        Double num1, num2, resultado;
        num1 = Double.parseDouble(txtNum1.getText().toString());
        num2 = Double.parseDouble(txtNum2.getText().toString());
        resultado = num1 + num2;
        txtResultado.setText(String.valueOf(resultado));

    }
    public void restar(){
        Double num1, num2, resultado;
        num1 = Double.parseDouble(txtNum1.getText().toString());
        num2 = Double.parseDouble(txtNum2.getText().toString());
        resultado = num1 - num2;
        txtResultado.setText(String.valueOf(resultado));
    }
    public void multiplicar(){
        Double num1, num2, resultado;
        num1 = Double.parseDouble(txtNum1.getText().toString());
        num2 = Double.parseDouble(txtNum2.getText().toString());
        resultado = num1 * num2;
        txtResultado.setText(String.valueOf(resultado));
    }
    public void dividir(){
        Double num1, num2, resultado;
        num1 = Double.parseDouble(txtNum1.getText().toString());
        num2 = Double.parseDouble(txtNum2.getText().toString());
        resultado = num1 / num2;
        txtResultado.setText(String.valueOf(resultado));
    }
    public void limpiar(){
        txtNum1.setText("");
        txtNum2.setText("");
        txtResultado.setText("");
    }
}