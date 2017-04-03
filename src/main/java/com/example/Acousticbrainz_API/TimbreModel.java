package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class TimbreModel
{
    @SerializedName("bright")
    public float bright;
    
    @SerializedName("dark")
    public float dark;
    
    public TimbreModel(){}
}
