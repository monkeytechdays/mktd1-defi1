package com.monkeypatch.mktd.feignvsretrofit.exo1;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.jaxb.JAXBContextFactory;
import feign.jaxb.JAXBDecoder;

class ApiFactory {

    static MonkeyApi buildMonkeyApi(String url) {
        return Feign
                .builder()
                .decoder(new GsonDecoder())
                .encoder(new GsonEncoder())
                .target(MonkeyApi.class, url + "/monkeys");
    }

    static MonkeyStatsApi buildStatsApi(String url) {

        JAXBContextFactory jaxbFactory = new JAXBContextFactory.Builder()
                .withMarshallerJAXBEncoding("UTF-8")
                .build();

        return Feign
                .builder()
                .decoder(new JAXBDecoder(jaxbFactory))
                .target(MonkeyStatsApi.class, url);
    }

    static MonkeyRaceApi buildRaceApi(String url) {
        return Feign
                .builder()
                .decoder(new GsonDecoder())
                .target(MonkeyRaceApi.class, url);
    }
}
