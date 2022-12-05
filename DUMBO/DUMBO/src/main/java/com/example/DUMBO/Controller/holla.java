package com.example.DUMBO.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holla {

    @GetMapping("/")
    public String index(){
        return "Holla You Bastard!!";
    }
}
