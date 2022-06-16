package com.shariaty.falhafez;

import java.util.List;

import model.poet;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIpoem {

    @GET ("api/ganjoor/poets")
    Call <List<poet>> getData();
}
