package com.shariaty.falhafez;
import com.google.gson.annotations.SerializedName;

public class DataModel {
    private String name;
    private String birthYearInLHijri;
    private String deathYearInLHijri;


    private String birthPlace;

    @SerializedName("name")
    private String fname;


    @SerializedName("birthYearInLHijri")
    private String fbirthYearInLHijri;
    @SerializedName("deathYearInLHijri")
    private String fdeathYearInLHijri;

    @SerializedName("birthPlace")
    private String fbirthPlace;


}
