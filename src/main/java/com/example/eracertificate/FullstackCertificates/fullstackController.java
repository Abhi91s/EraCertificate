package com.example.eracertificate.FullstackCertificates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.eracertificate.BasicCertificates.basic;
import com.example.eracertificate.IndividualCertificate.individual;


@Controller
public class fullstackController 
{
    @Autowired
    fullstackservice service;

    @PostMapping("/add_fullStack")
    public String getFormData(@ModelAttribute("full_stack")fullstack full,Model model) 
    {
          service.formateDate(full);

        System.out.println("\n\nFull DATA: "+full);

        model.addAttribute("individ", new individual());
        model.addAttribute("full_stack", new fullstack());
        model.addAttribute("Basic", new basic());


       return "/Fragments/index";
    }

    
    
}
