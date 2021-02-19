package com.codeclan.butchr.models.stock;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "meat")
public class Meat extends Item{

    @Column
    private String cut;

    public Meat(String name, String type, String description, double price, String cut) {
        super(name, type, description, price);
        this.cut = cut;
    }

    public Meat() {
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }
}

