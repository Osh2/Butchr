package com.codeclan.butchr.models.stock;

public abstract class FoodItem extends Item {

    private String cookingInstructions;

    public FoodItem(String name, String type, String description, double price, String cookingInstructions) {
        super(name, type, description, price);
        this.cookingInstructions = cookingInstructions;
    }

    public String getCookingInstructions() {
        return cookingInstructions;
    }

    public void setCookingInstructions(String cookingInstructions) {
        this.cookingInstructions = cookingInstructions;
    }


}
