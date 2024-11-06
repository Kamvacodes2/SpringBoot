package net.javaguides.springannotation.controller;
//lesson 6

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        return "Hello controller";
    }
}
