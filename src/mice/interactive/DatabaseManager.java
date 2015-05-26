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
    public void insert(String query)
    {
        try {
            database.insert(query);
        } catch (InfException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
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
      public ArrayList<String> getPlattformlista() {
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
            String query = "select beteckning from KOMPETENSDOMAN";
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

}
