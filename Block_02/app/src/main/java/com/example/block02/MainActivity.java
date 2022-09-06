package com.example.block02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView animalsListView=findViewById(R.id.animal_list_view);
        ArrayAdapter<CharSequence> adapterAnimal=ArrayAdapter.createFromResource(this,R.array.animalsArray, android.R.layout.simple_list_item_1);
        animalsListView.setAdapter(adapterAnimal);

        animalsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String message=getString(R.string.toast_message)+adapterAnimal.getItem(i);
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });
    }
}