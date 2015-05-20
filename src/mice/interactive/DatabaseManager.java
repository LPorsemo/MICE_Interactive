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
            JOptionPane.showMessageDialog(null, ex);
        }
        return listan;
    }
    
    
}
