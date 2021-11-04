package com.rb.model;

public class Chocolate extends Product {
    long id = 1050;
    float weight = 0.1f;
    String expirationDate = "10.12.2021";

    public Chocolate(String name) {
        super(name);
    }
}
