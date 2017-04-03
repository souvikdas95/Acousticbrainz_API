package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class MoodSadModel
{
    @SerializedName("sad")
    public float sad;
    
    @SerializedName("not_sad")
    public float not_sad;
    
    public MoodSadModel(){}
}
