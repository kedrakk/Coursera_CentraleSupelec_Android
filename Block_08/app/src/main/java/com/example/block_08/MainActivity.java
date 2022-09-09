package com.example.block_08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBar ratingBar=findViewById(R.id.stars);

        Button btnEnter=findViewById(R.id.btn_id);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ratings=ratingBar.getRating();
                Intent secondIntent=new Intent();
                secondIntent.setClass(getApplicationContext(),SecondActivity.class);
                secondIntent.putExtra("nbStars",ratings);
                startActivity(secondIntent);
                finish();
            }
        });
    }
}