package com.codeclan.butchr.controllers;

import com.codeclan.butchr.models.stock.Item;
import com.codeclan.butchr.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping(value = "/items")
    public ResponseEntity<List<Item>> getAllItems(){
        return (new ResponseEntity<>(itemRepository.findAll(), HttpStatus.OK));
    }

    @GetMapping(value = "/items/{type}")
    public ResponseEntity<List<Item>> getAllProcessedItems(@PathVariable String type){
        return (new ResponseEntity<>(itemRepository.findByItemType(type), HttpStatus.OK));
    }



    //get all proces
    //get all meat
    //get all nonfood

    //create
    //update
    //delete all
    //delete 1
    //get one by?
}
