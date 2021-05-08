package com.example.codde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kotlin extends AppCompatActivity {
PDFView pdfkt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin2);
        pdfkt = (PDFView)findViewById(R.id.pdfkt);
        pdfkt.fromAsset("kt.pdf").load();
    }
}