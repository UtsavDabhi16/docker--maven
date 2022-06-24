package com.inexture.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MyController {

    @GetMapping("/world")
    public String helloPost() {
        return "hello";
    }


}
