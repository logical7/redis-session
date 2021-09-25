package com.example.redissession.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yinjun
 */
@RestController
@RequestMapping(value = "/v2")
public class DemoController {
    @GetMapping(value = "/demo")
    public String test() {
        return "test domo--" + new Date().toString();
    }

}
