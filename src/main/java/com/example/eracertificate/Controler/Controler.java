package com.example.eracertificate.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.eracertificate.BasicCertificates.basic;
import com.example.eracertificate.BasicCertificates.basicservice;
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
        model.addAttribute("full_stack", new basic());
        model.addAttribute("Basic", new basic());

        
       // This Is for Showing the data of Database On Home page
        model.addAttribute("Basic_list", baisc_service.getAllStudent());
        model.addAttribute("Indi_list", individ_service.getAllStudent());
        model.addAttribute("Full_list", full_service.getAllStudent());


        return "/Fragments/index";
        }
        
//------------------------------------------------------------------------------------

    //Get data of Individual course Student for Certificate Printing:

    @GetMapping("/viwe-Indi-cer/{id}")
    public String getInCertificate(@ModelAttribute("id") int id,Model model) 
    {
  
       // Fatch the obj. of given id and set "course name +  Programing Language" .
       individual in=individ_service.getStdByID(id);
       in.setCourse(in.getCourse()+" Programing Language");

       

        model.addAttribute("obj", in);

        return "Certificate/certificate";
    }
    
//------------------------------------------------------------------------------------

//Get data of Full-Stack course Student for Certificate Printing:
@GetMapping("/viwe-full-cer/{id}")
    public String getfnCertificate(@ModelAttribute("id") int id,Model model) 
    {

        model.addAttribute("obj", full_service.getStdByID(id));

        return "Certificate/certificate";
    }
    
//------------------------------------------------------------------------------------

 //Get data of Basic course Student for Certificate Printing
  @GetMapping("/viwe-basic-cer/{id}")
  public String getBnCertificate(@ModelAttribute("id") int id,Model model) 
  {   
      model.addAttribute("obj", baisc_service.getStdByID(id));  

      return "/Certificate/certificate";
  }

}
