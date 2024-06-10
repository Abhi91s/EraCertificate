package com.example.eracertificate.IndividualCertificate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class individualController 
{
    @GetMapping("/add_individ")
    public String getFormData(@ModelAttribute("obj1")individual indi) 
    {
        System.out.println("\n\nIndi DATA: "+indi);

        return "/Fragments/index";
    }
    
}
