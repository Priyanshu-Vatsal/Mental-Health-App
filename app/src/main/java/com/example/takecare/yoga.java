package com.example.takecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class yoga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        TextView yoga=(TextView) findViewById(R.id.yoga);

        TextView view1=(TextView) findViewById(R.id.view1);
        TextView view2=(TextView) findViewById(R.id.view2);
        TextView view3=(TextView) findViewById(R.id.view3);
        TextView view4=(TextView) findViewById(R.id.view4);
        TextView View5=(TextView) findViewById(R.id.View5);
        TextView view6=(TextView) findViewById(R.id.view6);
        TextView view7=(TextView) findViewById(R.id.view7);


        ImageView imageView1=(ImageView) findViewById(R.id.imageView1);
        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);
        ImageView imageView3=(ImageView) findViewById(R.id.imageView3);
        ImageView imageView4=(ImageView) findViewById(R.id.imageView4);
        ImageView imageView5=(ImageView) findViewById(R.id.imageView5);
        ImageView imageView6=(ImageView) findViewById(R.id.imageView6);
        ImageView imageView7=(ImageView) findViewById(R.id.imageView7);

        Button button2=(Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "https://seattleyoganews.com/15-yoga-poses-and-their-benefits-to-your-body/";
                gotoUrl(s);
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}