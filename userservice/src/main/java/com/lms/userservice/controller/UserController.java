package com.lms.userservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lms.userservice.entity.User;
import com.netflix.discovery.converters.Auto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;


    @PostMapping("/user")
    public User postMethodName(@RequestBody User user) {
       return user;
    }
    @GetMapping("/user/books")
    public String getMethodName() {
        //here i need ti talk to a bookservice
        restTemplate.getForEntity("http://localhost:9090/books",BookResponse.class);
        return null;
    }
    
    

}
