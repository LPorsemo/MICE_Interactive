/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mice.interactive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author pemo
 */
public class Hjalpklass {

    public static LinkedHashMap<String, Integer> getManaderOchDagar()
    {
        LinkedHashMap<String, Integer> dom = new LinkedHashMap<>();
        {
            dom.put("Jan", 31);
            dom.put("Feb", 28);
            dom.put("Mar", 31);
            dom.put("Apr", 30);
            dom.put("Maj", 31);
            dom.put("Jun", 30);
            dom.put("Jul", 31);
            dom.put("Aug", 31);
            dom.put("Sep", 30);
            dom.put("Okt", 31);
            dom.put("Nov", 30);
            dom.put("Dec", 31);
        }
        return dom;
    }

    public static JComboBox fyllVilkenComboSomHelst(JComboBox combobox, ArrayList<String> lista)
{
    combobox.removeAllItems();
    
    
    for(String item : lista)
    {
        combobox.addItem(item);
    }
    return combobox;   
}
    
    public static void fyllAr(JComboBox combobox, int startYear, int endYear)
    {
        combobox.removeAllItems();
       
        for(int i = startYear; i < endYear; i++)
        {
            combobox.addItem(i);
        }
    }
    public static void fyllManader(JComboBox combobox)
    {
        combobox.removeAllItems();
    
        for(String key : getManaderOchDagar().keySet())
        {
            combobox.addItem(key);
        }
    }
    public static void fyllDagar(JComboBox comboBox, String manad)
    {
        comboBox.removeAllItems();
        HashMap<String, Integer> dom = getManaderOchDagar();
        
        int antalDagar = dom.get(manad);
        
        for(int i = 1; i <= antalDagar; i++)
        {
            if(i < 10)
            {
                comboBox.addItem("0" + i);
            }
            else
            {
                comboBox.addItem(i);
            }
           
        }
        
    }
    public static String getManadsNummer(String manad)
    {
       LinkedHashMap<String, Integer> dom = getManaderOchDagar();
       
       Integer manadsTal = 1;
      
       
       for(String m : dom.keySet())
       {
           if(manad.equals(m))
           {
               break;
           }
           manadsTal++;
       }
       return manadsTal < 10 ? "0" + manadsTal.toString() : manadsTal.toString();
    }
    
}
