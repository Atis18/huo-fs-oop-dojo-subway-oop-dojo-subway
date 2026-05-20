package com.codecool.subway;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sandwich implements MenuItem {

    private String name;
    private  Double price;
    List<Ingredients> ingredients;

    public Sandwich(String name, List<Ingredients> args) {
        this.name = name;
        this.price = Arrays.stream(args).mapToDouble(Ingredients::getPrice).sum();
        this.ingredients = new ArrayList<>(args);
    }

    public double getPrice() {
        return price;
    }
}
