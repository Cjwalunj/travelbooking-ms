package com.example.travelbookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class bus {
    @GetMapping("/mybus")
    public String getData() {
        return "book your Ac/Non AC bus ticket on Redbus";
    }
}
