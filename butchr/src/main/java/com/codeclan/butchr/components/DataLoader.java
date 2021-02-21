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

        User user2 = new User("Sami", "Sami@google", "111223", "SamiStreet", 4);
        userRepository.save(user2);

        Meat meat1 = new Meat("Steak", "Beef", "Delicious beef in steak form", 15, "fillet");
        itemRepository.save(meat1);

        Meat meat2 = new Meat("Pork Loin", "Pork", "Delicious pork in loin form", 17, "Loin");
        meat2.setUser(user1);
        itemRepository.save(meat2);


        Meat meat3 = new Meat("Chicken Fillet", "Poultry", "Herb fed, free range chicken fillet", 10, "Fillet");

        Meat meat4 = new Meat("Chicken leg", "Poultry", "Herb fed, free range chicken leg", 3, "Leg");

        Meat meat5 = new Meat("Chicken thigh", "Poultry", "Skinless, boneless chicken thigh", 1.50,
                "Thigh");

        Meat meat6 = new Meat("Free Range Chicken", "Poultry", "Herb fed, free range chicken", 20, "Whole bird");

        Meat meat7 = new Meat("Organic Chicken", "Poultry", "Corn fed organic free range chicken", 25, "Whole bird");

        Meat meat8 = new Meat("Duck breast", "Poultry", "Farmed female duck breast", 3.50, "Breast");

        Meat meat9 = new Meat("Duck leg confit", "Poultry", "Duck leg onfit", 10.10, "Leg");

        Meat meat10 = new Meat("Whole duck", "Poultry", "Free range, farmed duck", 25, "Whole bird");

        Meat meat11 = new Meat("Pheasant", "Game", "Yorkshire pheasant, idk", 4.25, "Whole bird");

        Meat meat12 = new Meat("Grouse", "Game", "Yorkshire grouse, idk", 12.50, "Whole bird");

        Meat meat13 = new Meat("Quail", "Game", "Teeny, tiny Norfolk quail", 3, "Whole bird");

        Meat meat14 = new Meat("Pork tenderloin", "Pork", "Delicious pork tenderloin", 9, "Tenderloin");

        Meat meat15 = new Meat("Pork belly", "Pork", "Delicious pork belly", 7, "Belly");

        Meat meat16 = new Meat("Pork Chops", "Pork", "Delicious pork chops", 4.5, "Loin chops");

        Meat meat17 = new Meat("Spareribs", "Pork", "Delicious pork spareribs", 9, "Ribs");

        Meat meat18 = new Meat("Lamb shoulder", "Lamb", "Delicious lamb shoulder", 45, "Shoulder");

        Meat meat19 = new Meat("Leg of Lamb", "Lamb", "Delicious leg of lamb", 45, "Leg");

        Meat meat20 = new Meat("Lamb cutlets", "Lamb", "Delicious lamb cutlets", 18, "Trimmed ribs");

        Meat meat21 = new Meat("Lamb chops", "Lamb", "Delicious lamb chops", 10, "Loin chops");

        Meat meat22 = new Meat("Rack of lamb", "Lamb", "Delicious lamb rack", 25, "Rack");

        Meat meat23 = new Meat("Rump Steak", "Beef", "Delicious rump steak", 14, "Rump steak");

        Meat meat24 = new Meat("Ribeye steak", "Beef", "Delicious ribeye steak", 18, "Ribeye");

        Meat meat25 = new Meat("Sirloin steak", "Beef", "Delicious sirloin steak", 18, "Sirloin");

        Meat meat26 = new Meat("T-Bone steak", "Beef", "Delicious T-Bone steak ", 25, "T-Bone");

        Meat meat27 = new Meat("Fillet steak", "Beef", "Delicious fillet steak", 18, "Fillet");

        Meat meat28 = new Meat("Contre Fillet ", "Beef", "Delicious contre fillet", 58, "Rolled sirloin");

        Meat meat29 = new Meat("Rib of Beef", "Beef", "Delicious rob of beef", 68, "Ribeye on the bone");

        Meat meat30 = new Meat("Short ribs", "Beef", "Delicious ribeye stea ", 18, "Ribeye");

        Meat meat31 = new Meat("Casserole steak", "Beef", "Delicious casserole stea ", 8, "Diced Beef");

        Meat meat32 = new Meat("Brisket", "Beef", "Delicious brisket", 18, "Brisket");

        Meat meat33 = new Meat("Minced beef", "Beef", "Delicious minced steak", 6, "Minced steak");

        Meat meat34 = new Meat("Veal Chops", "Veal", "Delicious dutch veal chop", 12, "T-bone steak");

        Meat meat35 = new Meat("Veal Escalope", "Veal", "Delicious dutch veal escolope", 8, "Topside escalopes");

        Meat meat36 = new Meat("Diced Veal", "Veal", "Delicious diced veal", 12, "Diced veal bavette");








        Processed saus = new Processed("Cumberland", "Sausage", "Delicious sausage in sausage form", 6, "Pork, herbs, seasonings, others");
        saus.addAllergen("Gluten");
        saus.addAllergen("Egg");
        itemRepository.save(saus);

        NonFood item = new NonFood("Coal", "Fuel", "burny", 4, "Petes Coal");
        item.setUser(user1);
        itemRepository.save(item);


