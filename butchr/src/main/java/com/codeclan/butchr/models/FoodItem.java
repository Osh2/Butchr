package com.codeclan.butchr.models;

public abstract class FoodItem extends Item {

    private String cookingInstructions;

    public FoodItem(String name, String type, String description, double price, int totalStock, String cookingInstructions) {
        super(name, type, description, price, totalStock);
        this.cookingInstructions = cookingInstructions;
    }

    public String getCookingInstructions() {
        return cookingInstructions;
    }

    public void setCookingInstructions(String cookingInstructions) {
        this.cookingInstructions = cookingInstructions;
    }


}
