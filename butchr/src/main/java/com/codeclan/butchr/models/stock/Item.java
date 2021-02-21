package com.codeclan.butchr.models.stock;

import com.codeclan.butchr.models.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity(name = "items")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "itemType")
public abstract class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(insertable = false, updatable = false)
    private String itemType;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private String description;

    @Column
    private double price;

    @Column
    private String image;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties("basket")
    private User user;


    public Item(String name, String type, String description, double price, String image) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.user = null;
        this.image = image;
    }

    public Item() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
