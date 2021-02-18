package com.codeclan.butchr.components;

import com.codeclan.butchr.models.stock.Meat;
import com.codeclan.butchr.models.stock.Processed;
import com.codeclan.butchr.repositories.ItemRepository;
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

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Meat meat1 = new Meat("Steak", "Beef", "Delicious beef in steak form", 15, "fillet");
        itemRepository.save(meat1);

        Meat meat2 = new Meat("Pork Loin", "Pork", "Delicious pork in loin form", 17, "Loin");
        itemRepository.save(meat2);

        Processed saus = new Processed("Cumberland", "Sausage", "Delicious sausage in sausage form", 6, "Pork, herbs, seasonings, others");
        saus.addAllergen("Gluten");
        saus.addAllergen("Egg");
        itemRepository.save(saus);
    }
}
