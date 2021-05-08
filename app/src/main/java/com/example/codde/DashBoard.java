package com.example.codde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class DashBoard extends AppCompatActivity {
Button btn_back;
    Button btn_C;
    Button btn_java;
    Button btn_kotlin;
    Button btn_flutter;
    Button btn_python;
    Button btn_scanner;
public static TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        btn_back = (Button)findViewById(R.id.btn_back);
        btn_C = (Button)findViewById(R.id.btn_C);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DashBoard.this,Welcome.class);
                startActivity(i);
            }
        });
        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(DashBoard.this,C.class);
                startActivity(o);
            }
        });
        btn_java = (Button)findViewById(R.id.btn_java);
        btn_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(DashBoard.this,java.class);
                startActivity(t);
            }
        });
        btn_kotlin = (Button)findViewById(R.id.btn_kotlin);
        btn_kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(DashBoard.this,Kotlin.class);
                startActivity(p);
            }
        });
        btn_flutter  = (Button)findViewById(R.id.btn_flutter);
        btn_flutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(DashBoard.this,Flutter.class);
                startActivity(p);
            }
        });
        btn_python = (Button)findViewById(R.id.btn_python);
        btn_python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(DashBoard.this,Python.class);
                startActivity(u);
            }
        });
        btn_scanner = (Button) findViewById(R.id.btn_scanner);
        btn_scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent y = new Intent(getApplicationContext(),Scanner.class);
               startActivity(y);
            }
        });
    }
}