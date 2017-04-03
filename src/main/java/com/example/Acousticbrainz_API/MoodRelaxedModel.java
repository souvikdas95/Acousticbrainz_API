package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class MoodRelaxedModel
{
    @SerializedName("relaxed")
    public float relaxed;
    
    @SerializedName("not_relaxed")
    public float not_relaxed;
    
    public MoodRelaxedModel(){}
}
