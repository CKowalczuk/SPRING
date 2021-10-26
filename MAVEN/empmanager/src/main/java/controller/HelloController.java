package com.info2021.empmanager.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

}