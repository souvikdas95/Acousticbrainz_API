package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class MoodHappyModel
{
    @SerializedName("happy")
    public float happy;
    
    @SerializedName("not_happy")
    public float not_happy;
    
    public MoodHappyModel(){}
}
