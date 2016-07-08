package com.monkeypatch.mktd.feignvsretrofit.exo1;

import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

class ApiFactory {

    static MonkeyApi buildMonkeyApi(String url) {
        return new MonkeyImpl(buildApi(MonkeyRetrofitApi.class, url));
    }

    static MonkeyRaceApi buildRaceApi(String url) {
        return new MonkeyRaceImpl(buildApi(MonkeyRetrofitRaceApi.class, url));
    }

    static MonkeyStatsApi buildStatsApi(String url) {
        return new MonkeyStatsImpl(buildApi(MonkeyRetrofitStatsApi.class, url, SimpleXmlConverterFactory.createNonStrict()));
    }

    private static <T> T buildApi(Class<T> clazz, String url) {
        return buildApi(clazz, url, GsonConverterFactory.create());
    }

    private static <T> T buildApi(Class<T> clazz, String url, Converter.Factory converter) {
        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(converter)
                .build()
                .create(clazz);

    }
}
