package com.example.PerfectPixelArt.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class cartController {
    
    @RequestMapping(value="/welcome", method=RequestMethod.GET)
    public String requestMethodName() {
        return "Welcome";
    }
    
}
