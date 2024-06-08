package com.example.eracertificate.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controler
{
       @GetMapping("/")
    public String homepage() 
    { 
        return "/Fragments/index";
    }
    
}
