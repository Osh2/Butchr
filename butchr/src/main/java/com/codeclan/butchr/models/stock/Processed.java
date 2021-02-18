package com.codeclan.butchr.models.stock;

import java.util.ArrayList;
import java.util.List;

public class Processed extends Item {

    private String ingredients;
    private List<String> allergens;

    public Processed(String name, String type, String description, double price, String ingredients, List<String> allergens) {
        super(name, type, description, price);
        this.ingredients = ingredients;
        this.allergens = new ArrayList<>();
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setAllergens(List<String> allergens) {
        this.allergens = allergens;
    }

    public List<String> getAllergens() {
        return allergens;
    }
}

