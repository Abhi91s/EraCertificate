package com.example.eracertificate.BasicCertificates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class basicservice 
{
    @Autowired
    basicrepo reposerty;


    public List<basic> getAllStudent()
    {
        return (List) reposerty.findAll();
    }


//----------------------------------------------

public void saveStd(basic bs)
{
  reposerty.save(bs);

  System.out.println("\n\nBSaved...");
  }
  
//------------------------------------------------

public basic getStdByID(int id)
{
  List<basic> list=getAllStudent();

  for (basic basic : list) 
  {
    if (basic.getId()==id) 
    {
      return basic;  
    }
  }
   return null;
}
  
//------------------------------------------------

    public boolean chackStdExist(basic bs)
    {
      List<basic> list=(List)reposerty.findAll();

      for (basic obj : list) 
      {        //It compare all the atribute of object 
           if ((obj.getName().equals(bs.getName()))&&(obj.getCourse().equals(bs.getCourse()))) 
           {
              System.out.println("\n Step 1:\n");
              if ((obj.getStrating_date().equals(bs.getStrating_date()))&&(obj.getEnding_date().equals(bs.getEnding_date()))) 
              {
                System.out.println("\n Step 2:\n");
                if (obj.getDate_of_issue().equals(bs.getDate_of_issue())) 
                {
                  System.out.println("\n Step 3:\n");
                   return  true;
                }
              }
           }
      }

      return false;
    }

//------------------------------------------------

    public String formateDate(basic obj)
    {

      // This method is used for Formate the date from "yyyy-mm-dd" TO "dd-mm-yyyy"
        String tempdate=obj.getStrating_date();

        for(int i=1;i<=3;i++)
        {

          // Parse the date string using the "yyyy-MM-dd" format
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(tempdate, parser);

        // Format the date using the "dd-MM-yyyy" format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = formatter.format(date);

       // System.out.println(formattedDate);  Output: 12-06-2024

        if (i==1) 
        {
          obj.setStrating_date(formattedDate);
          tempdate=obj.getEnding_date();   
        }
        if (i==2) 
        {
            obj.setEnding_date(formattedDate);
            tempdate=obj.getDate_of_issue();
        }
        if (i==3) 
        {
           obj.setDate_of_issue(formattedDate); 
        }

        }

        return "done";
    }


  }
