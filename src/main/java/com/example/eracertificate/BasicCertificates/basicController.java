package com.example.eracertificate.BasicCertificates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.eracertificate.FullstackCertificates.fullstack;
import com.example.eracertificate.IndividualCertificate.individual;
import com.example.eracertificate.BasicCertificates.basicservice;


@Controller
public class basicController
{
    
   @Autowired
   basicservice service;

    @PostMapping("/add_basic")
    public String getMethodName(@ModelAttribute("Basic") basic bs,Model model) 
    {
        service.formateDate(bs);

        System.out.println("\n\nDATA:"+bs);


        model.addAttribute("individ", new individual());
        model.addAttribute("full_stack", new fullstack());
        model.addAttribute("Basic", new basic());

        return "/Fragments/index";
    }
    
    
}
