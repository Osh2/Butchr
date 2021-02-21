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
        User user1 = new User("sherlock Holmes", "sherlock.holmes@outlook.com", "02087047780", "221b Baker Street", 40);
        userRepository.save(user1);

        User user2 = new User("James Bond", "james.bond@zoho.com", "02038805903", "30 Wellington Square, Chelsea", 36);
        userRepository.save(user2);



        Meat meat1 = new Meat("Free Range", "Chicken", "Amazing Organic Free Range Chicken", 24, "https://www.iheartnaptime.net/wp-content/uploads/2019/10/baked-whole-chicken.jpg", "Whole");
        itemRepository.save(meat1);

        Meat meat2 = new Meat("Free Range", "Chicken", "Free Range Chicken",  17, "https://www.abelandcole.co.uk/media/1112_12934_z.jpg", "Thighs");
        meat2.setUser(user1);
        itemRepository.save(meat2);

//        Meat meat3 = new Meat( "Free Range", "Chicken", "Free Range Chicken Fillet", 3, "Fillet");
//        itemRepository.save(meat3);
//
//        Meat meat4 = new Meat(  "Free Range", "Chicken", "Free Range Chicken Legs", 2, "Leg");
//        meat4.setUser(user2);
//        itemRepository.save(meat4);
//
//        Meat meat5 = new Meat("Free Range", "Chicken", "Free Range Chicken Breasts", 4, "Breast");
//        itemRepository.save(meat5);
//
//        Meat meat6 = new Meat(  "Free Range", "Duck", "Duck Breasts", 3, "Breast");
//        itemRepository.save(meat6);
//
//        Meat meat7 = new Meat("Free Range", "Duck", "Duck Legs", 3, "Legs");
//        itemRepository.save(meat7);
//
//        Meat meat8 = new Meat(  "Free Range", "Quail", "Flavoursome Quail", 2, "Whole");
//        itemRepository.save(meat8);
//
//        Meat meat9 = new Meat("Free Range", "Lamb", "Shoulder of Lamb", 31, "Shoulder");
//        itemRepository.save(meat9);
//
//        Meat meat10 = new Meat("Free Range", "Lamb", "Leg of Lamb", 45, "Leg");
//        itemRepository.save(meat10);
//
//        Meat meat11 = new Meat( "Free Range", "Lamb", "Rack of Lamb", 24, "Loin");
//        itemRepository.save(meat11);
//
//        Meat meat12 = new Meat( "Free Range", "Lamb", "Lamb Cutlets", 11, "Loin");
//        itemRepository.save(meat12);
//
//        Meat meat13 = new Meat("Free Range", "Lamb", "Lamb Chop", 7, "Loin");
//        itemRepository.save(meat13);
//
//        Meat meat14 = new Meat("Free Range", "Lamb", "Diced Lamb", 12, "Loin");
//        itemRepository.save(meat14);
//
//        Meat meat15 = new Meat("Free Range", "Lamb", "Minced Lamb", 12, "Loin");
//        itemRepository.save(meat15);
//
//        Meat meat16 = new Meat("Free Range", "Veal", "Plain Veal Escalope", 10, "Topside");
//        itemRepository.save(meat16);
//
//        Meat meat17 = new Meat("Free Range", "Veal", "Loin of Veal", 32, "Loin");
//        itemRepository.save(meat17);
//
//        Meat meat18 = new Meat("Free Range", "Veal", "Veal Chop", 22, "loin");
//        itemRepository.save(meat18);
//
//        Meat meat19 = new Meat("Free Range", "Veal", "Ossobucco", 14, "Shin");
//        itemRepository.save(meat19);
//
//        Meat meat20 = new Meat("Free Range", "Veal", "Diced Veal", 7, "Topside");
//        itemRepository.save(meat20);
//
//        Meat meat21 = new Meat("Free Range", "Veal", "Veal Chop", 22, "loin");
//        itemRepository.save(meat21);
//
//        Meat meat22 = new Meat("Free Range", "Veal", "Minced Veal", 7, "Topside");
//        itemRepository.save(meat22);
//
//        Meat meat23 = new Meat("Steak", "Beef", "Chateaubriande", 29, "Sirloin and Fillet");
//        itemRepository.save(meat23);
//
//        Meat meat24 = new Meat("Steak", "Beef", "Sirloin Steak", 12, "Sirloin and Fillet");
//        itemRepository.save(meat24);
//
//        Meat meat25 = new Meat("Steak", "Beef", "Contre Fillet", 59, "Sirloin and Fillet");
//        itemRepository.save(meat25);
//
//        Meat meat26 = new Meat("Steak", "Beef", "T-Bone Steak", 15, "Sirloin and Fillet");
//        itemRepository.save(meat26);
//
//        Meat meat27 = new Meat("Steak", "Beef", "Wagyu Fillet Steak", 33, "Sirloin and Fillet");
//        meat27.setUser(user1);
//        itemRepository.save(meat27);
//
//        Meat meat28 = new Meat("Steak", "Beef", "Wagyu Sirloin Steak", 42, "Sirloin and Fillet");
//        itemRepository.save(meat28);
//
//        Meat meat29 = new Meat("Steak", "Beef", "Topside", 19, "Topside and Silverside");
//        itemRepository.save(meat29);
//
//        Meat meat30 = new Meat("Steak", "Beef", "Flat Iron Steak", 3, "Chuck");
//        itemRepository.save(meat30);
//
//        Meat meat31 = new Meat("Steak", "Beef", "Diced Steak", 7, "Chuck");
//        itemRepository.save(meat31);
//
//        Meat meat32 = new Meat("Steak", "Beef", "Minced Steak", 6, "Chuck");
//        itemRepository.save(meat32);
//
//        Meat meat33 = new Meat("Burger", "Beef", "Wagyu Beef Burger", 3, "Chuck");
//        itemRepository.save(meat33);
//
//        Meat meat34 = new Meat("Burger", "Beef", "Highgrove Burger", 3, "Chuck");
//        itemRepository.save(meat34);
//
//        Meat meat35 = new Meat("Burger", "Beef", "Steak Burger", 2, "Chuck");
//        itemRepository.save(meat35);
//
//        Meat meat36 = new Meat("Brisket", "Beef", "Beef Brisket Roasting Joint", 11, "Brisket");
//        itemRepository.save(meat36);
//
//        Meat meat37 = new Meat("Steak", "Beef", "Herb Crusted Flank Steak", 10, "Fore Quarter Flank");
//        itemRepository.save(meat37);
//
//        Meat meat38 = new Meat( "Steak", "Beef", "Flank Steak", 6, "Fore Quarter Flank");
//        itemRepository.save(meat38);
//
//        Meat meat39 = new Meat(    "Steak", "Beef", "Rib Eye Steak", 13, "Fore Ribs");
//        itemRepository.save(meat39);
//
//        Meat meat40 = new Meat("Steak", "Beef", "Wagyu Rib Eye Steak", 42, "Fore Ribs");
//        itemRepository.save(meat40);
//
//        Meat meat41 = new Meat("Steak", "Beef", "Rib Roast", 43, "Fore Ribs");
//        itemRepository.save(meat41);
//
//        Meat meat42 = new Meat("Steak", "Beef", "Beef Short Ribs", 6, "Fore Ribs");
//        itemRepository.save(meat42);
//
//        Meat meat43 = new Meat("Steak", "Beef", "Rump Steak", 3, "Rump"
//        );
//        itemRepository.save(meat43);
//
//        Meat meat44 = new Meat( "Steak", "Beef", "Rump Slice marinated", 3, "Rump");
//        itemRepository.save(meat44);
//
//        Meat meat45 = new Meat("Steak", "Beef", "Beef Shin Boneless", 9, "Shin");
//        itemRepository.save(meat45);
//
//        Meat meat46 = new Meat("Steak", "Beef", "Beef Diced Shin", 6, "Shin");
//        itemRepository.save(meat46);
//
//        Meat meat47 = new Meat("Steak", "Beef", "Ox Cheek", 2, "Ox Cheek");
//        itemRepository.save(meat47);
//
//        Meat meat48 = new Meat("Steak", "Beef", "Ox Tail", 15, "Ox Tail");
//        itemRepository.save(meat48);
//
//        Meat meat49 = new Meat( "Steak", "Beef", "Bravette", 6, "Chump");
//        itemRepository.save(meat49);
//
//        Meat meat50 = new Meat("Steak", "Beef", "Scotch Fillet Steak", 26, "Fillet");
//        itemRepository.save(meat50);
//
//        Meat meat51 = new Meat( "Steak", "Beef", "Whole Scotch Fillet Steak", 114, "Fillet");
//        itemRepository.save(meat51);



