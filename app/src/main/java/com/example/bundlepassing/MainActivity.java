package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;

        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                Intent iNext = new Intent(MainActivity.this,SecondActivity.class);
                iNext.putExtra("title","Home");
                iNext.putExtra("StudentName", "Abhishek");
                iNext.putExtra("Roll no",10);
                startActivity(iNext);
            }
        });

    }
}