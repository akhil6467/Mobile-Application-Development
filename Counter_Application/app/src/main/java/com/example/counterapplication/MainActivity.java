package com.example.counterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int i;
    //int t=0;
    Handler myhandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.counter);
    }
    public void startcounter(View v){
        i=0;
      //  t=1;
//        while(t==1)
//        {
//            tv.setText(""+(i++));
//        }
        myhandler.postDelayed(Threadcount, 0);
    }
    public void stopcounter(View v)
    {
        //t=0;
        myhandler.removeCallbacks(Threadcount);
    }
    public Runnable Threadcount=new Runnable() {
        @Override
        public void run() {
            tv.setText(""+i);
            i++;
            myhandler.postDelayed(Threadcount,0);
        }
    };

}