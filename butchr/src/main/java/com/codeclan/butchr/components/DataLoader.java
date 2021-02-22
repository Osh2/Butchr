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



        Meat meat1 = new Meat("Free Range Chicken", "Chicken", "Free Range herb fed Chicken. These chickens live in small flocks. They forage on grasses and herbs across Sladesdown Farms Devon pastures. We believe a natural habitat and diet makes these chickens taste even better.", 20, "https://www" +
                "https://fd-v5-api.imgix.net/assets/product_images/e3d6bfe6b1dd0af50afb83e36b67f98e0f502e427db2e6cc269d88d22add3656/Wood_Green_Farm_Organic_Whole_ChickenFD20_Nov17.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=745&exp=0&crop=undefined", "Whole");
        itemRepository.save(meat1);

        Meat meat2 = new Meat("Organic Chicken", "Chicken", "Organic and Free Range, corn fed Chicken. These chickens live in small flocks. They forage on grasses and herbs across Sladesdown Farms Devon pastures. We believe a natural habitat and diet makes these chickens taste even better.",  25, "https://www.farmison.com/thumbs/whole-chicken.7c2704a2-e647-4bdf-9643-dbd3bee8db8c.square.900x900.jpg", "Whole");
        meat2.setUser(user1);
        itemRepository.save(meat2);

        Meat meat3 = new Meat( "2 Free Range Chicken Fillets", "Chicken", "Free Range Chicken Fillet, skinless and boneless",
                9.58,
                "https://fd-v5-api.imgix.net/assets/product_images/6070cccbe66764e04e9463c25f438fe155c85c9ef0d63948559d308de1901309/Fosse_Chicken-094.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=645&exp=0&crop=undefined", "Fillet");
        itemRepository.save(meat3);

        Meat meat4 = new Meat( "2 Free Range Chicken Legs", "Chicken", "Free Range Chicken Legs", 4.63, "https://fd-v5-api.imgix.net/assets/product_images/b9895b5980e9d667491c46b804facf10a922b91b02d814b321ed756df0c7bff5/Wood_Green_Farm_-_leg_bone_inFarmdrop17_Aug101669.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=645&exp=0&crop=undefined","Leg");
        meat4.setUser(user2);
        itemRepository.save(meat4);

        Meat meat5 = new Meat("2 Free Range Chicken Breasts", "Chicken", "Free Range Chicken Breasts with skin", 7.87, "https://fd-v5-api.imgix.net/assets/product_images/4998a771ac09fdce1855e32bc71160e5c7d3b92aa49711a0acf4ad219eb7d1e2/Fosse_Chicken-097.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=645&exp=0&crop=undefined", "Breast");
        itemRepository.save(meat5);

        Meat meat6 = new Meat( "2 Free Range Farmed Duck Breasts", "Duck", "Duck Breasts", 12.40, "https://fd-v5-api.imgix.net/assets/product_images/dc40d8246ff010770660d2ceb8cf022284833d0dfecffe95062d3467a7f9f4d4/Sladesdown_FR_duck_breastFramdrop19_May731495.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=645&exp=0&crop=undefined", "Breast");
        itemRepository.save(meat6);

        Meat meat7 = new Meat("2 Free Range Farmed Duck Legs", "Duck", "Duck Legs", 7.60, "https://fd-v5-api.imgix" +
                ".net/assets/product_images/0ac9c0ad200b78ffa3be663e450588fcdc15dd0732b5e4a325951f58a6cdb4e8/Sladesdown_FR_duck_legFramdrop19_May731493.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=645&exp=0&crop=undefined","Legs");
        itemRepository.save(meat7);

        Meat meat8 = new Meat(  "Norfolk Quail", "Quail", "Teeny tiny Norfolk Quail", 4.25,"https://img.freepik.com/free-photo/fresh-organic-whole-quails-meat-top-view-dark-wooden-table_249006-3383.jpg?size=626&ext=jpg&ga=GA1.2.490548387.1611913643", "Whole");
        itemRepository.save(meat8);

        Meat meat9 = new Meat("Sholulder of Lamb", "Lamb", "Grass Fed Organic Shoulder of Lamb", 46, "https://fd-v5-api.imgix.net/assets/product_images/56c803e97fc22d7eab3952de07ea306dcf654a85a4e269472a3360cf3f12b6e4/Proper_Food_Collective_Organic_Lamb_ShoulderUntitled_Capture1507.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Shoulder");
        itemRepository.save(meat9);

        Meat meat10 = new Meat("Leg of Lamb", "Lamb", "Grass Fed Organic Leg of Lamb", 55.47, "https://fd-v5-api" +
                ".imgix.net/assets/product_images/87899fc89dfca6fac8751445b627234022ec762c48645e5e0f3f6ab07ddf49b8/Horton_HOuse_100__Pasture_Fed_Organic_Leg_of_LambFD20_Sept7.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Leg");
        itemRepository.save(meat10);

        Meat meat11 = new Meat( "Rack of Lamb", "Lamb", "French Trim Organic Pasture Fed Rack of Lamb", 32.34, "https://fd-v5-api.imgix.net/assets/product_images/fe74cb02da1bff769685bfeb5a2d243b0bed98b575f54f840223533e2cba0f1b/lamb_rack.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined",
                "Loin");
        itemRepository.save(meat11);

        Meat meat12 = new Meat( "4 Lamb Cutlets", "Lamb", "Organic Pasture Fed Lamb Cutlets", 10.55, "https://fd-v5-api.imgix" +
                ".net/assets/product_images/2b598fd4eda68022abaf0890f0c6f8b38aff324f1689445743ad9553b02d3f62/lamb_cutlets201.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Loin");
        itemRepository.save(meat12);

        Meat meat13 = new Meat("2 Lamb Chops", "Lamb", "Organic Pasture Fed Lamb Lamb Chop", 7, "https://fd-v5-api.imgix.net/assets/product_images/c00bbab2b6032b1f66d03e0c70dae7a3c72a72d918762b803c216ffb9e7d5ec2/Park_farm_romney_lamb_chopsFD20_July130784.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Loin");
        itemRepository.save(meat13);

        Meat meat14 = new Meat("500g Diced Lamb", "Lamb", "Diced Lamb", 11.60, "https://fd-v5-api.imgix" +
                ".net/assets/product_images/c8618d515223e5700654b6dabc01422142be35b1a3ba1e3c714973ee996c0d23/Fernhill_farm_diced_lambFD20_July210841.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Loin");
        itemRepository.save(meat14);

        Meat meat15 = new Meat("500g Minced Lamb", "Lamb", "Minced Lamb", 11.60, "https://fd-v5-api.imgix.net/assets/product_images/494bf97f36585a1f3f6d6e81dfd758509978dd88bfe7f033a2807684e0902a39/lamb_mince.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined","Loin");
        itemRepository.save(meat15);

        Meat meat16 = new Meat("Veal Escalope", "Veal", "Grass Fed French Veal Escalopes", 9.40, "https://fd-v5-api.imgix.net/assets/product_images/a1bbeffdb95d31185db9ad1f3f7242688388eddf41812bb7f209b6f27876ce33/PFC_veal_escalope_Farmdrop19_Oct237178.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined","Topside");
        itemRepository.save(meat16);

        Meat meat17 = new Meat("Loin of Veal", "Veal", "Grass Fed French Loin of Veal", 42, "https://fd-v5-api.imgix" +
                ".net/assets/product_images/19960628752ba3aeefbad044f2b996339da471b16c2a867aa38a7263710d85ae/Horton_house_veal__sirlion_joint_Farmdrop19_Nov538367.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined","Loin");
        itemRepository.save(meat17);

        Meat meat18 = new Meat("Veal Chop", "Veal", "Dutsch Veal Chop", 14.50, "https://www.lidgates" +
                ".com/asset/151/427/285", "T-Bone Chop");
        itemRepository.save(meat18);

        Meat meat19 = new Meat("Ossobucco", "Veal", "Ossobucco", 10.95, "https://www.farmison.com/thumbs/osso-bucco" +
                ".4328e719-8ee4-422d-aa20-585692c91526.square.900x900.jpg","Shin");
        itemRepository.save(meat19);

        Meat meat20 = new Meat("Diced Veal 500g", "Veal", "Grass Fed French Diced Veal", 8.75, "https://fd-v5-api.imgix.net/assets/product_images/04507a381b572e4d08fbd455fac98abf0abd0301b02006adf3b14510377cdf0b/Horton_house_veal_diced_Farmdrop19_Sept335610.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined","Topside");
        itemRepository.save(meat20);

        Meat meat21 = new Meat("Minced Veal 500g", "Veal", "rass Fed French Minced Veal", 8.75,"https://fd-v5-api.imgix.net/assets/product_images/5b3c4190c22faf2007a8d6bde9cb4d88d789338a91f51e450c6ffdd09f5d2603/Horton_house_veal_mince_Farmdrop19_Sept335609.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Topside");
        itemRepository.save(meat21);

        Meat meat24 = new Meat("1 Sirloin Steak, 250g", "Beef", "Grass Fed 28 days aged Aberdeen Angus Sirloin Steak"
                ,12, "https://fd-v5-api.imgix.net/assets/product_images/26584b259afdf456b348209d7878cd34543a5994bfbf6a929087496ab5dbdbf8/Haye_Farm_SirloinFD20_Nov17_1.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Sirloin");
        itemRepository.save(meat24);

        Meat meat25 = new Meat("Contre Fillet", "Beef", "Grass Fed 28 days aged Aberdeen Angus Contre Fillet", 59, "https://fd-v5-api.imgix.net/assets/product_images/111fd542b389cfd7e7cbe2b2c1de77cbd80f5696dd571cf51f2cdc74ed7ab0c2/rolled_sirloin.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined",
                "Sirloin");
        itemRepository.save(meat25);

        Meat meat26 = new Meat("1 T-Bone Steak, 500g", "Beef", "Grass Fed 28 days aged Aberdeen Angus T-Bone Steak",
                21.40,
                "https://fd-v5-api.imgix.net/assets/product_images/bbc08c914c870c3215537646f7a5cef96a64fbe64782a24c9893884e9a9ae6b7/t-bone_steak.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Sirloin and Fillet");
        itemRepository.save(meat26);

        Meat meat27 = new Meat("1 Wagyu Fillet Steak 150g", "Beef", "Grass Fed 28 days aged Aberdeen Angus Wagyu Fillet Steak", 58.70, "https://cdn.shopify.com/s/files/1/0021/0862/0858/products/F_W" +
                ".WagyuFilletA5_600x.jpg?v=1590184690",
                "Fillet");
        meat27.setUser(user1);
        itemRepository.save(meat27);

        Meat meat28 = new Meat("1 Wagyu Sirloin Steak 250g", "Beef", "Australian Wagyu Sirloin Steak", 62, "https://robbreport.com/wp-content/uploads/2018/11/crowdcow_kagoa5_004.jpg?w=480", "Sirloin");
        itemRepository.save(meat28);

        Meat meat29 = new Meat("Topside 1kg", "Beef", "Topside", 36.45, "https://fd-v5-api.imgix.net/assets/product_images/0804766deb887819099d9ea86b79ee69579bef9df22b39b572c29e3c2b688ea1/Haye_Farm_Beef_TopsideFD20_Nov17_1.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined","Topside and Silverside");
        itemRepository.save(meat29);

        Meat meat30 = new Meat("Flat Iron Steak", "Beef", "Flat Iron Steak", 7.35, "https://fd-v5-api.imgix.net/assets/product_images/8357be70fb20a1d32cb1571318fdff22fece5447ab7acc9141ce262ee1ceaeca/Screenshot_2019-10-10_at_20.14.05.png?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Chuck");
        itemRepository.save(meat30);

        Meat meat31 = new Meat("Casserole Steak 1kg", "Beef", "Diced Casserole Steak", 14.50, "https://fd-v5-api.imgix.net/assets/product_images/205d87163ef3f813f1ccb50dbd5a9f142672b7f231a87a6cfdde74b8d2699698/Story_stewing_steak_FD20_Sept7.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Chuck");
        itemRepository.save(meat31);

        Meat meat32 = new Meat("Minced Steak", "Beef", "Minced Steak", 6, "https://fd-v5-api.imgix.net/assets/product_images/d9fdf8a1d36e300f764a0215f676fb587c6a42dafe0864acf8bff52e1e9fe845/2HayeFarm171016Matt_Austin.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Chuck");
        itemRepository.save(meat32);

        Meat meat33 = new Meat("2 Wagyu Beef Burgers", "Beef", "Wagyu Beef Burger", 9.00, "https://fd-v5-api.imgix" +
                ".net/assets/product_images/1627d204d28ec5f52e637f51fb564bdac63d999f137275d165faa29ce603945a/The_buchery_chuck_burgers_4Farmdrop19_Nov1238499.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Mince");
        itemRepository.save(meat33);

        Meat meat34 = new Meat("2 Beef Burgers", "Beef", "Highgrove Burger", 5.60, "https://fd-v5-api.imgix.net/assets/product_images/3c63972fd60c02441cfcefcb6cda55777938ea143117bad8d3967cf879c83f4e/The_buchery_native_breed_burgers_2_Farmdrop19_Nov1238496.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Mince");
        itemRepository.save(meat34);

        Meat meat35 = new Meat("Pork tenderloin", "Pork", "Delicious pork tenderloin", 9,"https://fd-v5-api.imgix.net/assets/product_images/464fc86d2ee13b1cec2209b03404187879f04be2eb644eae8f60b036572545de/Park_Farm_Pork_tenderloin_FD20_June150017_1.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Tenderloin");
        itemRepository.save(meat35);

        Meat meat36 = new Meat("1kg Brisket", "Beef", "Beef Brisket Roasting Joint", 11, "https://fd-v5-api.imgix.net/assets/product_images/8d2ded6ff58a11181cb1ffec8c0e90f1f871136cf5355730026678183e5cff43/Haye_Farm_Beef_BrisketFD20_Nov17_2.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Brisket");
        itemRepository.save(meat36);

        Meat meat37 = new Meat("1 Flank Steak 300g", "Beef", "Dry aged Flank Steak", 6.80, "https://fd-v5-api.imgix.net/assets/product_images/f3187869a1c429a9174cb2ba89a6fb60540883ebcc85a3048c0a44e8fad27b8a/steak_onglet186.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Fore Quarter Flank");
        itemRepository.save(meat37);

        Meat meat39 = new Meat("1 Rib Eye Steak 300g", "Beef", "Dry aged Rib Eye Steak", 18, "https://fd-v5-api.imgix" +
                ".net/assets/product_images/03d2cfd981909f07ff4e2d43a251d192ed0dcfc1788f09d6f72c37d54cf97f9e/Horton_house_cow_rib_eye_each_Farmdrop19_Sept335593.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Ribeye");
        itemRepository.save(meat39);

        Meat meat40 = new Meat("1 Wagyu Rib Eye Steak 200g", "Beef", "Wagyu Rib Eye Steak", 44, "https://robbreport.com/wp-content/uploads/2018/11/crowdcow_kagoa5_004.jpg?w=480", "Ribeye");
        itemRepository.save(meat40);

        Meat meat41 = new Meat("Wing Rib", "Beef", "Sussex Wing Rib (Sirloin on the bone)", 46.80, "https://fd-v5-api.imgix.net/assets/product_images/c5b688c926995b73cf1abe5e8e016d30abfb1778e3bc8bdeace9565149c7f77f/wing_rib.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined","Fore Ribs");
        itemRepository.save(meat41);

        Meat meat42 = new Meat("Short Ribs", "Beef", "Beef Short Ribs", 6.75, "https://fd-v5-api.imgix" +
                ".net/assets/product_images/778af2186dae461e96da2297232953d44943b0b0f5afdab6f7e844960b6cb786/Horton_House_Short_rib_FD20_June150027.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Fore Ribs");
        itemRepository.save(meat42);

        Meat meat43 = new Meat("Rump Steak", "Beef", "Rump Steak", 3, "https://fd-v5-api.imgix.net/assets/product_images/948e451fc94308ff938824ff632ae349c8f0e2a8b7e3d7eb2ca3e76b511eea00/Haye_Farm_Rump_Steak_FD20_Nov17.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined","Rump");
        itemRepository.save(meat43);

