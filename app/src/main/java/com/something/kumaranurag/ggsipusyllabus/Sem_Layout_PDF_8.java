package com.something.kumaranurag.ggsipusyllabus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sem_Layout_PDF_8 extends AppCompatActivity {
    TextView tvs1;
    Button bts1,bts2,bts3,bts4,bts5,bts6,bts7,bts8;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem);
        tvs1=(TextView)findViewById(R.id.tvs1);
        bts1=(Button)findViewById(R.id.bts1);
        bts2=(Button)findViewById(R.id.bts2);
        bts3=(Button)findViewById(R.id.bts3);
        bts4=(Button)findViewById(R.id.bts4);
        bts5=(Button)findViewById(R.id.bts5);
        bts6=(Button)findViewById(R.id.bts6);
        bts7=(Button)findViewById(R.id.bts7);
        bts8=(Button)findViewById(R.id.bts8);

        bts1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sem_Layout_PDF_8.this, PDF_8_1.class);
                startActivity(i);
            }
        });
        bts2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sem_Layout_PDF_8.this, PDF_8_2.class);
                startActivity(i);
            }
        });
        bts3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sem_Layout_PDF_8.this, PDF_8_3.class);
                startActivity(i);
            }
        });
        bts4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sem_Layout_PDF_8.this, PDF_8_4.class);
                startActivity(i);
            }
        });
        bts5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sem_Layout_PDF_8.this, PDF_8_5.class);
                startActivity(i);
            }
        });
        bts6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sem_Layout_PDF_8.this, PDF_8_6.class);
                startActivity(i);
            }
        });
        bts7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sem_Layout_PDF_8.this, PDF_8_7.class);
                startActivity(i);
            }
        });
        bts8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sem_Layout_PDF_8.this, PDF_8_8.class);
                startActivity(i);
            }
        });
    }
}
