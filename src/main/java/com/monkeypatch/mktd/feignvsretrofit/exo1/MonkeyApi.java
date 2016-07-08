package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;
import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Page;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Content-Type: application/json")
public interface MonkeyApi {

    @RequestLine("GET ?page={page}")
    Page<Monkey> getMonkeys(@Param("page") int page);

    @RequestLine("GET /{name}")
    Monkey getMonkeyByName(@Param("name") String name);

    @RequestLine("POST ")
    Monkey createMonkey(Monkey monkey);

    @RequestLine("DELETE /{id}")
    void deleteMonkey(@Param("id") String id);
}