//        Processed saus = new Processed("Forman Smoked Salmon", "Sausage", "Smoked Salmon Sausage", 12, "Salmon, smoked and poached");
//
//        Meat meat3 = new Meat("Chicken Fillet", "Poultry", "Herb fed, free range chicken fillet", 10, "Fillet");
//
//        Meat meat4 = new Meat("Chicken leg", "Poultry", "Herb fed, free range chicken leg", 3, "Leg");
//
//        Meat meat5 = new Meat("Chicken thigh", "Poultry", "Skinless, boneless chicken thigh", 1.50,
//                "Thigh");
//
//        Meat meat6 = new Meat("Free Range Chicken", "Poultry", "Herb fed, free range chicken", 20, "Whole bird");
//
//        Meat meat7 = new Meat("Organic Chicken", "Poultry", "Corn fed organic free range chicken", 25, "Whole bird");
//
//        Meat meat8 = new Meat("Duck breast", "Poultry", "Farmed female duck breast", 3.50, "Breast");
//
//        Meat meat9 = new Meat("Duck leg confit", "Poultry", "Duck leg onfit", 10.10, "Leg");
//
//        Meat meat10 = new Meat("Whole duck", "Poultry", "Free range, farmed duck", 25, "Whole bird");
//
//        Meat meat11 = new Meat("Pheasant", "Game", "Yorkshire pheasant, idk", 4.25, "Whole bird");
//
//        Meat meat12 = new Meat("Grouse", "Game", "Yorkshire grouse, idk", 12.50, "Whole bird");
//
//        Meat meat13 = new Meat("Quail", "Game", "Teeny, tiny Norfolk quail", 3, "Whole bird");
//
//        Meat meat14 = new Meat("Pork tenderloin", "Pork", "Delicious pork tenderloin", 9, "Tenderloin");
//
//        Meat meat15 = new Meat("Pork belly", "Pork", "Delicious pork belly", 7, "Belly");
//
//        Meat meat16 = new Meat("Pork Chops", "Pork", "Delicious pork chops", 4.5, "Loin chops");
//
//        Meat meat17 = new Meat("Spareribs", "Pork", "Delicious pork spareribs", 9, "Ribs");
//
//        Meat meat18 = new Meat("Lamb shoulder", "Lamb", "Delicious lamb shoulder", 45, "Shoulder");
//
//        Meat meat19 = new Meat("Leg of Lamb", "Lamb", "Delicious leg of lamb", 45, "Leg");
//
//        Meat meat20 = new Meat("Lamb cutlets", "Lamb", "Delicious lamb cutlets", 18, "Trimmed ribs");
//
//        Meat meat21 = new Meat("Lamb chops", "Lamb", "Delicious lamb chops", 10, "Loin chops");
//
//        Meat meat22 = new Meat("Rack of lamb", "Lamb", "Delicious lamb rack", 25, "Rack");
//
//        Meat meat23 = new Meat("Rump Steak", "Beef", "Delicious rump steak", 14, "Rump steak");
//
//        Meat meat24 = new Meat("Ribeye steak", "Beef", "Delicious ribeye steak", 18, "Ribeye");
//
//        Meat meat25 = new Meat("Sirloin steak", "Beef", "Delicious sirloin steak", 18, "Sirloin");
//
//        Meat meat26 = new Meat("T-Bone steak", "Beef", "Delicious T-Bone steak ", 25, "T-Bone");
//
//        Meat meat27 = new Meat("Fillet steak", "Beef", "Delicious fillet steak", 18, "Fillet");
//
//        Meat meat28 = new Meat("Contre Fillet ", "Beef", "Delicious contre fillet", 58, "Rolled sirloin");
//
//        Meat meat29 = new Meat("Rib of Beef", "Beef", "Delicious rob of beef", 68, "Ribeye on the bone");
//
//        Meat meat30 = new Meat("Short ribs", "Beef", "Delicious ribeye stea ", 18, "Ribeye");
//
//        Meat meat31 = new Meat("Casserole steak", "Beef", "Delicious casserole stea ", 8, "Diced Beef");
//
//        Meat meat32 = new Meat("Brisket", "Beef", "Delicious brisket", 18, "Brisket");
//
//        Meat meat33 = new Meat("Minced beef", "Beef", "Delicious minced steak", 6, "Minced steak");
//
//        Meat meat34 = new Meat("Veal Chops", "Veal", "Delicious dutch veal chop", 12, "T-bone steak");
//
//        Meat meat35 = new Meat("Veal Escalope", "Veal", "Delicious dutch veal escolope", 8, "Topside escalopes");
//
//        Meat meat36 = new Meat("Diced Veal", "Veal", "Delicious diced veal", 12, "Diced veal bavette");
//
//
//
//
//
//
//
//
//        Processed saus = new Processed("Cumberland", "Sausage", "Delicious sausage in sausage form", 6, "Pork, herbs, seasonings, others");
//        saus.addAllergen("Gluten");
//        saus.addAllergen("Egg");
//        itemRepository.save(saus);

