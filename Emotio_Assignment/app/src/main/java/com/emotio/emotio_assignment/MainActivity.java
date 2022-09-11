package com.emotio.emotio_assignment;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    GridView emotionsGrid;
    EmotionData[] emotionData={
            new EmotionData(R.drawable.happy,"Happy",R.raw.happy),
            new EmotionData(R.drawable.sad,"Sad",R.raw.sad),
            new EmotionData(R.drawable.angry,"Angry",R.raw.angry),
            new EmotionData(R.drawable.sleepy,"Sleepy",R.raw.sleepy),
            new EmotionData(R.drawable.sick,"Sick",R.raw.sick),
            new EmotionData(R.drawable.scared,"Scared",R.raw.scared),
    };
    EmotionData selectedEmotion;
    TextView selectedEmotionText;
    MediaPlayer mediaPlayer;
    TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emotionsGrid=findViewById(R.id.emotion_Grid);
        CustomAdaptar customAdaptar=new CustomAdaptar(getApplicationContext(),emotionData);
        emotionsGrid.setAdapter(customAdaptar);

        titleText=findViewById(R.id.click_emotion);

        selectedEmotionText=findViewById(R.id.selected_emotion_text);
        selectedEmotionText.setVisibility(TextView.GONE);

        emotionsGrid.setOnItemClickListener((adapterView, view, i, l) -> {
            selectedEmotion=emotionData[i];
            setEmotionView(selectedEmotion);
        });
    }


    void setEmotionView(EmotionData lastEmotion){
        titleText.setVisibility(TextView.GONE);
        selectedEmotionText.setVisibility(TextView.VISIBLE);
        selectedEmotionText.setText(lastEmotion.emotionName);
        selectedEmotionText.setCompoundDrawablesWithIntrinsicBounds(0,lastEmotion.imageId,0,0);
        if(mediaPlayer!=null&&mediaPlayer.isPlaying()){
            mediaPlayer.stop();
        }
        mediaPlayer=MediaPlayer.create(this,lastEmotion.emotionRawData);
        mediaPlayer.start();
    }
}