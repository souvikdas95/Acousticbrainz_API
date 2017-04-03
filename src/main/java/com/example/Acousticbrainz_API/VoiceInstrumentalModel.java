package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class VoiceInstrumentalModel
{
    @SerializedName("instrumental")
    public float instrumental;
    
    @SerializedName("voice")
    public float voice;
    
    public VoiceInstrumentalModel(){}
}
