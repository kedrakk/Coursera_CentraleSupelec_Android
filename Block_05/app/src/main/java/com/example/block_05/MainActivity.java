package com.example.block_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences=getSharedPreferences("COLOR_PRESS", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();

        RelativeLayout relativeLayout=findViewById(R.id.app_layout);
        if(sharedPreferences.contains("ColorId")){
            int colorId=sharedPreferences.getInt("ColorId",0);
            relativeLayout.setBackgroundColor(colorId);
            RadioButton blueButton=findViewById(R.id.rdn_blue);
            RadioButton magentaButton=findViewById(R.id.rdn_magenta);
            RadioButton yellowButton=findViewById(R.id.rdn_yellow);
            switch (colorId){
                case R.id.rdn_blue:blueButton.setChecked(true);break;
                case R.id.rdn_magenta:magentaButton.setChecked(true);break;
                case R.id.rdn_yellow:yellowButton.setChecked(true);break;
            }
        }
        RadioGroup radioGroup=findViewById(R.id.rdn_gp_colors);
        radioGroup.setOnCheckedChangeListener((radioGroup1, i) -> {
            int colorCode=0;
            switch (i){
                case R.id.rdn_blue:colorCode=Color.BLUE;break;
                case R.id.rdn_magenta:colorCode=Color.MAGENTA;break;
                case R.id.rdn_yellow:colorCode=Color.YELLOW;break;
            }
            relativeLayout.setBackgroundColor(colorCode);
            editor.putInt("ColorId",colorCode);
            editor.apply();
        });
    }
}