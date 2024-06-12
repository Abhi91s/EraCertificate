package com.example.eracertificate.FullstackCertificates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

@Service
public class fullstackservice 
{

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
