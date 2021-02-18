package com.codeclan.butchr.models;
import com.codeclan.butchr.models.stock.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class User {


    private long id;


    private String name;


    private String email;


    private String teleNum;


    private String address;


    private int age;


    private List<Item> basket;

    public User(String name, String email, String teleNum, String address, int age) {
        this.name = name;
        this.email = email;
        this.teleNum = teleNum;
        this.address = address;
        this.age = age;
        this.basket = new ArrayList<>();
    }

    public User() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Item> getBasket() {
        return basket;
    }

    public void setBasket(List<Item> basket) {
        this.basket = basket;
    }


}
