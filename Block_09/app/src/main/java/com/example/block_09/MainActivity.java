package com.example.block_09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendBtn=findViewById(R.id.btn_send);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message=((EditText)(findViewById(R.id.txt_message))).getText().toString();
                Uri destination=Uri.parse("smsto:5556");
                Intent smsIntent=new Intent(Intent.ACTION_SENDTO,destination);
                smsIntent.putExtra("sms_body",message);
                startActivity(smsIntent);
            }
        });
    }
}