package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
private ImageView imageView;
private ImageView imageView1;
private ImageView imageView2;
private ImageView imageView3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.whatsapp);
        imageView1=findViewById(R.id.insta);
        imageView2=findViewById(R.id.twitter);
        imageView3=findViewById(R.id.home);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to Home", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),Activity2.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to Twitter", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),Activity5.class);
                startActivity(intent);
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to Instagram", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),Activity3.class);
                startActivity(intent);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to Whatsapp", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),Activity4.class);
                startActivity(intent);
            }
        });
    }
}