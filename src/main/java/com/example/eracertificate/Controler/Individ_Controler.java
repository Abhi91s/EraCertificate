package com.example.eracertificate.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.eracertificate.BasicCertificates.basic;


@Controller
public class Individ_Controler 
{

   
    @GetMapping("/Indi_form")
    public String redirect_to_From(Model model) 
    {
        model.addAttribute("obj",new basic());

        return "/CoursesForm/Individual";
    }
    
    @GetMapping("/add_individ")
    public String form_data_fatch(@ModelAttribute("obj") basic bs) 
    {
        System.out.println("\n\nINDI Form Data: "+bs);
        
        return "/Fragments/index";
    }
    
    
}
