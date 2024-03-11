package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //VARIABLES
    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.resultado);
        rb1 = (RadioButton) findViewById(R.id.btSuma);
        rb2 = (RadioButton) findViewById(R.id.btResta);
        rb3 = (RadioButton) findViewById(R.id.btMulti);
        rb4 = (RadioButton) findViewById(R.id.btDividir);
    }


    public void calcular (View view){
        String valor1_St = et1.getText().toString();
        String valor2_St = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_St);
        int valor2_int = Integer.parseInt(valor2_St);

        if (rb1.isChecked()){
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        } else if (rb2.isChecked()) {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        } else if (rb3.isChecked()) {
            int multi = valor1_int * valor2_int;
            String resultado = String.valueOf(multi);
            tv1.setText(resultado);
        } else if (rb4.isChecked()) {
            int dividir = valor1_int / valor2_int;
            String resultado = String.valueOf(dividir);
            tv1.setText(resultado);
        }
    }
}