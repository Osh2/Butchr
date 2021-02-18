package com.codeclan.butchr.models;

import com.codeclan.butchr.models.stock.FoodItem;
import com.codeclan.butchr.models.stock.Item;
import com.codeclan.butchr.models.stock.Meat;
import com.codeclan.butchr.models.stock.Processed;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "inventories")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //JoinColumn?
    private List<Item> inventory;

    @Column
    private String type;

    public Inventory(String type) {
        this.type = type;
        this.inventory = new ArrayList<>();
    }

    public Inventory() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }


}
