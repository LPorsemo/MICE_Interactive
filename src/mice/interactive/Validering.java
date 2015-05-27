/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mice.interactive;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pemo
 */
public class Validering {
    
    
     public static boolean emptyString(String s) 
    {
         
        if (s == null || s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean jamforStartvsSlutDatum(String Startdatum, String Slutdatum)
    {
    
        String dateString1 = Startdatum;
        String dateString2 = Slutdatum;
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
    
        try 
        {
            Date datum1 = format.parse(dateString1);
            Date datum2 = format.parse(dateString2);
            
            if(datum1.compareTo(datum2) > 0)
            {
                return true;
            }
        } 
        catch (ParseException ex) 
        {
             Logger.getLogger(Validering.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
}
