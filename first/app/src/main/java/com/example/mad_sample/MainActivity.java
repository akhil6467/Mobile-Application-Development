package com.example.mad_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t2; // reference variables
    //Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //t1= findViewById(R.id.tv1); //text-view are resources (R)
        t2=findViewById(R.id.tv2);
    }
    public void Display(View v)
    {
        t2.setText("Now you see me!");
    }
}