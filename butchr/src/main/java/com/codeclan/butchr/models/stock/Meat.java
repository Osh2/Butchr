package com.codeclan.butchr.models.stock;

import com.codeclan.butchr.models.stock.FoodItem;

public class Meat extends FoodItem {
    private String cut;

    public Meat(String name, String type, String description, double price, String cookingInstructions, String cut) {
        super(name, type, description, price, cookingInstructions);
        this.cut = cut;
    }


    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }
}

