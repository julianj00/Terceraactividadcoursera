package com.example.parcialjaramillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView bton_compr1;
    private TextView bton_compr2;
    private TextView bton_compr3;
    private TextView tex_respuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bton_compr1 = (TextView) findViewById(R.id.texto1);
        bton_compr2 = (TextView) findViewById(R.id.texto2);
        bton_compr3 = (TextView) findViewById(R.id.texto4);
    }




    public void navapp(View view){

        Intent I = new Intent(this,MainActivity2.class);
        //  I.putExtra("web",txt1.getText().toString());
        startActivity(I);

    }




    }
