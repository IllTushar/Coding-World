package com.example.codde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class java extends AppCompatActivity {
PDFView pdfjava;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        pdfjava = (PDFView)findViewById(R.id.pdfjava);
        pdfjava.fromAsset("java.pdf").load();
    }
}