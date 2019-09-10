package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

         findViewById(R.id.btn1);
         findViewById(R.id.btn2);
         findViewById(R.id.btn3);
         findViewById(R.id.btn4);


    }

    public void onClick(View view){
        Intent intent = new Intent(Main2Activity2.this,Main2Activity3.class);

        startActivity(intent);
    }

    public void onClick1(View view){
        Intent intent1 = new Intent(Main2Activity2.this,Main2Activity3.class);

        startActivity(intent1);
    }

    public void onClick2(View view){
        Intent intent2 = new Intent(Main2Activity2.this,Main2Activity3.class);

        startActivity(intent2);
    }

    public void onClick3(View view){
        Intent intent3 = new Intent(Main2Activity2.this,Main2Activity3.class);

        startActivity(intent3);
    }
}
