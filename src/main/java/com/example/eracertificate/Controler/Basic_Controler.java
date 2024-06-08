package com.example.eracertificate.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.eracertificate.BasicCertificates.basic;



@Controller
public class Basic_Controler 
{
    
 

    @GetMapping("/Basic_form")
    public String redirect_to_From(Model model) 
    {
        model.addAttribute("obj",new basic());

        return "/CoursesForm/Basic";
    }
    
    @GetMapping("/add_basic")
    public String form_data_fatch(@ModelAttribute("obj") basic bs) 
    {
        System.out.println("\n\nBasic Form Data: "+bs);
        
        return "/Fragments/index";
    }
    
    
}
