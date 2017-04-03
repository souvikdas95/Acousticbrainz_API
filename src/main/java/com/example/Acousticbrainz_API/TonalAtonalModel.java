package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class TonalAtonalModel
{
    @SerializedName("atonal")
    public float atonal;
    
    @SerializedName("tonal")
    public float tonal;
    
    public TonalAtonalModel(){}
}
