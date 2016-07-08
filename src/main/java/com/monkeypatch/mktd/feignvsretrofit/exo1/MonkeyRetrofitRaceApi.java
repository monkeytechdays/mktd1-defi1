package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.MonkeyRace;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface MonkeyRetrofitRaceApi {

    @GET("races")
    Call<List<MonkeyRace>> getMonkeyRaces();
}
