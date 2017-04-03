package com.example.Acousticbrainz_API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class API_Acousticbrainz
{
    private static final String ENDPOINT_URL = "https://acousticbrainz.org/api";
    private static final String ENDPOINT_GET_BEG = "/v1/";
    private static final String ENDPOINT_GET_END_HIGH_LEVEL = "/high-level";
    private static final String ENDPOINT_GET_END_LOW_LEVEL = "/low-level";
    
    public static <T> ResponseModel GetResponse(String szMusicBrainzRecordingID, Class<T> TClass)
    {
        try
        {
            if(szMusicBrainzRecordingID == null)
                return null;
            URL url = new URL(ENDPOINT_URL + ENDPOINT_GET_BEG +
                              szMusicBrainzRecordingID + 
                              (TClass == HighLevelModel.class ?
                               ENDPOINT_GET_END_HIGH_LEVEL : ENDPOINT_GET_END_LOW_LEVEL));
            System.out.println("URL: " + url.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if(conn.getResponseCode() != HttpURLConnection.HTTP_OK)
                return null;
            BufferedReader rr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder buffer = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = rr.read(chars)) != -1)
                buffer.append(chars, 0, read);
            String szJSON = buffer.toString();
            System.out.println(szJSON);
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            JsonObject jo = new JsonParser().parse(szJSON).getAsJsonObject();
            ResponseModel ret = gson.fromJson(jo, ResponseModel.class);
            return ret;
        }
        catch(JsonSyntaxException | IOException ex)
        {
            Logger.getLogger(API_Acousticbrainz.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
