package com.emotio.emotio_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView emotionsGrid;
    int[] emotionIds={R.drawable.happy,R.drawable.happy,R.drawable.happy,R.drawable.happy,R.drawable.happy,R.drawable.happy};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emotionsGrid=findViewById(R.id.emotion_Grid);
        CustomAdaptar customAdaptar=new CustomAdaptar(getApplicationContext(),emotionIds);
        emotionsGrid.setAdapter(customAdaptar);

    }
}