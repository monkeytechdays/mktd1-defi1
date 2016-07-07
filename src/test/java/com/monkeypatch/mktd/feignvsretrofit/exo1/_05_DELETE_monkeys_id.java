package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;
import org.junit.Test;

import java.util.UUID;

import static com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey.Gender.MALE;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;

public class _05_DELETE_monkeys_id implements TestsConfiguration {

    @Test
    public void testCreateMonkey() throws Exception {
        MonkeyApi api = ApiFactory.buildMonkeyApi(BASE_URL);

        // Create a monkey
        Monkey monkey = new Monkey();
        monkey.setAge(42);
        monkey.setRaceId("1");
        monkey.setGender(MALE);
        monkey.setName("Plop2-" + UUID.randomUUID());
        monkey = api.createMonkey(monkey);
        assertNotNull(monkey);
        assertTrue(validMonkey(monkey));

        // Now Delete
        String name = monkey.getName();
        api.deleteMonkey(monkey.getId());

        try {
            api.getMonkeyByName(name); // Might throw an exception
        } catch (Exception e) {
            // It's OK
        }
    }
}
