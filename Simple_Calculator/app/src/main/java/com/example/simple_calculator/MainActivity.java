package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    TextView res;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        res = findViewById(R.id.result);
    }

    public void one(View v)
    {
        if(number1.hasFocus())
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append("1");
        }
        else
        {
            if(number2.hasFocus())
            {
                number2.append("1");
            }
            else
            {
                Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void two(View v)
    {
        if(number1.hasFocus())
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append("2");
        }
        else
        {
            if(number2.hasFocus())
            {
                number2.append("2");
            }
            else
            {
                Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void three(View v)
    {
        if(number1.hasFocus())
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append("3");
        }
        else
        {
            if(number2.hasFocus())
            {
                number2.append("3");
            }
            else
            {
                Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void four(View v)
    {
        if(number1.hasFocus())
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append("4");
        }
        else
        {
            if(number2.hasFocus())
            {
                number2.append("4");
            }
            else
            {
                Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void five(View v)
    {
        if(number1.hasFocus())
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append("5");
        }
        else
        {
            if(number2.hasFocus())
            {
                number2.append("5");
            }
            else
            {
                Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void six(View v)
    {
        if(number1.hasFocus())
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append("6");
        }
        else
        {
            if(number2.hasFocus())
            {
                number2.append("6");
            }
            else
            {
                Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void seven(View v)
    {
        if(number1.hasFocus())
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append("7");
        }
        else
        {
            if(number2.hasFocus())
            {
                number2.append("7");
            }
            else
            {
                Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void eight(View v)
    {
        if(number1.hasFocus())
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append("8");
        }
        else
        {
            if(number2.hasFocus())
            {
                number2.append("8");
            }
            else
            {
                Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void nine(View v)
    {
        if(number1.hasFocus())
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append("9");
        }
        else
        {
            if(number2.hasFocus())
            {
                number2.append("9");
            }
            else
            {
                Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void zero(View v)
    {
        if(number1.hasFocus())
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append("0");
        }
        else
        {
            if(number2.hasFocus())
            {
                number2.append("0");
            }
            else
            {
                Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void point(View v)
    {
        if(number1.hasFocus() && !number1.getText().toString().contains("."))
        {
            //setText: it will take only one digit at a time
            //Append
            number1.append(".");
        }
        else if(number2.hasFocus() && !number2.getText().toString().contains("."))
        {
           number2.append(".");
        }
        else
        {
           Toast.makeText(this, "Kindly keep the cursor focused on any of the edit text component", Toast.LENGTH_LONG).show();
        }
    }
    public void addition (View v) {op = '+';}
    public void subtraction (View v) {op = '-';}
    public void multiplication (View v) {op = '*';}
    public void division (View v) {op = '/';}

    public void equals(View v)
    {
        float num1,num2,r;

        if(number1.getText().toString().length()>0 && number2.getText().toString().length()>0) {
            switch (op) {
                case '+':
                    num1 = Float.parseFloat((number1.getText().toString()));
                    num2 = Float.parseFloat((number2.getText().toString()));
                    r = num1 + num2;
                    res.setText("" + r);
                    break;

                case '-':
                    num1 = Float.parseFloat((number1.getText().toString()));
                    num2 = Float.parseFloat((number2.getText().toString()));
                    r = num1 - num2;
                    res.setText("" + r);
                    break;

                case '*':
                    num1 = Float.parseFloat((number1.getText().toString()));
                    num2 = Float.parseFloat((number2.getText().toString()));
                    r = num1 * num2;
                    String mul = Float.toString(r);
                    // just to show different ways of performing option
                    res.setText(mul);
                    break;

                case '/':
                    num1 = Float.parseFloat((number1.getText().toString()));
                    num2 = Float.parseFloat((number2.getText().toString()));
                    if (num2 == 0) {
                        Toast.makeText(this, "Divide by Zero Error", Toast.LENGTH_LONG).show();
                    } else {
                        r = num1 / num2;
                        res.setText("" + r);
                    }
                    break;
            }
        }
        else
            Toast.makeText(this,"Fields cannot be empty. Kindly enter the number",Toast.LENGTH_LONG).show();
    }
    public  void clear(View v)
    {
        number1.setText("");
        number2.setText("");
        res.setText("");
    }
    public  void onedigitclear(View v)
    {
        int len1= number1.getText().toString().length();
        int len2= number2.getText().toString().length();

        if(len1 >0 && number1.hasFocus())
        {
            String n;
            n= number1.getText().toString();
            n=n.substring(0, n.length()-1);
            number1.setText(n);
            number1.setSelection(0);
        }
        else if(len2 >0 && number2.hasFocus())
        {
            String n;
            n= number2.getText().toString();
            n=n.substring(1,n.length());
            number2.setText(n);
            number2.setSelection(0);
        }
        else
            Toast.makeText(this, "Kindly keep the cursor focused to delete the digits", Toast.LENGTH_LONG).show();
    }
}