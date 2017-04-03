package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class ResponseModel
{
    @SerializedName("highlevel")
    public HighLevelModel highlevel = null;
    
    @Deprecated // needs to updated
    @SerializedName("lowlevel")
    public HighLevelModel lowlevel = null;
    
    @SerializedName("metadata")
    public MetadataModel metadata;
    
    public ResponseModel(){}
}
