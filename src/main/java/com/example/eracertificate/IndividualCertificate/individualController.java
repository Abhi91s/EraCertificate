package com.example.eracertificate.IndividualCertificate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.eracertificate.BasicCertificates.basic;
import com.example.eracertificate.FullstackCertificates.fullstack;


@Controller
public class individualController 
{

   @Autowired
   individualservice service;

    @PostMapping("/add_individ")
    public String getFormData(@ModelAttribute("individ") individual indi,Model model) 
    {
        service.formateDate(indi);
        
        System.out.println("\n\nIndi DATA: "+indi);

        model.addAttribute("individ", new individual());
        model.addAttribute("full_stack", new fullstack());
        model.addAttribute("Basic", new basic());


        return "/Fragments/index";
    }
    
}
