package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        findViewById(R.id.btn1);
        findViewById(R.id.btn2);
        findViewById(R.id.btn3);

    }

    public void onClick(View view){
        Intent intent = new Intent(Main2Activity3.this,Main2Activity4.class);

        startActivity(intent);
    }

    public void onClick1(View view){
        Intent intent1 = new Intent(Main2Activity3.this,Main2Activity5.class);

        startActivity(intent1);
    }

    public void onClick2(View view){
        Intent intent2 = new Intent(Main2Activity3.this,Main2Activity6.class);

        startActivity(intent2);
    }

}
