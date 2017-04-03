package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class MoodAggressiveModel
{
    @SerializedName("aggressive")
    public float aggressive;
    
    @SerializedName("not_aggressive")
    public float not_aggressive;
    
    public MoodAggressiveModel(){}
}
