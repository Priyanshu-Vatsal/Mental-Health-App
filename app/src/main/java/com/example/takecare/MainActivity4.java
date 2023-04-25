package com.example.takecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        EditText text=(EditText) findViewById(R.id.text);
        TextView content=(TextView)findViewById(R.id.content);

        ImageButton button=(ImageButton) findViewById(R.id.button);
        MaterialButton meditation=(MaterialButton)findViewById(R.id.meditation);
        MaterialButton yoga=(MaterialButton) findViewById(R.id.yoga);
        MaterialButton song=(MaterialButton) findViewById(R.id.song);
        MaterialButton games=(MaterialButton) findViewById(R.id.games);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
            }
        });

        meditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,Stopwatch.class);
                startActivity(intent);
            }
        });

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,yoga.class);
                startActivity(intent);
            }
        });

        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this, song.class);
                startActivity(intent);
            }
        });

        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this, games.class);
                startActivity(intent);
            }
        });
    }
}