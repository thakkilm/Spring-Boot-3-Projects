package com.mahesh.springboot.demo.myFirstSpring.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${my.name}")
    public String name;
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
//        return name;
    }   
}
