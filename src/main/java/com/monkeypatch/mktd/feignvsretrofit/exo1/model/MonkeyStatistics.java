package com.monkeypatch.mktd.feignvsretrofit.exo1.model;

import java.util.Map;

// TODO you may annotate this class for XML mapping
public class MonkeyStatistics {
    private MonkeyCounter countMonkeys;
    private Map<String, Integer> countMonkeysByRaces;
    private Map<String, Integer> countMonkeysByGender;
    private IntStatistics monkeyAgesStatistics;
    private Map<String, Statistics> monkeyAgesStatisticsByRace;
    private Map<String, Statistics> monkeyAgesStatisticsByGender;

    public MonkeyCounter getCountMonkeys() {
        return countMonkeys;
    }

    public void setCountMonkeys(MonkeyCounter countMonkeys) {
        this.countMonkeys = countMonkeys;
    }

    public Map<String, Integer> getCountMonkeysByRaces() {
        return countMonkeysByRaces;
    }

    public void setCountMonkeysByRaces(Map<String, Integer> countMonkeysByRaces) {
        this.countMonkeysByRaces = countMonkeysByRaces;
    }

    public Map<String, Integer> getCountMonkeysByGender() {
        return countMonkeysByGender;
    }

    public void setCountMonkeysByGender(Map<String, Integer> countMonkeysByGender) {
        this.countMonkeysByGender = countMonkeysByGender;
    }

    public IntStatistics getMonkeyAgesStatistics() {
        return monkeyAgesStatistics;
    }

    public void setMonkeyAgesStatistics(IntStatistics monkeyAgesStatistics) {
        this.monkeyAgesStatistics = monkeyAgesStatistics;
    }

    public Map<String, Statistics> getMonkeyAgesStatisticsByRace() {
        return monkeyAgesStatisticsByRace;
    }

    public void setMonkeyAgesStatisticsByRace(Map<String, Statistics> monkeyAgesStatisticsByRace) {
        this.monkeyAgesStatisticsByRace = monkeyAgesStatisticsByRace;
    }

    public Map<String, Statistics> getMonkeyAgesStatisticsByGender() {
        return monkeyAgesStatisticsByGender;
    }

    public void setMonkeyAgesStatisticsByGender(Map<String, Statistics> monkeyAgesStatisticsByGender) {
        this.monkeyAgesStatisticsByGender = monkeyAgesStatisticsByGender;
    }
}
