package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class MoodAcousticModel
{
    @SerializedName("acoustic")
    public float acoustic;
    
    @SerializedName("not_acoustic")
    public float not_acoustic;
    
    public MoodAcousticModel(){}
}
