package com.example.codde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class C extends AppCompatActivity {
PDFView pdfCbook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        pdfCbook = (PDFView)findViewById(R.id.pdfCbook);
        pdfCbook.fromAsset("C.pdf").load();
    }
}