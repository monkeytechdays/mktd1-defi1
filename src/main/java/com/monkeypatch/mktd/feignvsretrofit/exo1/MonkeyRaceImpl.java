package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.MonkeyRace;

import java.io.IOException;
import java.util.List;

/**
 * Created by vincent on 08/07/16.
 */
public class MonkeyRaceImpl implements MonkeyRaceApi {
    private MonkeyRetrofitRaceApi api;

    public MonkeyRaceImpl(MonkeyRetrofitRaceApi api) {
        this.api = api;
    }

    @Override
    public List<MonkeyRace> getMonkeyRaces() {
        try {
            return api.getMonkeyRaces().execute().body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
