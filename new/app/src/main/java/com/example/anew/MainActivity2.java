package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity
{
    public EditText username;
    public  Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        username= findViewById(R.id.usename);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,DashBoard.class);
                startActivity(intent);

            }
        });
    }
}