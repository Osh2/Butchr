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
        User user1 = new User("sherlock Holmes", "sherlock.holmes@outlook.com", 02087047780, "221b Baker Street", 40);
        userRepository.save(user1);

        User user2 = new User("Hercule Poirot", "hercule.poirot@aol.com", 02083473422, "56B Whitehavens Mansions", 58);
        userRepository.save(user2);

        User user3 = new User("Paddington Bear", "paddington.bear@yahoo.com", 02033150554, "32 Windsor Gardens", 12);
        userRepository.save(user3);

        User user4 = new User("Sweeney Todd", "sweeney.todd@outlook.com", 02035339625, "186 Fleet Street", 31);
        userRepository.save(user4);

        User user5 = new User("Great Uncle Bulgaria", "bulgaria.womble@hotmail.com", 02088361453,  "Wimbledon Common", 63);
        userRepository.save(user5);

        User user6 = new User("Mary Poppins", "mary.poppins@gmail.com", 02084972723, "17 Cherry Tree Lane," 29);
        userRepository.save(user6);

        User user7 = new User("Fagin", "fagin@zoho.com", 02082915201, "Saffron Hill", 57);
        userRepository.save(user7);

        User user8 = new User("Peter Pan", "peter.pan@mail.com", 02085395519, "31 Kensington Park Gardens", 10);
        userRepository.save(user8);

        User user9 = new User("Phileas Fogg", "phileas.fogg@btinternet.com", 02086187613, "7 Savile Row, Burlington Gardens", 31);
        userRepository.save(user9);

        User user10 = new User("Lady Marjorie Bellamy", "marjorie.bellamy@aol.com", 02037768743, "165 Eaton Place", 33);
        userRepository.save(user10);

        User user11 = new User("James Bond", "james.bond@zoho.com", 02038805903, "30 Wellington Square, Chelsea", 36);
        userRepository.save(user11);

        User user12 = new User("Bridget Jones", "bridget.jones@mail.com", 02038696256, "8 Bedale Street", 26);
        userRepository.save(user12);

        User user13 = new User("Dr Henry Jekyl", "henry.jekyl@gmail.com", 02031892862, "28 Leicester Square", 44);
        userRepository.save(user13);

        User user14 = new User("Mrs Dearly", "anita.dearly@hotmail.com", 02034775638, "Outer Circle, The Regent's Park", 24);
        userRepository.save(user14);

        User user15 = new User("George Smiley", "george.smiley@outlook.com", 02088687708, "9 Bywater Street, Chelsea", 64);
        userRepository.save(user15);

        User user16 = new User("Winston Smith", "winston.smith@hotmail.com", 02033004574, "27b Canonbury Square", 37);
        userRepository.save(user16);

        User user17 = new User("Count Dracula", "count.dracula@mail.com", 02037444469, "Eon House, 138 Piccadilly", 121);
        userRepository.save(user17);

        User user18 = new User("Adolf Verloc", "adolf.verloc@zoho.com", 02035878165, "32 Brett Street, Soho", 46);
        userRepository.save(user18);

        User user19 = new User("Henry Higgins", "henry.higgins@btinternet.com", 02083355326, "27a Wimpole Street", 52);
        userRepository.save(user19);

        User user20 = new User("Lemuel Gulliver", "lemuel.gulliver@aol.com", 02084725290, "Fetter Lane, Old Jewry and Wapping", 29);
        userRepository.save(user20);




        Meat meat1 = new Meat("Free Range", "Chicken", "Amazing Organic Free Range Chicken", 24, "Whole");
        itemRepository.save(meat1);

        Meat meat2 = new Meat("Free Range", "Chicken", "Free Range Chicken", 17, "Whole");
        meat2.setUser(user1);
        itemRepository.save(meat2);

        Meat meat3 = new Meat( "Free Range", "Chicken", "Free Range Chicken Fillet", 3, "Fillet");
        meat3.setUser(user12);
        itemRepository.save(meat3);

        Meat meat4 = new Meat(  "Free Range", "Chicken", "Free Range Chicken Legs", 2, "Leg");
        meat4.setUser(user2);
        itemRepository.save(meat4);

        Meat meat5 = new Meat("Free Range", "Chicken", "Free Range Chicken Breasts", 4, "Breast");
        itemRepository.save(meat5);

        Meat meat6 = new Meat(  "Free Range", "Duck", "Duck Breasts", 3, "Breast");
        meat6.setUser(user13);
        itemRepository.save(meat6);

        Meat meat7 = new Meat("Free Range", "Duck", "Duck Legs", 3, "Legs");
        itemRepository.save(meat7);

        Meat meat8 = new Meat(  "Free Range", "Quail", "Flavoursome Quail", 2, "Whole");
        meat8.setUser(user5);
        itemRepository.save(meat8);

        Meat meat9 = new Meat("Free Range", "Lamb", "Shoulder of Lamb", 31, "Shoulder");
        meat9.setUser(user20);
        itemRepository.save(meat9);

        Meat meat10 = new Meat("Free Range", "Lamb", "Leg of Lamb", 45, "Leg");
        meat10.setUser(user3);
        itemRepository.save(meat10);

        Meat meat11 = new Meat( "Free Range", "Lamb", "Rack of Lamb", 24, "Loin");
        meat11.setUser(user8);
        itemRepository.save(meat11);

        Meat meat12 = new Meat( "Free Range", "Lamb", "Lamb Cutlets", 11, "Loin");
        meat12.setUser(user4);
        itemRepository.save(meat12);

        Meat meat13 = new Meat("Free Range", "Lamb", "Lamb Chop", 7, "Loin");
        itemRepository.save(meat13);

        Meat meat14 = new Meat("Free Range", "Lamb", "Diced Lamb", 12, "Loin");
        itemRepository.save(meat14);

        Meat meat15 = new Meat("Free Range", "Lamb", "Minced Lamb", 12, "Loin");
        meat15.setUser(user10);
        itemRepository.save(meat15);

        Meat meat16 = new Meat("Free Range", "Veal", "Plain Veal Escalope", 10, "Topside");
        meat16.setUser(user19);
        itemRepository.save(meat16);

        Meat meat17 = new Meat("Free Range", "Veal", "Loin of Veal", 32, "Loin");
        meat17.setUser(user6);
        itemRepository.save(meat17);

        Meat meat18 = new Meat("Free Range", "Veal", "Veal Chop", 22, "loin");
        meat18.setUser(user14);
        itemRepository.save(meat18);

        Meat meat19 = new Meat("Free Range", "Veal", "Ossobucco", 14, "Shin");
        itemRepository.save(meat19);

        Meat meat20 = new Meat("Free Range", "Veal", "Diced Veal", 7, "Topside");
        itemRepository.save(meat20);

        Meat meat21 = new Meat("Free Range", "Veal", "Veal Chop", 22, "loin");
        meat21.setUser(user5);
        itemRepository.save(meat21);

        Meat meat22 = new Meat("Free Range", "Veal", "Minced Veal", 7, "Topside");
        meat22.setUser(user16);
        itemRepository.save(meat22);

        Meat meat23 = new Meat("Steak", "Beef", "Chateaubriande", 29, "Sirloin and Fillet");
        meat23.setUser(user7);
        itemRepository.save(meat23);

        Meat meat24 = new Meat("Steak", "Beef", "Sirloin Steak", 12, "Sirloin and Fillet");
        itemRepository.save(meat24);

        Meat meat25 = new Meat("Steak", "Beef", "Contre Fillet", 59, "Sirloin and Fillet");
        itemRepository.save(meat25);

        Meat meat26 = new Meat("Steak", "Beef", "T-Bone Steak", 15, "Sirloin and Fillet");
        itemRepository.save(meat26);

        Meat meat27 = new Meat("Steak", "Beef", "Wagyu Fillet Steak", 33, "Sirloin and Fillet");
        meat27.setUser(user1);
        itemRepository.save(meat27);

        Meat meat28 = new Meat("Steak", "Beef", "Wagyu Sirloin Steak", 42, "Sirloin and Fillet");
        meat28.setUser(user10);
        itemRepository.save(meat28);

        Meat meat29 = new Meat("Steak", "Beef", "Topside", 19, "Topside and Silverside");
        meat29.setUser(user19);
        itemRepository.save(meat29);

        Meat meat30 = new Meat("Steak", "Beef", "Flat Iron Steak", 3, "Chuck");
        meat30.setUser(user4);
        itemRepository.save(meat30);

        Meat meat31 = new Meat("Steak", "Beef", "Diced Steak", 7, "Chuck");
        meat31.setUser(user6);
        itemRepository.save(meat31);

        Meat meat32 = new Meat("Steak", "Beef", "Minced Steak", 6, "Chuck");
        meat32.setUser(user8);
        itemRepository.save(meat32);

        Meat meat33 = new Meat("Burger", "Beef", "Wagyu Beef Burger", 3, "Chuck");
        meat33.setUser(user11);
        itemRepository.save(meat33);

        Meat meat34 = new Meat("Burger", "Beef", "Highgrove Burger", 3, "Chuck");
        meat34.setUser(user11);
        itemRepository.save(meat34);

        Meat meat35 = new Meat("Burger", "Beef", "Steak Burger", 2, "Chuck");
        meat35.setUser(user13);
        itemRepository.save(meat35);

        Meat meat36 = new Meat("Brisket", "Beef", "Beef Brisket Roasting Joint", 11, "Brisket");
        itemRepository.save(meat36);

        Meat meat37 = new Meat("Steak", "Beef", "Herb Crusted Flank Steak", 10, "Fore Quarter Flank");
        itemRepository.save(meat37);

        Meat meat38 = new Meat( "Steak", "Beef", "Flank Steak", 6, "Fore Quarter Flank");
        itemRepository.save(meat38);

        Meat meat39 = new Meat(    "Steak", "Beef", "Rib Eye Steak", 13, "Fore Ribs");
        itemRepository.save(meat39);

        Meat meat40 = new Meat("Steak", "Beef", "Wagyu Rib Eye Steak", 42, "Fore Ribs");
        meat40.setUser(user18);
        itemRepository.save(meat40);

        Meat meat41 = new Meat("Steak", "Beef", "Rib Roast", 43, "Fore Ribs");
        meat41.setUser(user4);
        itemRepository.save(meat41);

        Meat meat42 = new Meat("Steak", "Beef", "Beef Short Ribs", 6, "Fore Ribs");
        meat42.setUser(user20);
        itemRepository.save(meat42);

        Meat meat43 = new Meat("Steak", "Beef", "Rump Steak", 3, "Rump"
        );
        meat43.setUser(user7);
        itemRepository.save(meat43);

        Meat meat44 = new Meat( "Steak", "Beef", "Rump Slice marinated", 3, "Rump");
        meat44.setUser(user9);
        itemRepository.save(meat44;

        Meat meat45 = new Meat("Steak", "Beef", "Beef Shin Boneless", 9, "Shin");
        itemRepository.save(meat45);

        Meat meat46 = new Meat("Steak", "Beef", "Beef Diced Shin", 6, "Shin");
        itemRepository.save(meat46);

        Meat meat47 = new Meat("Steak", "Beef", "Ox Cheek", 2, "Ox Cheek");
        itemRepository.save(meat47);

        Meat meat48 = new Meat("Steak", "Beef", "Ox Tail", 15, "Ox Tail");
        itemRepository.save(meat48);

        Meat meat49 = new Meat( "Steak", "Beef", "Bravette", 6, "Chump");
        meat49.setUser(user18);
        itemRepository.save(meat49);

        Meat meat50 = new Meat("Steak", "Beef", "Scotch Fillet Steak", 26, "Fillet");
        itemRepository.save(meat50);

        Meat meat51 = new Meat( "Steak", "Beef", "Whole Scotch Fillet Steak", 114, "Fillet");
        itemRepository.save(meat51);



        Processed saus = new Processed("Forman Smoked Salmon", "Sausage", "Smoked Salmon Sausage", 12, "Salmon, smoked and poached");
        itemRepository.save(saus);

        Processed kiev = new Processed("Chicken Kiev", "Kiev", "Amazing Chicken Kiev", 4, "Chicken, garlic butter and breadcrumb coat");
        kiev.addAllergen("Gluten");
        kiev.addAllergen("Egg");
        itemRepository.save(kiev);

        Processed escalope = new Processed("Breaded Chicken Escalope", "Escalope", "Traditional Chicken Escalope", 2, "Chicken, light seasoning and breadcrumb coat");
        escalope.addAllergen("Gluten");
        escalope.addAllergen("Egg");
        itemRepository.save(escalope);

        Processed burger = new Processed("Chicken Burgers", "Burgers", "Hand made Chicken Burgers", 2, "Chicken, parsley, light seasoning and breadcrumb coat");
        burger.addAllergen("Gluten");
        burger.addAllergen("Egg");
        itemRepository.save(burger);

        Processed nuggets = new Processed("Chicken Nuggets", "Nuggets", "Free Range Chicken Nuggets", 2, "Chicken, light seasoning and breadcrumb coat");
        nuggets.addAllergen("Gluten");
        nuggets.addAllergen("Egg");
        itemRepository.save(nuggets);

        Processed saus = new Processed("Chicken and Asparagus", "Sausage", "Chicken and Asparagus Sausages", 5, "Chicken, asparagus, pistachio nuts, tarragon and spices"
        );
        itemRepository.save(saus);

        Processed saus = new Processed("Chicken and Apple", "Sausage", "Delicious Chicken and Apple Sausages", 4, "Chicken, made sweet and mild with apple"
        );
        itemRepository.save(saus);

        Processed confit = new Processed("Duck Leg Confit", "Confit", "Succulent Duck Leg Confit", 10, "Duck, seasoning."
        );
        itemRepository.save(confit);

        Processed escalope = new Processed("Breaded Turkey Escalope", "Escalope", "Breaded Turkey Escalope", 12, "Turkey, lemon and parsley breadcrumb coat");
        escalope.addAllergen("Gluten");
        escalope.addAllergen("Egg");
        itemRepository.save(escalope);

        Processed saus = new Processed("Gluten Free Beef", "Sausage", "Gluten Free Beef Sausages", 4, "Beef, parsley, chives and garlic"
        );
        itemRepository.save(saus);

        Processed saus = new Processed("Wild Boar", "Sausage", "Wild Boar Sausages", 6, "Wild Boar, marinated with sherry, herbs and spices"
        );
        saus.addAllergen("Gluten");
        saus.addAllergen("Egg");
        itemRepository.save(saus);

        Processed saus = new Processed("Cumbernauld", "Sausage", "Juicy Cumberland Sausages", 5, "Pork, medium spiced traditional recipe with sage"
        );
        saus.addAllergen("Gluten");
        saus.addAllergen("Egg");
        itemRepository.save(saus);

        Processed saus = new Processed("Cumbernauld & Wild Garlic", "Sausage", "Cumberland & Wild Garlic", 6, "Pork, medium spiced traditional recipe with sage and fresh wild garlic"
        );
        saus.addAllergen("Gluten");
        saus.addAllergen("Egg");
        itemRepository.save(saus);

        Processed saus = new Processed("Chipolata", "Sausage", "Juicy Chipolata Sausages", 6, "Pork, lightly spiced and low in salt"
        );
        saus.addAllergen("Gluten");
        saus.addAllergen("Egg");
        itemRepository.save(saus);

        Processed saus = new Processed("Cocktail", "Sausage", "Delicious Cocktail Sausages", 6, "Pork, lightly spiced and low in salt"
        );
        saus.addAllergen("Gluten");
        saus.addAllergen("Egg");
        itemRepository.save(saus);

        Processed saus = new Processed("Frankfurters", "Sausage", "Fantastic Frankfurters", 2, "Pork, traditional German pork recipe"
        );
        saus.addAllergen("Gluten");
        saus.addAllergen("Egg");
        itemRepository.save(saus);

        Processed bacon = new Processed("Streaky Bacon", "Bacon", "Smoked Streaky Bacon", 3, "Pork, mildly smoked"
        );
        itemRepository.save(bacon);

        Processed bacon = new Processed("Streaky Bacon", "Bacon", "Unsmoked Streaky Bacon", 3, "Pork, mildly cured, low salt"
        );
        itemRepository.save(bacon);

        Processed bacon = new Processed("Maple Back Bacon", "Bacon", "Maple Back Bacon", 5, "Pork, cured with sweet maple"
        );
        itemRepository.save(bacon);


        NonFood item = new NonFood("Coal", "Fuel", "Burny", 4, "Pete's Coal");
        item.setUser(user1);
        itemRepository.save(item);

        NonFood item = new NonFood("Meat Thermometer", "Meat Temperature gauge", "Digital Thermometer", 14, "Meater+");
        item.setUser(user3);
        itemRepository.save(item);

        NonFood item = new NonFood("Voucher", "Gift Voucher", "£25 Gift Voucher", 25, "Vouchers4U");
        item.setUser(user2);
        itemRepository.save(item);


    }
}
