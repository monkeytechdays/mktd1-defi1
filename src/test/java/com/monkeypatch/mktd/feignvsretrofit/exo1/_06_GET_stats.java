package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.MonkeyStatistics;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class _06_GET_stats implements TestsConfiguration {

    @Test
    public void testGetStats() throws Exception {
        MonkeyStatsApi api = ApiFactory.buildStatsApi(BASE_URL);

        MonkeyStatistics stats = api.getMonkeyStats();
        assertNotNull(stats);

        assertNotNull(stats.getCountMonkeys());
        assertTrue(stats.getCountMonkeys().getCounter() >= 0);

        assertNotNull(stats.getCountMonkeysByGender());
        assertFalse(stats.getCountMonkeysByGender().isEmpty());

        assertNotNull(stats.getCountMonkeysByRaces());
        assertFalse(stats.getCountMonkeysByRaces().isEmpty());

        assertNotNull(stats.getMonkeyAgesStatistics());
        assertNotNull(stats.getMonkeyAgesStatistics().getStatistics());

        assertNotNull(stats.getMonkeyAgesStatisticsByGender());
        assertFalse(stats.getMonkeyAgesStatisticsByGender().isEmpty());

        assertNotNull(stats.getCountMonkeysByGender());
        assertFalse(stats.getCountMonkeysByGender().isEmpty());
    }
}
