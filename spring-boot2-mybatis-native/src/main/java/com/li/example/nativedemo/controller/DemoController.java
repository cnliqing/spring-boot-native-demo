package com.li.example.nativedemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {


    // demo请求
    @GetMapping
    public Object demo() {

        return "demo";
    }
}
