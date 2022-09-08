package com.example.block_07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    NumberPicker numberPicker;
    Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberPicker=findViewById(R.id.number_picker);
        String[] possibilities={"Android","Checklist Text Input","Coursera","Supelec"};
        numberPicker.setDisplayedValues(possibilities);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(possibilities.length-1);

        WebView webView=findViewById(R.id.webView);

        okButton=findViewById(R.id.btn_Ok);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index=numberPicker.getValue();
                if(index==0){
                    webView.setWebViewClient(new WebViewClient());
                    webView.loadUrl("file:///android_asset/android.html");
                }else if(index==1){
                    webView.loadUrl("file:///android_asset/checklist.html");
                }else if(index==2){
                    webView.loadUrl("https://www.coursera.org/learn/android-app/lecture/IhaHW/block-7-step-by-step");
                }else{
                    webView.loadUrl("file:///android_asset/supelec.html");
                }
            }
        });
    }
}