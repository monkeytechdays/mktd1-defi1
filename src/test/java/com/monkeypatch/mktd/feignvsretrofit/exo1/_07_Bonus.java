package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;
import com.squareup.okhttp.mockwebserver.MockResponse;
import com.squareup.okhttp.mockwebserver.MockWebServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import static com.monkeypatch.mktd.feignvsretrofit.exo1.ApiFactory.buildMonkeyApi;
import static com.monkeypatch.mktd.feignvsretrofit.exo1.ApiFactory.buildRaceApi;

public class _07_Bonus {

    // TODO you should add a test rule here
    private MonkeyRaceApi raceApi;
    private MonkeyApi monkeyApi;
    private MockWebServer server;


    @Before
    // TODO you should update this configuration
    public void before() throws Exception {
        server = new MockWebServer();

        server.start();
        String url = server.url("/").toString();
        raceApi = buildRaceApi(url);
        monkeyApi = buildMonkeyApi(url + "/monkeys");
    }

    @After
    public void after() throws IOException {
        server.shutdown();
    }

    @Test
    // TODO you should implements this test
    public void testGetRaces() throws IOException {

        server.enqueue(new MockResponse().setBody(readRacesFromClasspathResource("races")));

        raceApi.getMonkeyRaces();
    }

    @Test
    // TODO you should implements this test
    public void testCreateMonkey() {
        Monkey monkey = new Monkey();
        monkey.setName("Hello");

        server.enqueue(new MockResponse().setBody("{\n" +
                "  \"age\": 0,\n" +
                "  \"gender\": \"MALE\",\n" +
                "  \"id\": \"string\",\n" +
                "  \"name\": \"string\",\n" +
                "  \"raceId\": \"string\"\n" +
                "}"));

        monkeyApi.createMonkey(monkey);
    }

    @Test
    // TODO you should implements this test
    public void testDeleteMonkey() {
        String id = "23";
        server.enqueue(new MockResponse());
        monkeyApi.deleteMonkey(id);
    }

    /**
     * Read a classpath file as String.
     *
     * @param resource the resource (do not start the resource with '/')
     * @return a String
     */
    private String readRacesFromClasspathResource(String resource) {
        try {
            Path path = Paths.get(ClassLoader.getSystemResource(resource).toURI());
            return Files.lines(path)
                    .collect(Collectors.joining("\n"));
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException("WTF !", e);
        }
    }

}
