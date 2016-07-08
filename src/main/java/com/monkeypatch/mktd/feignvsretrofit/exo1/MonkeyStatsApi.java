package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.MonkeyStatistics;
import retrofit2.http.GET;

public interface MonkeyStatsApi {

    MonkeyStatistics getMonkeyStats();
}
