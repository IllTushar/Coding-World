package com.example.codde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Python extends AppCompatActivity {
PDFView pdfpython;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
        pdfpython = (PDFView)findViewById(R.id.pdfpython);
        pdfpython.fromAsset("python.pdf").load();

    }
}