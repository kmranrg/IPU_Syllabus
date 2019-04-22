package com.something.kumaranurag.ggsipusyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.tv1);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt6=(Button)findViewById(R.id.bt6);
        bt7=(Button)findViewById(R.id.bt7);
        bt8=(Button)findViewById(R.id.bt8);
        bt9=(Button)findViewById(R.id.bt9);
        bt10=(Button)findViewById(R.id.bt10);
        bt11=(Button)findViewById(R.id.bt11);
        bt12=(Button)findViewById(R.id.bt12);
        bt13=(Button)findViewById(R.id.bt13);
        bt14=(Button)findViewById(R.id.bt14);
        bt15=(Button)findViewById(R.id.bt15);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, PDF_1.class);
                startActivity(i);

            }

        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_2.class);
                startActivity(i);

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_3.class);
                startActivity(i);

            }

        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_4.class);
                startActivity(i);

            }

        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_5.class);
                startActivity(i);

            }

        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_6.class);
                startActivity(i);

            }

        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_7.class);
                startActivity(i);

            }

        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_8.class);
                startActivity(i);

            }

        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_9.class);
                startActivity(i);

            }

        });

        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_10.class);
                startActivity(i);

            }

        });

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_11.class);
                startActivity(i);

            }

        });

        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_12.class);
                startActivity(i);

            }

        });

        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_13.class);
                startActivity(i);

            }

        });

        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Sem_Layout_PDF_14.class);
                startActivity(i);

            }

        });

        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, Activity_Dev.class);
                startActivity(i);

            }

        });

    }
}
