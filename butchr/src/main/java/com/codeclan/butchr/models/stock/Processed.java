package com.codeclan.butchr.models.stock;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "processed")
public class Processed extends Item {

    @Column
    private String ingredients;

    @ElementCollection
    private List<String> allergens;

    public Processed(String name, String type, String description, double price, String ingredients) {
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

    public void addAllergen(String allergen){
        allergens.add(allergen);
    }
}

