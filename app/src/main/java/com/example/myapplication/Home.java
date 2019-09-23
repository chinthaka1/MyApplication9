package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Home extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btn = findViewById(R.id.play);
    }



    public void onClick(View view){
        MediaPlayer myAudio = MediaPlayer.create(Home.this,R.raw.sea);
        myAudio.start();
        Intent intent = new Intent(Home.this,levelSelect.class);

        startActivity(intent);
    }
}
