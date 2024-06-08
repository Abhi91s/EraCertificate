package com.example.eracertificate.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.eracertificate.BasicCertificates.basic;

@Controller
public class Full_Controler 
{
    
    
    @GetMapping("/Full_form")
    public String redirect_to_From(Model model) 
    {
        model.addAttribute("obj",new basic());

        return "/CoursesForm/Full_stack";
    }
    
    @GetMapping("/add_full")
    public String form_data_fatch(@ModelAttribute("obj") basic bs) 
    {
        System.out.println("\n\nFULL Form Data: "+bs);
        
        return "/Fragments/index";
    }
}
