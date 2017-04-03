package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class GenreRosamericaModel
{
    @SerializedName("cla")
    public float classical;
    
    @SerializedName("dan")
    public float dance;
    
    @SerializedName("hip")
    public float hip_hop;
    
    @SerializedName("jaz")
    public float jazz;
    
    @SerializedName("pop")
    public float pop;
    
    @SerializedName("rhy")
    public float rhythm_n_blues;
    
    @SerializedName("roc")
    public float rock;
    
    @SerializedName("spe")
    public float speech;
    
    public GenreRosamericaModel(){}
}