//        Processed kiev = new Processed("Chicken Kiev", "Kiev", "Amazing Chicken Kiev", 4, "Chicken, garlic butter and breadcrumb coat");
//        kiev.addAllergen("Gluten");
//        kiev.addAllergen("Egg");
//        itemRepository.save(kiev);
//
//        Processed escalope1 = new Processed("Breaded Chicken Escalope", "Escalope", "Traditional Chicken Escalope", 2, "Chicken, light seasoning and breadcrumb coat");
//        escalope1.addAllergen("Gluten");
//        escalope1.addAllergen("Egg");
//        itemRepository.save(escalope1);
//
//        Processed burger = new Processed("Chicken Burgers", "Burgers", "Hand made Chicken Burgers", 2, "Chicken, parsley, light seasoning and breadcrumb coat");
//        burger.addAllergen("Gluten");
//        burger.addAllergen("Egg");
//        itemRepository.save(burger);
//
//        Processed nuggets = new Processed("Chicken Nuggets", "Nuggets", "Free Range Chicken Nuggets", 2, "Chicken, light seasoning and breadcrumb coat");
//        nuggets.addAllergen("Gluten");
//        nuggets.addAllergen("Egg");
//        itemRepository.save(nuggets);
//
//        Processed saus1 = new Processed("Chicken and Asparagus", "Sausage", "Chicken and Asparagus Sausages", 5, "Chicken, asparagus, pistachio nuts, tarragon and spices"
//        );
//        itemRepository.save(saus1);
//
//        Processed saus2 = new Processed("Chicken and Apple", "Sausage", "Delicious Chicken and Apple Sausages", 4, "Chicken, made sweet and mild with apple"
//        );
//        itemRepository.save(saus2);
//
//        Processed confit = new Processed("Duck Leg Confit", "Confit", "Succulent Duck Leg Confit", 10, "Duck, seasoning."
//        );
//        itemRepository.save(confit);
//
//        Processed escalope2 = new Processed("Breaded Turkey Escalope", "Escalope", "Breaded Turkey Escalope", 12, "Turkey, lemon and parsley breadcrumb coat");
//        escalope2.addAllergen("Gluten");
//        escalope2.addAllergen("Egg");
//        itemRepository.save(escalope2);
//
//        Processed saus3 = new Processed("Gluten Free Beef", "Sausage", "Gluten Free Beef Sausages", 4, "Beef, parsley, chives and garlic"
//        );
//        itemRepository.save(saus3);
//
//        Processed saus4 = new Processed("Wild Boar", "Sausage", "Wild Boar Sausages", 6, "Wild Boar, marinated with sherry, herbs and spices"
//        );
//        saus4.addAllergen("Gluten");
//        saus4.addAllergen("Egg");
//        itemRepository.save(saus4);
//
//        Processed saus5 = new Processed("Cumbernauld", "Sausage", "Juicy Cumberland Sausages", 5, "Pork, medium spiced traditional recipe with sage"
//        );
//        saus5.addAllergen("Gluten");
//        saus5.addAllergen("Egg");
//        itemRepository.save(saus5);
//
//        Processed saus6 = new Processed("Cumbernauld & Wild Garlic", "Sausage", "Cumberland & Wild Garlic", 6, "Pork, medium spiced traditional recipe with sage and fresh wild garlic"
//        );
//        saus6.addAllergen("Gluten");
//        saus6.addAllergen("Egg");
//        itemRepository.save(saus6);
//
//        Processed saus7 = new Processed("Chipolata", "Sausage", "Juicy Chipolata Sausages", 6, "Pork, lightly spiced and low in salt"
//        );
//        saus7.addAllergen("Gluten");
//        saus7.addAllergen("Egg");
//        itemRepository.save(saus7);
//
//        Processed saus8 = new Processed("Cocktail", "Sausage", "Delicious Cocktail Sausages", 6, "Pork, lightly spiced and low in salt"
//        );
//        saus8.addAllergen("Gluten");
//        saus8.addAllergen("Egg");
//        itemRepository.save(saus8);
//
//        Processed saus9 = new Processed("Frankfurters", "Sausage", "Fantastic Frankfurters", 2, "Pork, traditional German pork recipe"
//        );
//        saus9.addAllergen("Gluten");
//        saus9.addAllergen("Egg");
//        itemRepository.save(saus9);
//
//        Processed bacon1 = new Processed("Streaky Bacon", "Bacon", "Smoked Streaky Bacon", 3, "Pork, mildly smoked"
//        );
//        itemRepository.save(bacon1);
//
//        Processed bacon2 = new Processed("Streaky Bacon", "Bacon", "Unsmoked Streaky Bacon", 3, "Pork, mildly cured, low salt"
//        );
//        itemRepository.save(bacon2);
//
//        Processed bacon3 = new Processed("Maple Back Bacon", "Bacon", "Maple Back Bacon", 5, "Pork, cured with sweet maple"
//        );
//        itemRepository.save(bacon3);
//
//
//        NonFood item = new NonFood("Coal", "Fuel", "Burny", 4, "Pete's Coal");
//        item.setUser(user1);
//        itemRepository.save(item);
//
//        NonFood item1 = new NonFood("Meat Thermometer", "Meat Temperature gauge", "Digital Thermometer", 14, "Meater+");
//        itemRepository.save(item1);
//
//        NonFood item2 = new NonFood("Voucher", "Gift Voucher", "£25 Gift Voucher", 25, "Vouchers4U");
//        item.setUser(user2);
//        itemRepository.save(item2);
//
//
//// sausage
//
//        Processed cumberland = new Processed("Cumberland sausage", "Sausage", "Delicious sausage in sausage form", 6,
//                "Pork, herbs, seasonings, others");
//        cumberland.addAllergen("Gluten");
//        cumberland.addAllergen("Egg");
//
//
//
//        Processed gloucester = new Processed("Gloucester old spot sausage", "Sausage", "Delicious sausage in sausage " +
//                "form", 6, "Pork, herbs, seasonings, others");
//        gloucester.addAllergen("Gluten");
//        gloucester.addAllergen("Egg");
//
//
//        Processed toulouse = new Processed("Toulouse", "Sausage", "Delicious sausage in sausage form", 6, "Pork, veal, herbs, seasonings, others");
//        toulouse.addAllergen("Gluten");
//        toulouse.addAllergen("Egg");
//
//        Processed chillisaus = new Processed("Chilli and fennel sausage", "Sausage", "Delicious sausage in sausage ",
//                6, "Pork, chilli, fennel , herbs, seasonings, others");
//        chillisaus.addAllergen("Gluten");
//        chillisaus.addAllergen("Egg");
//
//        Processed victoria = new Processed("Victoria and Albert sausage", "Sausage", "Delicious sausage", 6, "Pork, " +
//                "mustard, horseradish");
//        victoria.addAllergen("Gluten");
//        victoria.addAllergen("Egg");
//        victoria.addAllergen("Mustard");
//
//        Processed chickenapple = new Processed("Chicken and Apple", "Sausage", "Delicious chicken sausage", 7,
//                "Chicken, apple");
//        chickenapple.addAllergen("Gluten");
//        chickenapple.addAllergen("Egg");
//
//        Processed honeymild = new Processed("Honey Mild", "Sausage", "Delicious honey mild sausage", 7, "Pork, honey");
//        honeymild.addAllergen("Gluten");
//        honeymild.addAllergen("Egg");
//
//        Processed beefSausage = new Processed("Gluten free beef sausage", "Sausage", "Delicious gluten free beef " +
//                "sausage with artificial casing", 7, "Beef, can't remember anything else");
//
//        Processed allumium = new Processed("Gluten free Allumium pork", "Sausage", "Delicious gluten free pork " +
//                "sausage", 7, "Pork");
//
//
//
//
//        //non food
//
//        NonFood cookbook = new NonFood("Lidgates Cook book", "Book", "Cook book", 25, "Danny Lidgate");
//
//        NonFood string = new NonFood("Professional butchers string", "Cooking accessories", "Professional butchers",
//                3, "Katie String");
//
//        NonFood thermometer = new NonFood("Meat thermometre", "Cooking accessories", "Neat testy meat heat", 6, "Hot " +
//                "Stix");
//
//
//    }
}}

