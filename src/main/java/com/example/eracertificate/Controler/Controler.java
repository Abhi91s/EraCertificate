package com.example.eracertificate.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.eracertificate.BasicCertificates.basic;
import com.example.eracertificate.BasicCertificates.basicservice;
import com.example.eracertificate.FullstackCertificates.fullstack;
import com.example.eracertificate.FullstackCertificates.fullstackservice;
import com.example.eracertificate.IndividualCertificate.individual;
import com.example.eracertificate.IndividualCertificate.individualservice;

@Controller
public class Controler 
{

    @Autowired
   basicservice baisc_service;

   @Autowired
   individualservice individ_service;

   @Autowired
   fullstackservice full_service;


    @GetMapping("/")
    public String homepage(Model model) 
    {

        // This is for Form  Object
        model.addAttribute("individ", new individual());
        model.addAttribute("full_stack", new fullstack());
        model.addAttribute("Basic", new basic());

        
       // This Is for Showing the data of Database On Home page
        model.addAttribute("Basic_list", baisc_service.getAllStudent());
        model.addAttribute("Indi_list", individ_service.getAllStudent());
        model.addAttribute("Full_list", full_service.getAllStudent());


        return "/Fragments/index";
    }

}
