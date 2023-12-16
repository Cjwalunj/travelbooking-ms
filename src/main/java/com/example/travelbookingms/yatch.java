package com.example.travelbookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class yatch {
    @GetMapping("/myyatch")
    public String getData() {
        return "please book your seat in yatch before it get full";
    }
}