//        Meat meat44 = new Meat( "Steak", "Beef", "Rump Slice marinated", 3, "Rump");
//        itemRepository.save(meat44);

        Meat meat45 = new Meat("Beef Shin", "Beef", "Beef Shin Off the Bone", 6.95, "https://fd-v5-api.imgix.net/assets/product_images/e05711b38b0f3d47fd3132e20f377afcb578a04565e631f91cbd08f342a89dbf/Haye_Farm_Beef_ShinFD20_Nov17.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Shin");
        itemRepository.save(meat45);

//        Meat meat46 = new Meat("Steak", "Beef", "Beef Diced Shin", 6, "Shin");
//        itemRepository.save(meat46);

//        Meat meat47 = new Meat("Steak", "Beef", "Ox Cheek", 2, "Ox Cheek");
//        itemRepository.save(meat47);

        Meat meat48 = new Meat("Ox Tail", "Beef", "Ox Tail", 13, "https://fd-v5-api.imgix.net/assets/product_images/6023c5b1bba0e792812d57aa1fec70a8490e4d82e7a47af5b74c410aaada250e/Farmdrop_21.2.181460_Ox_Tail.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Ox Tail");
        itemRepository.save(meat48);

        Meat meat49 = new Meat( "500g Bavette", "Beef", "Sussex Dry Aged Bavette", 8.89,"https://fd-v5-api.imgix" +
                ".net/assets/product_images/2746a29a7fb0ecf4b8ccaa8fc0203be27e13fa5299397816555e9e9f33949bb2/PFC_bavette_Farmdrop19_Oct237176.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Chump");
        itemRepository.save(meat49);





