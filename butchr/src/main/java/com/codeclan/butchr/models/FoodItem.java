package com.codeclan.butchr.models;

public abstract class FoodItem extends Item {

    private String cookingInstructions;
    private boolean isHeld;
    private int availableForReservation;

    public FoodItem(String name, String type, String description, double price, int totalStock, String cookingInstructions) {
        super(name, type, description, price, totalStock);
        this.cookingInstructions = cookingInstructions;
        this.availableForReservation = calculateAvailableReservation();
        this.isHeld = false;
    }

    public String getCookingInstructions() {
        return cookingInstructions;
    }

    public void setCookingInstructions(String cookingInstructions) {
        this.cookingInstructions = cookingInstructions;
    }

    public boolean isHeld() {
        return isHeld;
    }

    public void setHeld(boolean held) {
        isHeld = held;
    }

    public int getAvailableForReservation() {
        return availableForReservation;
    }

    public void setAvailableForReservation(int availableForReservation) {
        this.availableForReservation = availableForReservation;
    }

    public void sell(int number){
        int stock = getTotalStock();
        stock -= number;
        setTotalStock(stock);
        this.availableForReservation = calculateAvailableReservation();
    }

    public int calculateAvailableReservation(){
        int stock = getTotalStock();
        return Math.round(stock/2);
    }
}
