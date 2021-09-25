package com.example.redissession.controller;

<<<<<<< HEAD
public class TestController {
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yinjun
 */
@RestController
@RequestMapping(value = "/v1")
public class TestController {
    @GetMapping(value = "/test")
    public String test() {
        return "test domo--" + new Date().toString();
    }
>>>>>>> origin/master
}
