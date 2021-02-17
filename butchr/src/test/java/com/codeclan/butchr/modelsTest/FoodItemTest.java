package com.codeclan.butchr.modelsTest;

import com.codeclan.butchr.models.Meat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemTest {

    @Test
    public void canSell(){
        Meat meat = new Meat("Beef", "Steak", "Fresh beef steak", 75, 20, "Sou vide and reverse sear", "T-BOne");
        meat.sell(10);
        assertEquals(10, meat.getTotalStock());
        assertEquals(5, meat.getAvailableForReservation());
    }

}
