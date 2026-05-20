package com.codecool.subway;

public enum Ingredients {
    BREAD(1.5),
    SALAD(2.0),
    TOMATO(1.0),
    SALAMI(3.5),
    MAJO(0.2),
    KETCHUP(0.2),
    MUSTARD(0.2);

    private Double price;

    Ingredients(Double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
