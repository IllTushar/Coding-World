package com.example.codde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.budiyev.android.codescanner.CodeScanner;
import com.github.barteksc.pdfviewer.PDFView;


public class Scanner extends AppCompatActivity {
PDFView btn_scanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
         btn_scanner=(PDFView)findViewById(R.id.pdfswift);
         btn_scanner.fromAsset("swift.pdf").load();
    }

}