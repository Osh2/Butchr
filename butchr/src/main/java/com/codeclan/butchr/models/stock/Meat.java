package com.codeclan.butchr.models.stock;


public class Meat extends Item{

    private String cut;

    public Meat(String name, String type, String description, double price, String cut) {
        super(name, type, description, price);
        this.cut = cut;
    }


    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }
}

