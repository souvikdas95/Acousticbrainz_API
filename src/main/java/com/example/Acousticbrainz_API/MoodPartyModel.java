package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class MoodPartyModel
{
    @SerializedName("party")
    public float party;
    
    @SerializedName("not_party")
    public float not_party;
    
    public MoodPartyModel(){}
}
