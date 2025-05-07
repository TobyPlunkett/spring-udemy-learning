package com.tobyplunkett.springboot.demo.firstdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "hello world";
    }
}
