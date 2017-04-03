package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class VersionModel
{
    @SerializedName("essentia")
    public String essentia;
    
    @SerializedName("essentia_build_sha")
    public String essentia_build_sha;
    
    @SerializedName("essentia_git_sha")
    public String essentia_git_sha;
    
    @SerializedName("extractor")
    public String extractor;
    
    @SerializedName("gaia")
    public String gaia;
    
    @SerializedName("gaia_git_sha")
    public String gaia_git_sha;
    
    @SerializedName("models_essentia_git_sha")
    public String models_essentia_git_sha;
    
    public VersionModel(){}
}
