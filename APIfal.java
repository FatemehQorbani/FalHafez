package com.shariaty.falhafez;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIfal {


    String BASE_URL = "https://ganjgah.ir/api/ganjoor/hafez/";

    @GET("fal")
    Call<fal2> getFal();
}