// sausage

        Processed cumberland = new Processed("Cumberland sausage", "Sausage", "Delicious sausage in sausage form", 6,
                "Pork, herbs, seasonings, others");
        cumberland.addAllergen("Gluten");
        cumberland.addAllergen("Egg");



        Processed gloucester = new Processed("Gloucester old spot sausage", "Sausage", "Delicious sausage in sausage " +
                "form", 6, "Pork, herbs, seasonings, others");
        gloucester.addAllergen("Gluten");
        gloucester.addAllergen("Egg");


        Processed toulouse = new Processed("Toulouse", "Sausage", "Delicious sausage in sausage form", 6, "Pork, veal, herbs, seasonings, others");
        toulouse.addAllergen("Gluten");
        toulouse.addAllergen("Egg");

        Processed chillisaus = new Processed("Chilli and fennel sausage", "Sausage", "Delicious sausage in sausage ",
                6, "Pork, chilli, fennel , herbs, seasonings, others");
        chillisaus.addAllergen("Gluten");
        chillisaus.addAllergen("Egg");

        Processed victoria = new Processed("Victoria and Albert sausage", "Sausage", "Delicious sausage", 6, "Pork, " +
                "mustard, horseradish");
        victoria.addAllergen("Gluten");
        victoria.addAllergen("Egg");
        victoria.addAllergen("Mustard");

        Processed chickenapple = new Processed("Chicken and Apple", "Sausage", "Delicious chicken sausage", 7,
                "Chicken, apple");
        chickenapple.addAllergen("Gluten");
        chickenapple.addAllergen("Egg");

        Processed honeymild = new Processed("Honey Mild", "Sausage", "Delicious honey mild sausage", 7, "Pork, honey");
        honeymild.addAllergen("Gluten");
        honeymild.addAllergen("Egg");

        Processed beefSausage = new Processed("Gluten free beef sausage", "Sausage", "Delicious gluten free beef " +
                "sausage with artificial casing", 7, "Beef, can't remember anything else");

        Processed allumium = new Processed("Gluten free Allumium pork", "Sausage", "Delicious gluten free pork " +
                "sausage", 7, "Pork");




        //non food

        NonFood cookbook = new NonFood("Lidgates Cook book", "Book", "Cook book", 25, "Danny Lidgate");

        NonFood string = new NonFood("Professional butchers string", "Cooking accessories", "Professional butchers",
                3, "Katie String");

        NonFood thermometer = new NonFood("Meat thermometre", "Cooking accessories", "Neat testy meat heat", 6, "Hot " +
                "Stix");


    }
}

