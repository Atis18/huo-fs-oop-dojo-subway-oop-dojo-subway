package com.codecool.subway;

import java.util.List;
import java.util.ArrayList;

public class Restaurant {

    private String name;
    List<MenuItem> order = new ArrayList<>();

    public void addNewMenuItem() {
        order.add(new Sandwich("Salami Sandwich", List.of(Ingredients.BREAD, Ingredients.SALAMI, Ingredients.MAJO)));
    }
}
