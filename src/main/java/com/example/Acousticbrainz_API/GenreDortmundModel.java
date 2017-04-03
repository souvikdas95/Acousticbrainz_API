package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class GenreDortmundModel
{
    @SerializedName("alternative")
    public float alternative;
    
    @SerializedName("blues")
    public float blues;
    
    @SerializedName("electronic")
    public float electronic;
    
    @SerializedName("folkcountry")
    public float folkcountry;
    
    @SerializedName("funksoulrnb")
    public float funksoulrnb;
    
    @SerializedName("jazz")
    public float jazz;
    
    @SerializedName("pop")
    public float pop;
    
    @SerializedName("raphiphop")
    public float raphiphop;
    
    @SerializedName("rock")
    public float rock;
    
    public GenreDortmundModel(){}
}
