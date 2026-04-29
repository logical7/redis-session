package com.example.redissession.controller;

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
        return "test demo--" + new Date();
    }

    @GetMapping(value = "/demo")
    public String demo() {
        return "demo--" + new Date();
    }
}
