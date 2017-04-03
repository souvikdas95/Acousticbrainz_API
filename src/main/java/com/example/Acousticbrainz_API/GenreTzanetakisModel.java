package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class GenreTzanetakisModel
{
    @SerializedName("blu")
    public float blues;
    
    @SerializedName("cla")
    public float classical;
    
    @SerializedName("cou")
    public float country;
    
    @SerializedName("dis")
    public float disco;
    
    @SerializedName("hip")
    public float hip_hop;
    
    @SerializedName("jaz")
    public float jazz;
    
    @SerializedName("met")
    public float metal;
    
    @SerializedName("pop")
    public float pop;
    
    @SerializedName("reg")
    public float reggae;
    
    @SerializedName("roc")
    public float rock;

    public GenreTzanetakisModel(){}
}
