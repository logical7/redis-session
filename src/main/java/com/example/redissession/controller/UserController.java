package com.example.redissession.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinjun
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/get")
    public String get(String userName) {
        return "Hello user";
    }
}
