package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.MonkeyStatistics;
import feign.RequestLine;


public interface MonkeyStatsApi {

    @RequestLine("GET /stats")
    MonkeyStatistics getMonkeyStats();
}
