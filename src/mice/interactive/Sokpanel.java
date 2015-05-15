/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mice.interactive;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author pemo
 */
public class Sokpanel extends javax.swing.JFrame {

    private InfDB databasen;
    /**
     * Creates new form Inoggad
     */
    public Sokpanel() {
        try {
            databasen = new InfDB("C:\\Program Files\\databasen\\MICEDB.FDB");
       
        } catch (InfException ex) {
            Logger.getLogger(Sokpanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        fyllCombKompetensDoman();
        fyllKompetens();
        fyllProjekt();
        fyllPlattform();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSidNamn = new javax.swing.JLabel();
        labelSok = new javax.swing.JLabel();
        txtSokPerson = new javax.swing.JTextField();
        labelResultat = new javax.swing.JLabel();
        scrollResultat = new javax.swing.JScrollPane();
        listResultat = new javax.swing.JList();
        labelKunskapDoman = new javax.swing.JLabel();
        combKompetensDoman = new javax.swing.JComboBox();
        labelProjekt = new javax.swing.JLabel();
        combProjekt = new javax.swing.JComboBox();
        labelKompetens = new javax.swing.JLabel();
        combKompetens = new javax.swing.JComboBox();
        labelLedare = new javax.swing.JLabel();
        combLedare = new javax.swing.JComboBox();
        labelPlattform = new javax.swing.JLabel();
        combPlattform = new javax.swing.JComboBox();
        jbnSok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSidNamn.setText("Sök Personal");

        labelSok.setText("Sök Person:");

        labelResultat.setText("Resultat");

        listResultat.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollResultat.setViewportView(listResultat);

        labelKunskapDoman.setText("KunskapsDomän");

        combKompetensDoman.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combKompetensDoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combKompetensDomanActionPerformed(evt);
            }
        });

        labelProjekt.setText("Projekt");

        combProjekt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combProjektActionPerformed(evt);
            }
        });

        labelKompetens.setText("Kompetens");

        combKompetens.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combKompetens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combKompetensActionPerformed(evt);
            }
        });

        labelLedare.setText("Ledare");

        combLedare.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelPlattform.setText("Plattform");

        combPlattform.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combPlattform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combPlattformActionPerformed(evt);
            }
        });

        jbnSok.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSok)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSokPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbnSok, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLedare)
                            .addComponent(combLedare, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProjekt)
                            .addComponent(labelPlattform)
                            .addComponent(combProjekt, 0, 276, Short.MAX_VALUE)
                            .addComponent(combPlattform, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKunskapDoman)
                            .addComponent(combKompetensDoman, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelKompetens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combKompetens, 0, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(scrollResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(labelSidNamn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelResultat)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelSidNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(labelResultat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSok)
                            .addComponent(txtSokPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKunskapDoman)
                            .addComponent(labelKompetens))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combKompetensDoman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combKompetens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLedare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combLedare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelProjekt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(labelPlattform)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combPlattform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbnSok, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollResultat))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combKompetensDomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combKompetensDomanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combKompetensDomanActionPerformed

    private void combKompetensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combKompetensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combKompetensActionPerformed

    private void combProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combProjektActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combProjektActionPerformed

    private void combPlattformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combPlattformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combPlattformActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sokpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sokpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sokpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sokpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sokpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combKompetens;
    private javax.swing.JComboBox combKompetensDoman;
    private javax.swing.JComboBox combLedare;
    private javax.swing.JComboBox combPlattform;
    private javax.swing.JComboBox combProjekt;
    private javax.swing.JButton jbnSok;
    private javax.swing.JLabel labelKompetens;
    private javax.swing.JLabel labelKunskapDoman;
    private javax.swing.JLabel labelLedare;
    private javax.swing.JLabel labelPlattform;
    private javax.swing.JLabel labelProjekt;
    private javax.swing.JLabel labelResultat;
    private javax.swing.JLabel labelSidNamn;
    private javax.swing.JLabel labelSok;
    private javax.swing.JList listResultat;
    private javax.swing.JScrollPane scrollResultat;
    private javax.swing.JTextField txtSokPerson;
    // End of variables declaration//GEN-END:variables

    private void fyllCombKompetensDoman() {
        
        String query = "SELECT BENAMNING FROM KOMPETENSDOMAN ORDER BY BENAMNING ASC";
        try {
            combKompetensDoman.removeAllItems();
            ArrayList<String> domaner = databasen.fetchColumn(query);
            combKompetensDoman.addItem("None");
            for(String doman : domaner)
            {
                combKompetensDoman.addItem(doman);
                
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(labelKompetens, "Ingen data kunde hittas. grymt fel här!");
        }
    }
    private void fyllKompetens(){
       
                combKompetens.removeAllItems();
                combKompetens.addItem("None");
                combKompetens.addItem("1");
                combKompetens.addItem("2");
                combKompetens.addItem("3");
                combKompetens.addItem("4");
                combKompetens.addItem("5");
    }

    private void fyllProjekt() {
        
        String query = "SELECT BETECKNING FROM SPELPROJEKT ORDER BY BETECKNING ASC";
        try {
            
            combProjekt.removeAllItems();
            ArrayList<String> projekten = databasen.fetchColumn(query);
            combProjekt.addItem("None");
            for(String projekt : projekten)
            {
                combProjekt.addItem(projekt);
                
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(labelKompetens, "Ingen data kunde hittas. grymt fel här!");
        }
    }
     private void fyllPlattform() {
        
        String query = "SELECT BENAMNING FROM PLATTFORM ORDER BY BENAMNING ASC";
        try {
            
            combPlattform.removeAllItems();
            ArrayList<String> plattformarna = databasen.fetchColumn(query);
            combPlattform.addItem("None");
            for(String plattform : plattformarna)
            {
                combPlattform.addItem(plattform);
                
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(labelKompetens, "Ingen data kunde hittas. grymt fel här!");
        }
    }
}