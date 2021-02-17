package com.codeclan.butchr.models;

public class Processed extends FoodItem{
    private String ingredients;
    private String allergens;

    public Processed(String name, String type, String provenance, String cookingInstructions, double price, int totalStock, int availableForReservation, String ingredients, String allergens) {
        super(name, type, provenance, cookingInstructions, price, totalStock, availableForReservation);
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

