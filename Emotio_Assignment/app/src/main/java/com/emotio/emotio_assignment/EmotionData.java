package com.emotio.emotio_assignment;

public class EmotionData {
    int imageId;
    String emotionName;
    EmotionData(int iId,String eName){
        this.imageId=iId;
        this.emotionName=eName;
    }

    public int getImageId() {
        return imageId;
    }

    public String getEmotionName() {
        return emotionName;
    }
}
