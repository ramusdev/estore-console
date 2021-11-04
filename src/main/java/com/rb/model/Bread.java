package com.rb.model;

import java.util.Objects;

public class Bread extends Product {
    private float weight = 0.4f;
    private String expirationDate = "19.12.2021";
    private long id;

    public Bread(String name, long id) {
        super(name);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "Bread{" +
                "id=" + id +
                ", weight=" + weight +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bread bread = (Bread) o;
        return Float.compare(bread.weight, weight) == 0 && id == bread.id && Objects.equals(expirationDate, bread.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
