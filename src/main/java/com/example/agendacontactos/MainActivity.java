package com.example.agendacontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.Scroller;
import android.widget.Toast;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
    }

    //METODOS
    public void guardar(View view) {
        String nombre= editText1.getText().toString();
        String datos= editText2.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("Contactos", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(nombre, datos);
        editor.commit();
        finish();

        Toast.makeText(this, "Contacto guardado", Toast.LENGTH_SHORT).show();
    }
    public void buscar(View view) {
        String nombre= editText1.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("Contactos", MODE_PRIVATE);
        String datos = sharedPreferences.getString(nombre, "");
        if (datos.isEmpty()){
            Toast.makeText(this, "No se ha encontrado ningún dato", Toast.LENGTH_SHORT).show();
        }else {
            editText2.setText(datos);
        }
    }
}