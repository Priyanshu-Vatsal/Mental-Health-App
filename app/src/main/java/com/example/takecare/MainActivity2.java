package com.example.takecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView image =(ImageView) findViewById(R.id.image);
        TextView content=(TextView) findViewById(R.id.content);
        TextView content2=(TextView) findViewById(R.id.content2);

        MaterialButton button =(MaterialButton)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                    Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                    startActivity(intent);
            }
        });
    }
}