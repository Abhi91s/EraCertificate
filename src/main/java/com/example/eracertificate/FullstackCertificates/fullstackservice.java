package com.example.eracertificate.FullstackCertificates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eracertificate.BasicCertificates.basic;




@Service
public class fullstackservice 
{

  @Autowired
  fullstackrepo reposertry;
  

      public List<fullstack> getAllStudent()
      {
        return (List)reposertry.findAll();
      }

//------------------------------------------------

      public void saveStd(fullstack full)
      {
        reposertry.save(full);
      }

//-------------------------------------------------

public fullstack getStdByID(int id)
{
  List<fullstack> list=getAllStudent();

  for (fullstack full : list) 
  {
    if (full.getId()==id) 
    {
      return full;  
    }
  }
   return null;
}
//-------------------------------------------------

    public boolean chackStdExist(fullstack bs)
    {
      List<fullstack> list=(List)reposertry.findAll();

      for (fullstack obj : list) 
      {
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

//-----------------------------------------------------------

  // This method is used for Formate the date from "yyyy-mm-dd" TO "dd-mm-yyyy"
    public String formateDate(fullstack fullobj)
    {

        String tempdate=fullobj.getStrating_date();

        for(int i=1;i<=3;i++)
        {

          // Parse the date string using the "yyyy-MM-dd" format
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(tempdate, parser);

        // Format the date using the "dd-MM-yyyy" format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = formatter.format(date);

       // System.out.println(formattedDate); // Output: 12-06-2024

        if (i==1) 
        {
          fullobj.setStrating_date(formattedDate);
          tempdate=fullobj.getEnding_date();   
        }
        if (i==2) 
        {
            fullobj.setEnding_date(formattedDate);
            tempdate=fullobj.getDate_of_issue();
        }
        if (i==3) 
        {
           fullobj.setDate_of_issue(formattedDate); 
        }

        }

        return "done";
    }
    
}
