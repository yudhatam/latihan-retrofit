package com.angkringandigital.retrofit.rest;

import com.angkringandigital.retrofit.model.Items;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("{periode}/dayli.json")
    Call<Items> getJadwalSholat(@Path("periode") String periode);

}
