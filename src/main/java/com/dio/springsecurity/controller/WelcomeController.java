package com.dio.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.springsecurity.model.User;
import com.dio.springsecurity.repository.UserRepository;

@RestController
public class WelcomeController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String welcome() {
        return "Welcome to My Spring Boot Web API";
    }

    @GetMapping("/users")
    public String users() {
        return "Authorized user";
    }

    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager";
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

}