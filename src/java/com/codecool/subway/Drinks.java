package com.codecool.subway;

public enum Drinks implements MenuItem {
    COCACOLA(4.0),
    FANTA(3.8),
    ICETEA(3.6);

    private final double price;

    Drinks(Double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
