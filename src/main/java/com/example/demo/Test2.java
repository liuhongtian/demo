package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {

    @GetMapping("/test2")
    public String test(@RequestParam(value = "str", required = false) String str) {
        return "test2: " + str;
    }
}