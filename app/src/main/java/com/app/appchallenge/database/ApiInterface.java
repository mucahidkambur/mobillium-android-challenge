package com.app.appchallenge.database;

import com.app.appchallenge.database.entity.pojos.VitrinResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/v2/discover")
    Call<List<VitrinResult>> getData();
}
