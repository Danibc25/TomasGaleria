package com.example.danielbc.galeria;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView al1, al2, al3, al4, ft1;
    private GridLayout gd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        al1 = (TextView) findViewById(R.id.alb1);
        al1.setOnClickListener(this);
        al2 = (TextView) findViewById(R.id.alb2);
        al2.setOnClickListener(this);
        al3 = (TextView) findViewById(R.id.alb3);
        al3.setOnClickListener(this);
        al4 = (TextView) findViewById(R.id.alb4);
        al4.setOnClickListener(this);
        gd1 = (GridLayout) findViewById(R.id.gd01);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.alb1:
                Album1();
                break;
            case R.id.alb2:
                Album2();
                break;
            case R.id.alb3:
                Album3();
                break;
            case R.id.alb4:
                Album4();
                break;
        }
    }


    public void Album1() {

        //ContextThemeWrapper newContext = new ContextThemeWrapper(this, R.style.fotosPX1);
        gd1.removeAllViews();
        for (int i = 1; i <= 21; i++) {
            TextView textView1 = new TextView(this);
            textView1.setId(i);
            textView1.setText("Foto " + i);
            textView1.setWidth(320);
            textView1.setHeight(320);
            textView1.setBackgroundColor(Color.parseColor("#d94949"));
            gd1.addView(textView1);

            GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
            margins.setMargins(10, 10, 10, 10);
            textView1.setLayoutParams(margins);


        }
    }

    public void Album2() {

        //ContextThemeWrapper newContext = new ContextThemeWrapper(this, R.style.fotosPX1);
        gd1.removeAllViews();
        for (int i = 1; i <= 28; i++) {
            TextView textView1 = new TextView(this);
            textView1.setId(i);
            textView1.setText("Foto " + i);
            textView1.setWidth(320);
            textView1.setHeight(320);
            textView1.setBackgroundColor(Color.parseColor("#4babc1"));
            gd1.addView(textView1);

            GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
            margins.setMargins(10, 10, 10, 10);
            textView1.setLayoutParams(margins);


        }
    }

    public void Album3() {

        //ContextThemeWrapper newContext = new ContextThemeWrapper(this, R.style.fotosPX1);
        gd1.removeAllViews();
        for (int i = 1; i <= 32; i++) {
            TextView textView1 = new TextView(this);
            textView1.setId(i);
            textView1.setText("Foto " + i);
            textView1.setWidth(320);
            textView1.setHeight(320);
            textView1.setBackgroundColor(Color.parseColor("#a4de5e"));
            gd1.addView(textView1);

            GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
            margins.setMargins(10, 10, 10, 10);
            textView1.setLayoutParams(margins);


        }
    }

    public void Album4() {

        //ContextThemeWrapper newContext = new ContextThemeWrapper(this, R.style.fotosPX1);
        gd1.removeAllViews();
        for (int i = 1; i <= 10; i++) {
            TextView textView1 = new TextView(this);
            textView1.setId(i);
            textView1.setText("Foto " + i);
            textView1.setWidth(320);
            textView1.setHeight(320);
            textView1.setBackgroundColor(Color.parseColor("#dfd349"));
            gd1.addView(textView1);

            GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
            margins.setMargins(10, 10, 10, 10);
            textView1.setLayoutParams(margins);


        }
    }
}
