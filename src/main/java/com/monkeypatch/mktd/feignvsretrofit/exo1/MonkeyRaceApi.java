package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.MonkeyRace;
import feign.Headers;
import feign.RequestLine;

import java.util.List;

@Headers("Content-Type: application/json")
public interface MonkeyRaceApi {

    @RequestLine("GET /races")
    List<MonkeyRace> getMonkeyRaces();
}
