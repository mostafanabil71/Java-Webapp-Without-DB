package com.example.Greating_Java_Webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;  

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello, %s!", name);  

    }

    @GetMapping("/signUp")
    public String signUp() {
        return "Sign Up Page"; // Replace with actual logic for sign-up
    }

    @GetMapping("/registration")
    public String registration() {
        return "Registration Page"; // Replace with actual logic for registration
    }

    @GetMapping("/about")
    public String about() {
        return "About Us"; // Replace with actual content for the about page
    }


}