package com.j8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
	 
    @GetMapping(value="/")
     public String home1(){

        return "HOME";
    }

    @GetMapping(value="/home")
    public String home2(){

       return "HOME 1";
   }
}
