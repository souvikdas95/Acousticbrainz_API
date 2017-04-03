package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class MoodsMirexModel
{
    @SerializedName("Cluster1")
    public float Cluster1;
    
    @SerializedName("Cluster2")
    public float Cluster2;
    
    @SerializedName("Cluster3")
    public float Cluster3;
    
    @SerializedName("Cluster4")
    public float Cluster4;
    
    @SerializedName("Cluster5")
    public float Cluster5;
    
    public MoodsMirexModel(){}
}
