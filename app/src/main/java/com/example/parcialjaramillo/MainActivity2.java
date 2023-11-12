package com.example.parcialjaramillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void navapp1(View view){

        Intent I = new Intent(this,MainActivity3.class);
        //  I.putExtra("web",txt1.getText().toString());
        startActivity(I);

    }
    public void navapp2(View view){

        Intent I = new Intent(this,MainActivity4.class);
        //  I.putExtra("web",txt1.getText().toString());
        startActivity(I);

    }
    public void navapp3(View view){

        Intent I = new Intent(this,MainActivity5.class);
        //  I.putExtra("web",txt1.getText().toString());
        startActivity(I);

    }
}