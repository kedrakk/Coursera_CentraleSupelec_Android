package com.emotio.emotio_assignment;

public class EmotionData {
    int imageId;
    String emotionName;
    int emotionRawData;
    EmotionData(int iId,String eName,int emotionRawData){
        this.imageId=iId;
        this.emotionName=eName;
        this.emotionRawData=emotionRawData;
    }
}
