package com.rb.model;

import java.util.Objects;

public class Milk extends Product {
    float volume = 1f;
    float weight = 1.2f;
    String expirationDate = "20.12.2021";
    private long id;

    public Milk(String name, long id) {
        super(name);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "id=" + id +
                ", volume=" + volume +
                ", weight=" + weight +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milk milk = (Milk) o;
        return Float.compare(milk.volume, volume) == 0 && Float.compare(milk.weight, weight) == 0 && id == milk.id && Objects.equals(expirationDate, milk.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
