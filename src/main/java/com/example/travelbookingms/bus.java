package com.example.travelbookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class bus {
    @GetMapping("/mybus")
    public String getData() {
<<<<<<< HEAD
        return "sytem is busy, Wait while we on working";
=======
        return "Please book your bus ticket on redbus or MSRTC";
>>>>>>> 88b5bd15b95635e7331cac226cf57fb4343b7476
    }
}
