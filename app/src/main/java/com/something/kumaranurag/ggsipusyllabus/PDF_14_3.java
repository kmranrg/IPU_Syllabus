package com.something.kumaranurag.ggsipusyllabus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by Kumar Anurag on 7/14/2017.
 */

public class PDF_14_3 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        pdfView= (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("tool.pdf").defaultPage(40).load();
    }
}
