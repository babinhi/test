package com.example.test.test;

import org.springframework.web.bind.annotation.GetMapping;

public class testcontroller {
    @GetMapping("/")
    public String index(){
        return "/";
    }
}
