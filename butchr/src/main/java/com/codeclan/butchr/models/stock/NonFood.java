package com.codeclan.butchr.models.stock;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "non_food_items")
public class NonFood extends Item {

    @Column
    private String manufacturer;

    public NonFood(String name, String type, String description, double price, String manufacturer) {
        super(name, type, description, price);
        this.manufacturer = manufacturer;
    }

    public NonFood() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
