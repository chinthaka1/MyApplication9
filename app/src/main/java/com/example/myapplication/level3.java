package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class level3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_3);


        findViewById(R.id.start);


    }

    public void OnclickStartLvl_3(View view) {

        MediaPlayer myAudio = MediaPlayer.create(level3.this,R.raw.sea);
        myAudio.start();
        Intent intent = new Intent(level3.this, MainActivity_3.class);

        startActivity(intent);
    }
}
