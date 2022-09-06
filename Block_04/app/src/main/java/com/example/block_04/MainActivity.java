package com.example.block_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer=MediaPlayer.create(this,R.raw.draco);

        Button playButton=findViewById(R.id.btn_play);
        playButton.setOnClickListener(btnPlayClick);

        Button pauseButton=findViewById(R.id.btn_pause);
        pauseButton.setOnClickListener(btnPauseClick);

        SwitchCompat switchCompat=findViewById(R.id.switch_loop);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mediaPlayer.setLooping(b);
            }
        });
    }

    private final View.OnClickListener btnPlayClick = v -> {
        mediaPlayer.start();
    };

    private final View.OnClickListener btnPauseClick = v -> {
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }else{
            Toast.makeText(getApplicationContext(),"The media is not currently playing",Toast.LENGTH_SHORT).show();
        }
    };
}