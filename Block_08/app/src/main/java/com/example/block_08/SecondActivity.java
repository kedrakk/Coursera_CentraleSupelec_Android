package com.example.block_08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent caller=getIntent();
        float ratings=caller.getFloatExtra("nbStars",0);

        TextView textView=findViewById(R.id.stars_text);
        textView.setText(String.format("%s%s", getString(R.string.welcome_to_second), ratings));
    }
}