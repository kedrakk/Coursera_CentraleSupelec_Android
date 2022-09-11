package com.emotio.emotio_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView emotionsGrid;
    EmotionData[] emotionData={
            new EmotionData(R.drawable.happy,"Happy"),
            new EmotionData(R.drawable.happy,"Sad"),
            new EmotionData(R.drawable.happy,"Angry"),
            new EmotionData(R.drawable.happy,"Sleepy"),
            new EmotionData(R.drawable.happy,"Silly"),
            new EmotionData(R.drawable.happy,"Wink"),
    };
    EmotionData selectedEmotion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emotionsGrid=findViewById(R.id.emotion_Grid);
        CustomAdaptar customAdaptar=new CustomAdaptar(getApplicationContext(),emotionData);
        emotionsGrid.setAdapter(customAdaptar);

        TextView selectedEmotionText=findViewById(R.id.selected_emotion_text);
        selectedEmotionText.setVisibility(TextView.INVISIBLE);
        emotionsGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedEmotion=emotionData[i];
                selectedEmotionText.setVisibility(TextView.VISIBLE);
                selectedEmotionText.setText(selectedEmotion.emotionName);
                selectedEmotionText.setCompoundDrawablesWithIntrinsicBounds(0,selectedEmotion.imageId,0,0);
            }
        });



    }
}