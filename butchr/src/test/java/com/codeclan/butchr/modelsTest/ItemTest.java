package com.codeclan.butchr.modelsTest;

import com.codeclan.butchr.models.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    @Test
    public void canSell(){
        Item item = new Item("Sticks", "Fuel", "Sum stickz", 2.50, 100);
        item.sell(50);
        assertEquals(50, item.getTotalStock());
    }
}
