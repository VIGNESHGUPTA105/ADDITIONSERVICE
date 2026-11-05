package com.example.ms1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms1.service.ArithmeticService;

@RestController
@RequestMapping("/ms1")
public class MS1Controller {

    private final ArithmeticService arithmeticService;

    public MS1Controller(ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        int result = arithmeticService.add(a, b);
        return "MS 1.1 - Additon = " + result;
    }
}
