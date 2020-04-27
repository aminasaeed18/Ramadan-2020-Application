package com.example.ramazan2020;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class RamadanPdf extends AppCompatActivity {
    PDFView dailyDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramadan_pdf);
        dailyDua = (PDFView)findViewById(R.id.pdfRamadan);
        dailyDua.fromAsset("ramadanpdf.pdf").load();
    }
}
