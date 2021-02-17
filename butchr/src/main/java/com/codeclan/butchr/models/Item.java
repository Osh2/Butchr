package com.codeclan.butchr.models;


public class Item {

    private String name;
    private String type;
    private String description;
    private double price;
    private int totalStock;
    private int quantityOrdered;
    private boolean inBasket;

    public Item(String name, String type, String description, double price, int totalStock) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.totalStock = totalStock;
        this.quantityOrdered = 0;
        this.inBasket = false;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public boolean isInBasket() {
        return inBasket;
    }

    public void setInBasket(boolean inBasket) {
        this.inBasket = inBasket;
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

    public void removeQuantityFromStock(int quantity) {
        totalStock -= quantity;
    }


    //add conditions to handle low stock/ no stock
}
