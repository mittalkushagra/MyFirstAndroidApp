package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnB;
    Button btnC;
    Button btnD;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnB=(Button)findViewById(R.id.button2);
        btnC=(Button) findViewById(R.id.button3);
        btnD=(Button) findViewById(R.id.button4);
        txtView=(TextView) findViewById(R.id.textView);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button2)
        {
        txtView.setText("A is clicked");
        }
        if(v.getId()==R.id.button3)
        {
            txtView.setText("B is clicked");
        }
        if(v.getId()==R.id.button4)
        {
            txtView.setText("C is clicked");
        }
    }
}