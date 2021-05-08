package com.example.codde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Flutter extends AppCompatActivity {
PDFView pdfflutter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flutter);
        pdfflutter = (PDFView)findViewById(R.id.pdfflutter);
        pdfflutter.fromAsset("flutter.pdf").load();
    }
}