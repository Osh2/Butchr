package com.codeclan.butchr.modelsTest;

import com.codeclan.butchr.models.Meat;
import com.codeclan.butchr.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void canAddToBasket(){
        User dave = new User("Dave", "dave@dave.net", "hfaj93289", "99 Meat Lane", 32);
        Meat meat1 = new Meat("Lamb Rump", "Lamb", "Rump of lamb", 80.62, 10, "Roast", "Leg");
        dave.addToBasket(meat1, 2);
        assertEquals(1, dave.getBasket().size());
        assertEquals(2, meat1.getQuantityOrdered());
        assertEquals(8, meat1.getTotalStock());
    }
}
