package com.codeclan.butchr.controllers;

import com.codeclan.butchr.models.User;
import com.codeclan.butchr.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return (new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK));
    }

    @GetMapping(value = "/users/{email}")
    public ResponseEntity<User> getUser(@PathVariable String email){
        return (new ResponseEntity<>(userRepository.findByEmailIgnoreCase(email), HttpStatus.OK));
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        userRepository.save(user);
        return (new ResponseEntity<>(user, HttpStatus.CREATED));
    }

    @DeleteMapping(value = "/users/{id}")
    public void deleteUser(@PathVariable long id){
        userRepository.deleteById(id);
    }


}
