package com.codeclan.butchr.models.stock;

import com.codeclan.butchr.models.stock.FoodItem;

public class Processed extends FoodItem {
    private String ingredients;
    private String allergens;

    public Processed(String name, String type, String description, double price, String cookingInstructions, String ingredients, String allergens) {
        super(name, type, description, price, cookingInstructions);
        this.ingredients = ingredients;
        this.allergens = allergens;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }
}

