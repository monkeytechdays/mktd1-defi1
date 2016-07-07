package com.monkeypatch.mktd.feignvsretrofit.exo1;

import com.monkeypatch.mktd.feignvsretrofit.exo1.model.Monkey;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

interface TestsConfiguration {

    String BASE_URL = "http://defi1.mktd.monkeypatch.io/";
    int RACES_NUMBER = 7;

    default boolean validMonkey(Monkey monkey) {
        assertNotNull(monkey);
        assertNotNull(monkey.getRaceId());
        assertNotNull(monkey.getName());
        assertFalse(monkey.getName().isEmpty());
        assertTrue(monkey.getAge() >= 0);
        assertNotNull(monkey.getGender());
        return true;
    }


}
