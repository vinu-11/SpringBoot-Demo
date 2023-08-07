package com.example.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                 //Makes whole class Rest Controller
public class APIController {
    @RequestMapping("/greetings")       // In Defualt it works as a GET Method
    public String sayHi() {
        return "Hello, Good Morning";
    }
}

