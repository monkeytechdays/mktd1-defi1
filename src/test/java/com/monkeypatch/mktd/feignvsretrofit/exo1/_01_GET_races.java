package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.MonkeyRace;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class _01_GET_races implements TestsConfiguration {

    @Test
    public void testGetRaces() throws Exception {
        MonkeyRaceApi api = ApiFactory.buildRaceApi(BASE_URL);

        List<MonkeyRace> races = api.getMonkeyRaces();
        assertNotNull(races);
        assertEquals(RACES_NUMBER, races.size());
    }
}
