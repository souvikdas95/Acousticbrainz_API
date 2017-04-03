package com.example.Sample;

import com.example.Acousticbrainz_API.*;

public class Sample
{
    public static void main(String[] args)
    {
        String szMusicbrainzRecordingID = "e45a773d-8e98-4068-a93f-1b34a2725ce7";   // e.g.
        ResponseModel obj = API_Acousticbrainz.GetResponse(szMusicbrainzRecordingID, HighLevelModel.class);
        if(obj != null)
        {
            System.out.println("Danceability: " + obj.highlevel.danceability.probablity + " " + obj.highlevel.danceability.value);
            System.out.println("Mood Party: " + obj.highlevel.mood_party.probablity + " " + obj.highlevel.mood_party.value);
            // Try more ...
        }
    }
}
