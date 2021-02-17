package com.codeclan.butchr.models;

import com.codeclan.butchr.models.stock.FoodItem;
import com.codeclan.butchr.models.stock.Item;
import com.codeclan.butchr.models.stock.Meat;
import com.codeclan.butchr.models.stock.Processed;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Item> inventory;

    public Inventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    //get all objects of meat in the list
    public List<Meat> getMeatInventory(){
       List<Meat> meatStock = new ArrayList<>();
        for( Item item : inventory){
            if( item instanceof Meat){
                meatStock.add( ( (Meat) item ) );
            }
        }
        return meatStock;
    }

    //get all objects of processed in the list
    public List<Processed> getProcessedInventory(){
        List<Processed> processedStock = new ArrayList<>();
        for( Item item : inventory){
            if( item instanceof  Processed){
                processedStock.add( ( (Processed) item) );
            }
        }
        return processedStock;
    }

    //get all non food items
    public List<Item> getNonFoodItems(){
        List<Item> nonFoodStock = new ArrayList<>();
        for(Item item: inventory){
            if( !(item instanceof FoodItem) ){
                nonFoodStock.add(item);
            }
        }
        return nonFoodStock;
    }

    //remove from inventory by object
    //



}
