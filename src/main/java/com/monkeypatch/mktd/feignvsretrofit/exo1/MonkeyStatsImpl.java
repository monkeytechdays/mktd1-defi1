package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.MonkeyStatistics;

import java.io.IOException;

/**
 * Created by vincent on 08/07/16.
 */
public class MonkeyStatsImpl implements MonkeyStatsApi {
    private MonkeyRetrofitStatsApi api;

    public MonkeyStatsImpl(MonkeyRetrofitStatsApi api) {
        this.api = api;
    }

    @Override
    public MonkeyStatistics getMonkeyStats() {
        try {
            return api.getMonkeyStats().execute().body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
