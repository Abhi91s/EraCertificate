package com.example.eracertificate.BasicCertificates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.eracertificate.FullstackCertificates.fullstack;
import com.example.eracertificate.FullstackCertificates.fullstackservice;
import com.example.eracertificate.IndividualCertificate.individual;
import com.example.eracertificate.IndividualCertificate.individualservice;
import com.example.eracertificate.BasicCertificates.basicservice;


@Controller
public class basicController
{
    
   @Autowired
   basicservice baisc_service;

   @Autowired
   individualservice individ_service;

   @Autowired
   fullstackservice full_service;

    @PostMapping("/add_basic")
    public String getMethodName(@ModelAttribute("Basic") basic bs,Model model) 
    {
        //Formate The date of obj.
        baisc_service.formateDate(bs);

        System.out.println("\n\nDATA:"+bs);

      //Chack that the given data is alredy presnt or not in Databse
       boolean b=baisc_service.chackStdExist(bs);

       if(b) 
       {
          System.out.println("\n\nUser is Alrady Exists in Our DATABASE....\n"); 
       }
       else { baisc_service.saveStd(bs); }
      


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
