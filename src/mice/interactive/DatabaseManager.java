/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mice.interactive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author pemo
 */
public class DatabaseManager {
    
    private InfDB database;
    
    public DatabaseManager()
    {
        try {
            database = new InfDB("C:\\Program Files\\databasen\\MICEDB.FDB");
        } catch (InfException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean insert(String query)
    {
        try {
            database.insert(query);
            return true;
        } catch (InfException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public void delete(String query)
    {
        try {
            database.delete(query);
        } catch (InfException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(String query)
    {
        try {
            database.update(query);
        } catch (InfException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<String> getAnstalldLista()
    {
        ArrayList<HashMap<String,String>> anstalldLista = new ArrayList<>();
        ArrayList<String> listan = new ArrayList<>();
             String query = "SELECT ANSTALLD.NAMN, ANSTALLD.ANVNAMN FROM ANSTALLD ORDER BY NAMN ASC";
       
        try {
            
            anstalldLista = database.fetchRows(query);
            for(HashMap<String, String> anstalld : anstalldLista)
            {
                String enAnstalld = anstalld.get("NAMN")+ " (" + anstalld.get("ANVNAMN") + ")";
                listan.add(enAnstalld);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return listan;
    }
    public ArrayList<String> getLedareLista()
    {
        ArrayList<HashMap<String,String>> anstalldLista = new ArrayList<>();
        ArrayList<String> listan = new ArrayList<>();
        String query = "SELECT ANSTALLD.NAMN, ANSTALLD.ANVNAMN FROM PROJEKTLEDARE\n" +
                       "JOIN ANSTALLD ON PROJEKTLEDARE.AID = ANSTALLD.AID\n" +
                       "ORDER BY NAMN ASC";
        try {
            
            anstalldLista = database.fetchRows(query);
            for(HashMap<String, String> anstalld : anstalldLista)
            {
                String enLedare = anstalld.get("NAMN")+ " (" + anstalld.get("ANVNAMN") + ")";
                listan.add(enLedare);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return listan;
    }
    public ArrayList<String> getSpelprojektnamnLista()
    {
            ArrayList<String> projektnamn = new ArrayList<>();
            String query = "SELECT BETECKNING FROM SPELPROJEKT";
        try {

            projektnamn = database.fetchColumn(query);
            
           
        } catch (InfException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
            return projektnamn;    
    }
    
    public ArrayList<String> getPlattformlista() 
    {
        ArrayList<String> plattformsnamn = new ArrayList<>();
        String query = "select benamning from PLATTFORM";
        try {

            plattformsnamn = database.fetchColumn(query);

        } catch (InfException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);

        }
        return plattformsnamn;
    }
    
    public ArrayList<String> getDomannamnlista() 
    {
    ArrayList<String> Domannamn = new ArrayList<>();
    String query = "select benamning from KOMPETENSDOMAN ORDER BY benamning ASC";
    try 
    {
        Domannamn = database.fetchColumn(query);
    } 
    catch (InfException ex) 
    {
        Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
    }
            
        return Domannamn;
    }
        
        public int getNyttSid()
        {
            String maxSid = "";
            String query = "SELECT MAX(SID) FROM SPELPROJEKT";
            try
            {        
                maxSid = database.fetchSingle(query);
               
            } 
            catch (InfException ex) 
            {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex); 
            
            }
        int intMaxSid = Integer.parseInt(maxSid);
        int nyttMaxSid = intMaxSid + 1;
        return nyttMaxSid; 
        }
        
        public int getNyttAid()
        {
            String maxAid = "";
            String query = "SELECT MAX(AID) FROM ANSTALLD";
            try
            {        
                maxAid = database.fetchSingle(query);
               

                        
            } 
            catch (InfException ex) 
            {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex); 
            
            }
        int intMaxAid = Integer.parseInt(maxAid);
        int nyttMaxAid = intMaxAid + 1;
        return nyttMaxAid;
        }
        
    public int getNyttKid()
        {
            String maxKid = "";
            String query = "SELECT MAX(KID) FROM KOMPETENSDOMAN";
            try
            {        
                maxKid = database.fetchSingle(query);
               

                        
            } 
            catch (InfException ex) 
            {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex); 
            
            }
        int intMaxKid = Integer.parseInt(maxKid);
        int nyttMaxKid = intMaxKid + 1;
        return nyttMaxKid;
        }
        
        
    public void updateSlutDatum(String datum, String spel)
    {
        String query = "UPDATE SPELPROJEKT SET RELEASEDATUM = '" + datum + "' where spelprojekt.beteckning = '" + spel + "';";
        try {
            database.update(query);
        }
        catch (InfException ex)
        {
            Logger.getLogger(AndraProjekt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateStartDatum(String datum, String spel)
    {
        String query = "UPDATE SPELPROJEKT SET STARTDATUM = '" + datum + "' where spelprojekt.beteckning = '" + spel + "';";
        try {
            database.update(query);
        }
        catch (InfException ex)
        {
            Logger.getLogger(AndraProjekt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void laggTillArbetareIProjekt(ArrayList<String> anvNamn, String spel)
           
    {
        for(String namn : anvNamn)
        {
            namn = Hjalpklass.konverteraListItemTillAnvNamn(namn);
            String aid = konverteraTillAid(namn);
            String query = "Insert into arbetar_i values ('" + aid + "', '" + spel + "');"; 
            if(!insert(query))
            {
                break;
            }
        }
    }   
    public void laggTillKonsolIProjekt(ArrayList<String> spelKonsol, String spel)
           
    {
        for(String namn : spelKonsol)
        {
            String pid = konverteraTillPid(namn);
            String query = "Insert into INNEFATTAR values (" + spel + ", " + pid + ");"; 
            if(!insert(query))
            {
                break;
            }
        }
    }   
    public String konverteraTillAid(String anvNamn)
    {
        
        String aid = "";
        
       
        String query = "SELECT AID FROM ANSTALLD WHERE ANVNAMN = '" + anvNamn + "'";
        try{
            aid = database.fetchSingle(query);
        }
        catch(InfException ex)
        {
            System.out.println("BLÄV FÄL!");
        }
        
        
        return aid;
        
    }
     public String konverteraTillPid(String spelKonsol)
    {
        
        String pid = "";
        
       
        String query = "SELECT PID FROM PLATTFORM WHERE BENAMNING = '" + spelKonsol + "'";
        try{
            pid = database.fetchSingle(query);
        }
        catch(InfException ex)
        {
            System.out.println("BLÄV FÄL!");
        }
        
        
        return pid;
        
    }
      public String konverteraTillKid(String domanNamn)
    {
        
        String kid = "";
        
       
        String query = "SELECT KID FROM KOMPETENSDOMAN WHERE BENAMNING = '" + domanNamn + "'";
        try{
            kid = database.fetchSingle(query);
        }
        catch(InfException ex)
        {
            System.out.println("BLÄV FÄL!");
        }
        
        
        return kid;
        
    }
    
}
           