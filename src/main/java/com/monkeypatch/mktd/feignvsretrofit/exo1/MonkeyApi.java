package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;
import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Page;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Content-Type: application/json")
public interface MonkeyApi {

    @RequestLine("GET /monkeys?page={page}")
    Page<Monkey> getMonkeys(@Param("page") int page);

    @RequestLine("GET /monkeys/{name}")
    Monkey getMonkeyByName(@Param("name") String name);

    @RequestLine("POST /monkeys")
    Monkey createMonkey(Monkey monkey);

    @RequestLine("DELETE /monkeys/{id}")
    void deleteMonkey(@Param("id") String id);
}