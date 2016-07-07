package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;
import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Page;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;

public class _02_GET_monkeys implements TestsConfiguration {

    @Test
    public void testGetMonkeys() throws Exception {
        MonkeyApi api = ApiFactory.buildMonkeyApi(BASE_URL);

        Page<Monkey> monkeys = api.getMonkeys(0);
        assertNotNull(monkeys);
        assertTrue(monkeys.getTotalElements() > 0); // Might if no monkey in the database
        boolean allMonkeysValid = monkeys.getContent().stream()
                .allMatch(this::validMonkey);
        assertTrue(allMonkeysValid);
    }
}
