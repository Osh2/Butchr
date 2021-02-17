package com.codeclan.butchr.models;

import com.codeclan.butchr.models.behaviours.ForSale;

public abstract class FoodItem implements ForSale {
    private String name;
    private String type;
    private String provenance;
    private String cookingInstructions;
    private double price;
    private boolean isHeld;
    private int totalStock;
    private int availableForReservation;

    public FoodItem(String name, String type, String provenance, String cookingInstructions, double price, int totalStock) {
        this.name = name;
        this.type = type;
        this.provenance = provenance;
        this.cookingInstructions = cookingInstructions;
        this.price = price;
        this.totalStock = totalStock;
        this.availableForReservation = calculateAvailableReservation();
        this.isHeld = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public String getCookingInstructions() {
        return cookingInstructions;
    }

    public void setCookingInstructions(String cookingInstructions) {
        this.cookingInstructions = cookingInstructions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHeld() {
        return isHeld;
    }

    public void setHeld(boolean held) {
        isHeld = held;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public int getAvailableForReservation() {
        return availableForReservation;
    }

    public void setAvailableForReservation(int availableForReservation) {
        this.availableForReservation = availableForReservation;
    }

    public void sell(int number){
        this.totalStock -= number;
        this.availableForReservation = calculateAvailableReservation();
    }

    public int calculateAvailableReservation(){
        return Math.round(totalStock/2);
    }
}
