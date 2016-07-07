package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;

public class _03_GET_monkeys_name implements TestsConfiguration {

    @Test
    public void testGetMonkeyByName() throws Exception {
        MonkeyApi api = ApiFactory.buildMonkeyApi(BASE_URL);

        Monkey monkey = api.getMonkeyByName("Donkey Kong");
        assertNotNull(monkey);
        assertTrue(validMonkey(monkey));
    }
}
