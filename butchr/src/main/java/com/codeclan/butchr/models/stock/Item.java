package com.codeclan.butchr.models.stock;

import com.codeclan.butchr.models.User;

import javax.persistence.*;

@Entity(name = "items")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "item_type")
public abstract class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private String description;

    @Column
    private double price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Item(String name, String type, String description, double price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.user = null;
    }

    public Item() {
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
