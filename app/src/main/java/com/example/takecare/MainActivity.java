package com.example.takecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username=(TextView) findViewById(R.id.username);         //Initializing username textview
        TextView password=(TextView) findViewById(R.id.password);         //Initializing password textview

        MaterialButton loginbutton=(MaterialButton)  findViewById(R.id.loginbutton);//Initializing Material button

        loginbutton.setOnClickListener(new View.OnClickListener()                 //To do work with botton
        {
            private Object MainActivity2;

            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Admin") && password.getText().toString().equals("admin"))
                {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "LOGIN FAILED!!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}