//        Processed saus = new Processed("Forman Smoked Salmon", "Sausage", "Smoked Salmon Sausage", 12, "Salmon, " +"smoked and poached");



//
//        Meat meat50 = new Meat("2 Confit Duck Legs", "Duck", "This is a wonderful thing to keep in your fridge for" +
//                " a quick and very easy supper that can be ready in minutes. Duck legs are dry-cured with a blend of herbs and spices and are then cooked sous-vide with some extra duck fat and matured to allow the flavours to develop fully.", 10.10, "https://fd-v5-api.imgix" +
//                ".net/assets/product_images/cb594caf4b3f7bc609476f879842d95ef4e219371ab4354989a99b5bcb284eed/Confit_duck_legs_Framdrop19_May731133.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined","Leg");
//        itemRepository.save(meat50);
//
//        Meat meat51 = new Meat("Whole duck", "Duck", "Free range, farmed duck", 25, "https://fd-v5-api.imgix" +
//                ".net/assets/product_images/8d48e4a65a427ad773e438ae637845bceb3808d3cf47733c83c4b1b7753e813b/Sladesdown_free_range_duck_wholeFramdrop19_May731490.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Whole bird");
//        itemRepository.save(meat51);

//        Meat meat11 = new Meat("Pheasant", "Game", "Yorkshire pheasant, idk", 4.25, "Whole bird");

