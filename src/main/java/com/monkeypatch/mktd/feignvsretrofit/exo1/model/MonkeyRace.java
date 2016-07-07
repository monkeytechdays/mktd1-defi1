package com.monkeypatch.mktd.feignvsretrofit.exo1.model;

import java.io.Serializable;
import java.util.Objects;

public class MonkeyRace implements Serializable {

    private String id;
    private String name;

    public MonkeyRace() {
        super();
    }

    @Override
    public String toString() {
        return String.format("MonkeyRace{id=%s, name='%s'}", id, name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonkeyRace that = (MonkeyRace) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
