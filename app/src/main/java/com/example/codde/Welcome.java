package com.example.codde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
Button btn_next,btn_Info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
         btn_next = (Button)findViewById(R.id.btn_next);
         btn_Info = (Button)findViewById(R.id.btn_Info);
         btn_next.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i =new Intent(Welcome.this,DashBoard.class);
                 startActivity(i);
             }
         });
         btn_Info.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent o = new Intent(Welcome.this,Info.class);
                 startActivity(o);
             }
         });
    }
}