package com.codeclan.butchr.controllers;

import com.codeclan.butchr.models.stock.Item;
import com.codeclan.butchr.models.stock.Meat;
import com.codeclan.butchr.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value = "/items/item/{id}")
    public ResponseEntity<Optional<Item>> getItemById(@PathVariable long id){
        return (new ResponseEntity<>(itemRepository.findById(id), HttpStatus.OK));
    }

    @DeleteMapping(value = "/items/{id}")
    public void deleteItemById(@PathVariable long id){
        itemRepository.deleteById(id);
    }


}
