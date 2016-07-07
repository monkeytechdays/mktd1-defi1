package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;
import org.junit.Test;

import java.util.UUID;

import static com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey.Gender.MALE;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;

public class _04_POST_monkeys implements TestsConfiguration {

    @Test
    public void testCreateMonkey() throws Exception {
        MonkeyApi api = ApiFactory.buildMonkeyApi(BASE_URL);

        // Create monkey
        Monkey monkey = new Monkey();
        monkey.setAge(42);
        monkey.setRaceId("1");
        monkey.setGender(MALE);
        monkey.setName("Plop-" + UUID.randomUUID());

        monkey = api.createMonkey(monkey);
        assertNotNull(monkey);
        assertTrue(validMonkey(monkey));

        // Try to delete
        try {
            api.deleteMonkey(monkey.getId());
        } catch (Throwable e) {
            // should happen
        }
    }
}
