package com.example.eracertificate.FullstackCertificates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.eracertificate.BasicCertificates.basic;
import com.example.eracertificate.BasicCertificates.basicservice;
import com.example.eracertificate.IndividualCertificate.individual;
import com.example.eracertificate.IndividualCertificate.individualservice;


@Controller
public class fullstackController 
{
  @Autowired
   basicservice baisc_service;

   @Autowired
   individualservice individ_service;

   @Autowired
   fullstackservice full_service;

    @PostMapping("/add_fullStack")
    public String getFormData(@ModelAttribute("full_stack")fullstack full,Model model) 
    {

       //Formate The date of obj.
        full_service.formateDate(full);
        

        System.out.println("\n\nFull DATA: "+full);


        //Chack that the given data is alredy presnt or not in Databse
        boolean b=full_service.chackStdExist(full);

        if(b) 
        {
           System.out.println("\n\nUser is Alrady Exists in Our DATABASE....\n"); 
        }
        else { full_service.saveStd(full); }
       
         
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
