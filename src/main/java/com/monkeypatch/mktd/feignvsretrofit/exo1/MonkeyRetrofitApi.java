package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;
import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Page;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MonkeyRetrofitApi {

    @GET("monkeys")
    Call<Page<Monkey>> getMonkeys(@Query("page") int page);

    @GET("monkeys/{name}")
    Call<Monkey> getMonkeyByName(@Path("name") String name);

    @POST("monkeys")
    Call<Monkey> createMonkey(@Body Monkey monkey);

    @DELETE("monkeys/{id}")
    Call<ResponseBody> deleteMonkey(@Path("id") String id);


}
