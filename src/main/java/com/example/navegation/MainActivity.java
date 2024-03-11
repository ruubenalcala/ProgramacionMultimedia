package com.example.navegation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //VARIABLES
private EditText e1;

private TextView t1;
private ImageView im;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.edittextt);
        t1= (TextView) findViewById(R.id.textView);
        im= (ImageView) findViewById(R.id.imageView);

    }
    public void siguiente (View view) {

        //METODO CLICK
        Intent clic = new Intent(this, MainActivity2.class);
        clic.putExtra("dato", e1.getText().toString());
        startActivity(clic);
    }
}