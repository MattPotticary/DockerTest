package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    String home() {
        return "Hello world";
    }

    @GetMapping("/{name}")
    String homeName(@PathVariable  String name){
        return String.format("Hello %s", name);
    }
}
