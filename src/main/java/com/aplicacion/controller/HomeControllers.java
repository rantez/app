package com.aplicacion.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllers {



    @GetMapping("/version")
    public String getVersion(){
        return "Vesion 2.0";
    }


}
