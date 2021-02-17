package com.codeclan.butchr.models;

public class Meat extends FoodItem {
    private String cut;

    public Meat(String name, String type, String description, double price, int totalStock, String cookingInstructions, int availableForReservation, String cut) {
        super(name, type, description, price, totalStock, cookingInstructions, availableForReservation);
        this.cut = cut;
    }


    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }
}

