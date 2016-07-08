package com.monkeypatch.mktd.feignvsretrofit.exo1;

import javax.servlet.http.HttpServletResponse;

import static spark.Spark.*;

public class MockMonkey {

    public void startMock() {
        get("/races", (request1, response1) -> "[{\"id\":\"0\",\"name\":\"Gibbons\"},{\"id\":\"1\",\"name\":\"Orang-outan\"},{\"id\":\"2\",\"name\":\"Gorille\"},{\"id\":\"3\",\"name\":\"Chimpanzé\"},{\"id\":\"4\",\"name\":\"Bonobo\"},{\"id\":\"5\",\"name\":\"Capucin\"},{\"id\":\"6\",\"name\":\"Mandrill\"}]");
        post("/monkeys", (request, response) -> request.body());
        delete("/monkeys/{id}", (request, response) -> {
            response.status(HttpServletResponse.SC_NO_CONTENT);
            response.body();
            return "";
        });

        awaitInitialization();
    }

    public void stopMock() {
        stop();
    }
}