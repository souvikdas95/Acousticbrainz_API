package com.example.Acousticbrainz_API;

import com.google.gson.annotations.SerializedName;

public class HighLevelModel
{
    @SerializedName("danceability")
    public HighLevelGenericModel<DanceabilityModel> danceability;
    
    @SerializedName("gender")
    public HighLevelGenericModel<GenderModel> gender;
    
    @SerializedName("genre_dortmund")
    public HighLevelGenericModel<GenreDortmundModel> genre_dortmund;
    
    @SerializedName("genre_rosamerica")
    public HighLevelGenericModel<GenreRosamericaModel> genre_rosamerica;
    
    @SerializedName("genre_tzanetakis")
    public HighLevelGenericModel<GenreTzanetakisModel> genre_tzanetakis;
    
    @SerializedName("ismir04_rhythm")
    public HighLevelGenericModel<RhythmISMIR04Model> ismir04_rhythm;
    
    @SerializedName("mood_acoustic")
    public HighLevelGenericModel<MoodAcousticModel> mood_acoustic;
    
    @SerializedName("mood_aggressive")
    public HighLevelGenericModel<MoodAggressiveModel> mood_aggressive;
    
    @SerializedName("mood_electronic")
    public HighLevelGenericModel<MoodElectronicModel> mood_electronic;
    
    @SerializedName("mood_happy")
    public HighLevelGenericModel<MoodHappyModel> mood_happy;
    
    @SerializedName("mood_party")
    public HighLevelGenericModel<MoodPartyModel> mood_party;
    
    @SerializedName("mood_relaxed")
    public HighLevelGenericModel<MoodRelaxedModel> mood_relaxed;
    
    @SerializedName("mood_sad")
    public HighLevelGenericModel<MoodSadModel> mood_sad;
    
    @SerializedName("moods_mirex")
    public HighLevelGenericModel<MoodsMirexModel> moods_mirex;
    
    @SerializedName("timbre")
    public HighLevelGenericModel<TimbreModel> timbre;
    
    @SerializedName("tonal_atonal")
    public HighLevelGenericModel<TonalAtonalModel> tonal_atonal;
    
    @SerializedName("voice_instrumental")
    HighLevelGenericModel<VoiceInstrumentalModel> voice_instrumental;
    
    public HighLevelModel(){}
}
