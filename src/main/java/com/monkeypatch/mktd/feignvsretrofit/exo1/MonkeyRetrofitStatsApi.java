package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.MonkeyStatistics;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface MonkeyRetrofitStatsApi {

    @GET("stats")
    @Headers({"Accept: application/xml"})
    Call<MonkeyStatistics> getMonkeyStats();
}
