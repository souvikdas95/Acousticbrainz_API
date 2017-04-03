package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class HighLevelGenericModel<E>
{
    @SerializedName("all")
    public E all;
    
    @SerializedName("probability")
    public float probablity;
    
    @SerializedName("value")
    public String value;
    
    @SerializedName("version")
    public VersionModel version;
    
    public HighLevelGenericModel(){}
}
