package com.codeclan.butchr.modelsTest;

import com.codeclan.butchr.models.Meat;
import com.codeclan.butchr.models.NonFoodItem;
import com.codeclan.butchr.models.Processed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sellTest {
    @Test
    public void meatCanSell(){
        Meat meat1 = new Meat("Fillet Steak", "Beef", "This is a beef steak", "fry it", 49.50, 10, "fillet");
        meat1.sell (5);
        assertEquals(5, meat1.getTotalStock());
        assertEquals(2, meat1.getAvailableForReservation());

    }

    @Test
    public void processedCanSell(){
        Processed processedMeat1 = new Processed("Gloucester Old Spot Sausage", "Sausage", "This is a sausage", "Fry for 10 minutes", 5.00, 50, "Pork, breadcrumbs, sage, love", "gluten");
        processedMeat1.sell(6);
        assertEquals(44, processedMeat1.getTotalStock());
        assertEquals(22, processedMeat1.getAvailableForReservation());

    }

    @Test
    public void nonFoodCanSell(){
        NonFoodItem item = new NonFoodItem("Charcoal Briquettes", "fuel","Like cod gougans", 1000, 10);
        item.sell(2);
        assertEquals(8, item.getTotalStock());
    }

}
