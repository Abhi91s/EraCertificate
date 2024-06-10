package com.example.eracertificate.FullstackCertificates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class fullstackController 
{
    @GetMapping("/add_fullStack")
    public String getFormData(@ModelAttribute("obj2")fullstack full) 
    {
        System.out.println("\n\nFull DATA: "+full);

       return "/Fragments/index";
    }
    
}
