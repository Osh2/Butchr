package com.codeclan.butchr.models.stock;

public class NonFood extends Item {

    private String manufacturer;

    public NonFood(String name, String type, String description, double price, String manufacturer) {
        super(name, type, description, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
