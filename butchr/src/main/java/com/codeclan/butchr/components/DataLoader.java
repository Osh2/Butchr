package com.codeclan.butchr.components;

import com.codeclan.butchr.models.User;
import com.codeclan.butchr.models.stock.Meat;
import com.codeclan.butchr.models.stock.NonFood;
import com.codeclan.butchr.models.stock.Processed;
import com.codeclan.butchr.repositories.ItemRepository;
import com.codeclan.butchr.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("Bill", "Bill@Bill", "123094", "99bill lane", 7718);
        userRepository.save(user1);

        Meat meat1 = new Meat("Steak", "Beef", "Delicious beef in steak form", 15, "fillet");
        itemRepository.save(meat1);

        Meat meat2 = new Meat("Pork Loin", "Pork", "Delicious pork in loin form", 17, "Loin");
        meat2.setUser(user1);
        itemRepository.save(meat2);

        Processed saus = new Processed("Cumberland", "Sausage", "Delicious sausage in sausage form", 6, "Pork, herbs, seasonings, others");
        saus.addAllergen("Gluten");
        saus.addAllergen("Egg");
        itemRepository.save(saus);

        NonFood item = new NonFood("Coal", "Fuel", "burny", 4, "Petes Coal");
        item.setUser(user1);
        itemRepository.save(item);


    }
}
