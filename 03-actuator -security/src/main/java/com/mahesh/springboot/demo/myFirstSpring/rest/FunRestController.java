package com.mahesh.springboot.demo.myFirstSpring.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${team.name}")
    private String teamName;
    @Value("${team.coach}")
    private String coachName;
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "Team name is "+teamName;
    }
    @GetMapping("/coachInfo")
    public String coachInfo(){
        return "Team name is "+coachName;
    }
}
