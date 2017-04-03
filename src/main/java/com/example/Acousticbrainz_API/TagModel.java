package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class TagModel
{
    @SerializedName("album")
    public String[] album;
    
    @SerializedName("albumartist")
    public String[] albumartist;
    
    @SerializedName("albumartistsort")
    public String[] albumartistsort;
    
    @SerializedName("artist")
    public String[] artist;
    
    @SerializedName("artistsort")
    public String[] artistsort;
    
    @SerializedName("composer")
    public String[] composer;
    
    @SerializedName("date")
    public String[] date;

    @SerializedName("lyricist")
    public String[] lyricist;
    
    @SerializedName("originaldate")
    public String[] originaldate;
    
    @SerializedName("title")
    public String[] title;
    
    public TagModel(){}
}
