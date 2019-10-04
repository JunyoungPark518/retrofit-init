package com.example.apitest.api;

import com.example.apitest.model.Meta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("meta")
    Call<Meta> getMeta(@Query("platform") String platform, @Query("appVersion") String appVersion);

    @GET("user/detail")
    Call<Meta> getUser(@Query("userId") int userId);
}
