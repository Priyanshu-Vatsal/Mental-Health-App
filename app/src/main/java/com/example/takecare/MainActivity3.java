package com.example.takecare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.nio.charset.StandardCharsets;
import java.text.BreakIterator;

public class MainActivity3 extends AppCompatActivity {
    EditText name,age,work,email;
    MaterialButton subbtton;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        work=findViewById(R.id.work);
        email=findViewById(R.id.email);
        subbtton=findViewById(R.id.subbutton);

        sp=getSharedPreferences("Full name", Context.MODE_PRIVATE);


        subbtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameStr = name.getText().toString();
                String ageStr=age.getText().toString();
                String workStr=work.getText().toString();
                String emailStr=email.getText().toString();

                SharedPreferences.Editor editor =sp.edit();

                editor.putString("Name",nameStr);
                editor.putString("age",ageStr);
                editor.putString("work",workStr);
                editor.putString("email",emailStr);

                editor.commit();

                Toast.makeText(MainActivity3.this, "Information saved", Toast.LENGTH_SHORT).show();

                Intent intent =new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });

    }
}