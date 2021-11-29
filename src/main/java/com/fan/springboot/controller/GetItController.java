package com.fan.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class GetItController {
    @RequestMapping("/ok")
    public String ok(){
        return "get it";
    }
}
