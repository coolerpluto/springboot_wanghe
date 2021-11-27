package com.fan.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/boot")
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        return "hello!@";
    }
}
