package com.example.navegation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.net.URI;

public class MainActivity2 extends AppCompatActivity {
private TextView t1;
private Spinner sp;
private Button b1;
String url ="https://docs.oracle.com/javase/8/docs/api/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1= (TextView)findViewById(R.id.textt);
        String f = getIntent().getStringExtra("dato");
        t1.setText(f);
        b1= (Button) findViewById(R.id.button);
        sp = findViewById(R.id.spinner);
        String [] opciones = {"toString()","Constructor()","Scanner","Import"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.estilo, opciones);

        sp.setAdapter(adapter);
    }
    public void navegar (View view){
        Uri link= Uri.parse(url);
        Intent i= new Intent(Intent.ACTION_VIEW, link);
        startActivity(i);

    }
}