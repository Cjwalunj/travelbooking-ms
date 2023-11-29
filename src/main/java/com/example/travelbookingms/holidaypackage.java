package com.example.travelbookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class holidaypackage {
    @GetMapping("/goa")
    public String getData() {
        return "Please book your fight and hotel ";
    }
}
