package com.example.eracertificate.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.eracertificate.BasicCertificates.basic;
import com.example.eracertificate.FullstackCertificates.fullstack;
import com.example.eracertificate.IndividualCertificate.individual;

@Controller
public class Controler {
    @GetMapping("/")
    public String homepage(Model model) 
    {
        model.addAttribute("individ", new individual());
        model.addAttribute("full_stack", new fullstack());
        model.addAttribute("Basic", new basic());

        return "/Fragments/index";
    }

}
