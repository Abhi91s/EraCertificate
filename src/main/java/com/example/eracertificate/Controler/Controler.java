package com.example.eracertificate.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.eracertificate.BasicCertificates.basic;


@Controller
public class Controler {
    @GetMapping("/")
    public String homepage() {
        return "/Fragments/index";
    }
    
}
