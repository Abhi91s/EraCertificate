package com.example.eracertificate.BasicCertificates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class basicController
{
    @GetMapping("/add_basic")
    public String getMethodName(@ModelAttribute("Basic") basic bs) 
    {
        System.out.println("\n\nDATA:"+bs);
        
        return "/Fragments/index";
    }
    
    
}