//        Meat meat12 = new Meat("Grouse", "Game", "Yorkshire grouse, idk", 12.50, "Whole bird");
////
//        Meat meat15 = new Meat("Pork belly", "Pork", "Delicious pork belly", 7, "Belly");
//
//        Meat meat16 = new Meat("Pork Chops", "Pork", "Delicious pork chops", 4.5, "Loin chops");
//
//        Meat meat17 = new Meat("Spareribs", "Pork", "Delicious pork spareribs", 9, "Ribs");

//        Meat meat28 = new Meat("Contre Fillet ", "Beef", "Delicious contre fillet", 58, "Rolled sirloin");
//
//        Meat meat29 = new Meat("Rib of Beef", "Beef", "Delicious rob of beef", 68, "Ribeye on the bone");
//

//        Processed saus = new Processed("Cumberland", "Sausage", "Delicious sausage in sausage form", 6, "https://fd-v5-api.imgix.net/assets/product_images/5a1a150fc4c047ba255a7c5abee4d433408b15df7c943e8a44738a03a267120c/Purton_organics__traditional_sausages_Farmdrop19_Nov1238502.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined", "Pork, " +
//                "herbs, seasonings, others");
//        saus.addAllergen("Gluten");
//        saus.addAllergen("Egg");
//        itemRepository.save(saus);
//
//        Processed kiev = new Processed("Chicken Kiev", "Kiev", "Amazing Chicken Kiev", 6.75, "https://realfood.tesco" +
//                ".com/Media/images/Kiev-7-636x418-85947e3f-5de9-4254-973c-b5e616f401a3-0-636x418.jpg","Chicken, garlic butter " +
//                "and breadcrumb coat");
//        kiev.addAllergen("Gluten");
//        kiev.addAllergen("Egg");
//        itemRepository.save(kiev);
//
//        Processed escalope1 = new Processed("Breaded Chicken Escalope", "Escalope", "Traditional Chicken Escalope", 3.55, "https://feelgoodfoodie.net/wp-content/uploads/2019/03/Air-Fryer-Chicken-1-e1552096195763-500x500.jpg", "Chicken, light seasoning and breadcrumb coat");
//        escalope1.addAllergen("Gluten");
//        escalope1.addAllergen("Egg");
//        itemRepository.save(escalope1);
//
//        Processed burger = new Processed("2 Chicken Burgers", "Burgers", "Hand made Chicken Burgers", 2.75, "https" +
//                "://cdn.shopify.com/s/files/1/0994/7706/products/68_464e3ea1-0118-4222-b0ad-367d3f243e6f_1024x1024.jpg?v=1588616970",
//                "Chicken, parsley, light seasoning and breadcrumb coat");
//        burger.addAllergen("Gluten");
//        burger.addAllergen("Egg");
//        itemRepository.save(burger);
//
//        Processed nuggets = new Processed("10 Chicken Nuggets", "Nuggets", "Free Range Chicken Nuggets", 4.60, "https" +
//                "://www.budgetbytes.com/wp-content/uploads/2019/05/Homemade-Baked-Chicken-Nuggets-on-rack-V1.jpg","Chicken, " +
//                "light seasoning and breadcrumb coat");
//        nuggets.addAllergen("Gluten");
//        nuggets.addAllergen("Egg");
//        itemRepository.save(nuggets);
//
//        Processed saus1 = new Processed("Chicken and Asparagus", "Sausage", "Chicken and Asparagus Sausages", 5, "Chicken, asparagus, pistachio nuts, tarragon and spices"
//        );
//        itemRepository.save(saus1);
//
//        Processed saus2 = new Processed("Chicken and Apple", "Sausage", "Delicious Chicken and Apple Sausages", 4,
//        "https://fd-v5-api.imgix.net/assets/product_images/8e7bee1e9f861e390fe66477a28ab831ec91ac0c5566c193a95ebbf06e44a38a/FCP_-_ChipolatasFarmdrop19_Apr2930362.jpg?fm=pjpg&q=90&auto=format&ar=5%3A4&fit=crop&w=545&exp=0&crop=undefined",
//        "Chicken, made sweet and mild with apple"
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

    }
}

