package com.example.codde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    TextView mytext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext = (TextView)findViewById(R.id.mytext);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.myanimation);
        mytext.startAnimation(myanim);

        Thread mythread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent i= new Intent(MainActivity.this,Welcome.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        mythread.start();
    }
}