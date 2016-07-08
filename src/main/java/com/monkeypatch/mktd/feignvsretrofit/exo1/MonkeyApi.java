package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;
import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Page;
import retrofit2.http.*;

public interface MonkeyApi {

    Page<Monkey> getMonkeys( int page);

    Monkey getMonkeyByName( String name);

    Monkey createMonkey( Monkey monkey);

    void deleteMonkey(String id);


}
