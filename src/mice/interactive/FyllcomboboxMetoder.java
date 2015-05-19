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
public class FyllcomboboxMetoder {
    
    private InfDB databasen;

public FyllcomboboxMetoder(){

try {
            databasen = new InfDB("C:\\Program Files\\databasen\\MICEDB.FDB");
       
        } catch (InfException ex) {
            Logger.getLogger(Sokpanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    


}
