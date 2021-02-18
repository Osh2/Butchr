package com.codeclan.butchr.models;
import com.codeclan.butchr.models.stock.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column(name = "tele_num")
    private String teleNum;

    @Column
    private String address;

    @Column
    private int age;

    @OneToMany(mappedBy = "user")
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

    public void addToBasket(Item item){
        basket.add(item);
    }


}
