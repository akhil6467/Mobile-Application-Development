package com.example.lab_program_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText user;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.username);
        pass=findViewById(R.id.password);
    }
    public void onSignUp(View v){

        if(user.getText().toString().length()>0&&pass.getText().toString().length()>=8&&validatePass(pass.getText().toString())){
            Toast.makeText(this,"Sign Up Successful",Toast.LENGTH_LONG).show();
            Intent i=new Intent(this, Login.class);
            Bundle b=new Bundle();
            b.putString("username",user.getText().toString());
            b.putString("password",pass.getText().toString());
            i.putExtras(b);
            startActivity(i);
        }
        else{
            Toast.makeText(this,"Password Validation Failed",Toast.LENGTH_LONG).show();

        }
    }
    public boolean validatePass(String pass){
        Pattern pattern;
        Matcher matcher;
        String pat="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[$!@#%&><+-])(?=\\S+$).{8,}$";
        pattern=Pattern.compile(pat);
        matcher=pattern.matcher(pass);

        return matcher.matches();

    }
}