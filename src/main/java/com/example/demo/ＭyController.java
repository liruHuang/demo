package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ＭyController {
    @Autowired
//    String name;
    Card card;

    @GetMapping("/hello")
    public Card hello() {
        return card;
    }

}
