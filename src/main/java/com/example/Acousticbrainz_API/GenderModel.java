package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class GenderModel
{
    @SerializedName("female")
    public float female;
    
    @SerializedName("male")
    public float male;
    
    public GenderModel(){}
}
