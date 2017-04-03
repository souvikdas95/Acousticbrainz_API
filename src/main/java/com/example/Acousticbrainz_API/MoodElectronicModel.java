package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class MoodElectronicModel
{
    @SerializedName("electronic")
    public float electronic;
    
    @SerializedName("not_electronic")
    public float not_electronic;
    
    public MoodElectronicModel(){}
}
