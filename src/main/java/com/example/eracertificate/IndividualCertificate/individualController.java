package com.example.eracertificate.IndividualCertificate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.eracertificate.BasicCertificates.basic;
import com.example.eracertificate.BasicCertificates.basicservice;
import com.example.eracertificate.FullstackCertificates.fullstack;
import com.example.eracertificate.FullstackCertificates.fullstackservice;


@Controller
public class individualController 
{


   @Autowired
   basicservice baisc_service;

   @Autowired
   individualservice individ_service;

   @Autowired
   fullstackservice full_service;

    @PostMapping("/add_individ")
    public String getFormData(@ModelAttribute("individ") individual indi,Model model) 
    {
         //Formate The date of obj.
        individ_service.formateDate(indi);

        
        System.out.println("\n\nIndi DATA: "+indi);

        //Chack that the given data is alredy presnt or not in Databse
        boolean b=individ_service.chackStdExist(indi);

        if(b) 
        {
           System.out.println("\n\nUser is Alrady Exists in Our DATABASE....\n"); 
        }
        else { individ_service.saveStd(indi); }
       

          // This is for Form  Object
        model.addAttribute("individ", new individual());
        model.addAttribute("full_stack", new fullstack());
        model.addAttribute("Basic", new basic());

        // This Is for Shoing the data of Database On Home page
        model.addAttribute("Basic_list", baisc_service.getAllStudent());
        model.addAttribute("Indi_list", individ_service.getAllStudent());
        model.addAttribute("Full_list", full_service.getAllStudent());
         
        return "/Fragments/index";
    }
    
}
