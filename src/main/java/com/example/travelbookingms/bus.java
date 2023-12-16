package com.example.travelbookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class bus {
    @GetMapping("/mybus")
    public String getData() {
        return "Please book your bus ticket from MSCRT or redbus";
    }
}
