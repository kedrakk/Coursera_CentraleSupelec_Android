package com.emotio.emotio_assignment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdaptar extends BaseAdapter {
    Context context;
    EmotionData[] allEmotions;
    LayoutInflater inflater;

    public CustomAdaptar(Context appContext,EmotionData[] emotions){
        this.context=appContext;
        this.allEmotions=emotions;
        this.inflater=(LayoutInflater.from(appContext));
    }

    @Override
    public int getCount() {
        return allEmotions.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.activity_imageview,null);
        ImageView imageButton=view.findViewById(R.id.emotionIcon);
        imageButton.setImageResource(allEmotions[i].imageId);
        TextView textView=view.findViewById(R.id.emotionName);
        textView.setText(allEmotions[i].emotionName);
        return view;
    }
}
