package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;
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

    @Before
    // TODO you should update this configuration
    public void before() throws Exception {
        String url = null;
        raceApi = buildRaceApi(url);
        monkeyApi = buildMonkeyApi(url);
    }

    @Test
    // TODO you should implements this test
    public void testGetRaces() {
        raceApi.getMonkeyRaces();
    }

    @Test
    // TODO you should implements this test
    public void testCreateMonkey() {
        Monkey monkey = null;
        monkeyApi.createMonkey(monkey);
    }

    @Test
    // TODO you should implements this test
    public void testDeleteMonkey() {
        String id = null;
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
