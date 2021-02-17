package com.codeclan.butchr.models;

import com.codeclan.butchr.models.behaviours.ForSale;

public class NonFoodItem implements ForSale {
    private String name;
    private String type;
    private String description;
    private double price;
    private int totalStock;

    public NonFoodItem(String name, String type, String description, double price, int totalStock) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.totalStock = totalStock;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public void sell(int number){
        this.totalStock -= number;
    }
}
