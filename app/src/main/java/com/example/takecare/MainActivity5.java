package com.example.takecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        EditText name1=(EditText) findViewById(R.id.name1);
        EditText age2=(EditText) findViewById(R.id.age2);
        EditText work2=(EditText) findViewById(R.id.work2);
        EditText email2=(EditText) findViewById(R.id.email2);

        SharedPreferences sp= getApplicationContext().getSharedPreferences("Full name", Context.MODE_PRIVATE);
        String name=sp.getString("Name"," ");
        String age = sp.getString("age", "");
        String work=sp.getString("work"," ");
        String email=sp.getString("email","");

        name1.setText(name);
        age2.setText(age);
        work2.setText(work);
        email2.setText(email);
    }
}