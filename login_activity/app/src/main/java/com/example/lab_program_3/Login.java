package com.example.lab_program_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText user;
    EditText pass;
    Button login;
    int attempts=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=findViewById(R.id.userid);
        pass=findViewById(R.id.pass);
        login=findViewById(R.id.login);

    }
    public void onLogIn(View v){
        Bundle b=getIntent().getExtras();
        String username=b.getString("username");
        String password=b.getString("password");
        if(user.getText().toString().equals(username)&&pass.getText().toString().equals(password)){
            Toast.makeText(this,"Sign In Successful",Toast.LENGTH_LONG).show();
            Intent i=new Intent(this,Success.class);
            startActivity(i);

        }
        else{
            Toast.makeText(this,"Sign In UnSuccessful"+attempts,Toast.LENGTH_LONG).show();
            attempts++;
            if(attempts==3){
                login.setEnabled(false);

            }

        }


    }
}