package com.mycompany.user.service.controllers;

import com.mycompany.user.service.entities.Department;
import com.mycompany.user.service.entities.User;
import com.mycompany.user.service.services.UserServices;
import com.mycompany.user.service.templates.TemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    UserServices userServices;


    @PostMapping("")
    public User saveUser(@RequestBody User user) {
        return userServices.saveUser(user);
    }

    @GetMapping("/{id}")
    public TemplateVO findUserWithDepart(@PathVariable("id") Long userId) {
        return userServices.findUserById(userId);
    }
}
