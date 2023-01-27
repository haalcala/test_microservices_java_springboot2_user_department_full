package com.mycompany.api.service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
    @GetMapping("/userServiceFallback")
    public String userServiceFallback() {
        return "User service unavailable.";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback() {
        return "Department service unavailable.";
    }
}
