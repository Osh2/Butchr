package com.codeclan.butchr.models;

public class Meat extends FoodItem {
    private String cut;

    public Meat(String name, String type, String provenance, String cookingInstructions, double price, int totalStock, String cut) {
        super(name, type, provenance, cookingInstructions, price, totalStock);
        this.cut = cut;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }
}

