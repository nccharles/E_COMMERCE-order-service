package com.amalitech.orderservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/myorder")
    public String getOrder() {
        return "My orders coming soon!";
    }
}

