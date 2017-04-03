package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class DanceabilityModel
{
    @SerializedName("danceable")
    public float danceable;
    
    @SerializedName("not_danceable")
    public float not_danceable;
    
    public DanceabilityModel(){}
}
