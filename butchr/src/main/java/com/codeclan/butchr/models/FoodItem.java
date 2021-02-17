package com.codeclan.butchr.models;

public abstract class FoodItem extends Item {

    private String cookingInstructions;
    private boolean isHeld;
    private int availableForReservation;

    public FoodItem(String name, String type, String description, double price, int totalStock, String cookingInstructions, int availableForReservation) {
        super(name, type, description, price, totalStock);
        this.cookingInstructions = cookingInstructions;
        this.availableForReservation = availableForReservation;
        this.isHeld = false;
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
