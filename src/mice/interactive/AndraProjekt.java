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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author pemo
 */
public class AndraProjekt extends javax.swing.JFrame {

    private InfDB databasen;
    /**
     * Creates new form laggTillProjekt
     */
    public AndraProjekt() {
        try {
            databasen = new InfDB("C:\\Program Files\\databasen\\MICEDB.FDB");
       
        } catch (InfException ex) {
            Logger.getLogger(Sokpanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setFyllProject();
        
        fyllAnstalld();
        fyllLedare();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        Overpanel = new javax.swing.JPanel();
        ValjProjektPanel = new javax.swing.JPanel();
        combChangeProject = new javax.swing.JComboBox();
        ValtProjektPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProjektJobbare = new javax.swing.JList();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblProjectLeaderName = new javax.swing.JLabel();
        lblProjektbeskrivning = new javax.swing.JLabel();
        LblProjektNamn = new javax.swing.JLabel();
        lblStartDatumbeskrivning = new javax.swing.JLabel();
        lblslutdatumbeskrivning = new javax.swing.JLabel();
        lblplattformbeskrivning = new javax.swing.JLabel();
        lblPlattformsNamn = new javax.swing.JLabel();
        lblStartdatum = new javax.swing.JLabel();
        lblSlutdatum = new javax.swing.JLabel();
        ValjAnstalldPanel = new javax.swing.JPanel();
        combAndraAnstalld = new javax.swing.JComboBox();
        jbnLäggTillAnställd = new javax.swing.JButton();
        jbnTaBortAnstalld = new javax.swing.JButton();
        SattLedarePanel = new javax.swing.JPanel();
        combSetLeader = new javax.swing.JComboBox();
        jbnSattNyLedare = new javax.swing.JButton();
        SattDatumPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton8.setText("jButton8");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Overpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Ändra Projekt"));

        ValjProjektPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Välj projekt"));

        combChangeProject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combChangeProject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combChangeProjectItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout ValjProjektPanelLayout = new javax.swing.GroupLayout(ValjProjektPanel);
        ValjProjektPanel.setLayout(ValjProjektPanelLayout);
        ValjProjektPanelLayout.setHorizontalGroup(
            ValjProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValjProjektPanelLayout.createSequentialGroup()
                .addComponent(combChangeProject, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 183, Short.MAX_VALUE))
        );
        ValjProjektPanelLayout.setVerticalGroup(
            ValjProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValjProjektPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combChangeProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ValtProjektPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Valt Projekt"));

        jScrollPane2.setViewportView(jListProjektJobbare);

        jLabel11.setText("Jobbar i projekt:");

        jLabel9.setText("Ledare:");

        lblProjectLeaderName.setText("<none>");

        lblProjektbeskrivning.setText("Projektnamn:");

        LblProjektNamn.setText("<none>");

        lblStartDatumbeskrivning.setText("Startdatum:");

        lblslutdatumbeskrivning.setText("Slutdatum:");

        lblplattformbeskrivning.setText("Plattformar:");

        lblPlattformsNamn.setText("<none>");

        lblStartdatum.setText("<none>");

        lblSlutdatum.setText("<none>");

        javax.swing.GroupLayout ValtProjektPanelLayout = new javax.swing.GroupLayout(ValtProjektPanel);
        ValtProjektPanel.setLayout(ValtProjektPanelLayout);
        ValtProjektPanelLayout.setHorizontalGroup(
            ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValtProjektPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ValtProjektPanelLayout.createSequentialGroup()
                        .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(lblStartDatumbeskrivning)
                            .addComponent(lblslutdatumbeskrivning)
                            .addComponent(lblplattformbeskrivning))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProjectLeaderName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlattformsNamn)
                            .addComponent(lblStartdatum)
                            .addComponent(lblSlutdatum)))
                    .addGroup(ValtProjektPanelLayout.createSequentialGroup()
                        .addComponent(lblProjektbeskrivning)
                        .addGap(29, 29, 29)
                        .addComponent(LblProjektNamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ValtProjektPanelLayout.setVerticalGroup(
            ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ValtProjektPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjektbeskrivning)
                    .addComponent(LblProjektNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblplattformbeskrivning)
                    .addComponent(lblPlattformsNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDatumbeskrivning)
                    .addComponent(lblStartdatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblslutdatumbeskrivning)
                    .addComponent(lblSlutdatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblProjectLeaderName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ValjAnstalldPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Välj anställd"));

        combAndraAnstalld.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combAndraAnstalld.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combAndraAnstalldItemStateChanged(evt);
            }
        });
        combAndraAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combAndraAnstalldActionPerformed(evt);
            }
        });

        jbnLäggTillAnställd.setText("lägg till");
        jbnLäggTillAnställd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnLäggTillAnställdActionPerformed(evt);
            }
        });

        jbnTaBortAnstalld.setText("Ta bort");
        jbnTaBortAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnTaBortAnstalldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ValjAnstalldPanelLayout = new javax.swing.GroupLayout(ValjAnstalldPanel);
        ValjAnstalldPanel.setLayout(ValjAnstalldPanelLayout);
        ValjAnstalldPanelLayout.setHorizontalGroup(
            ValjAnstalldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValjAnstalldPanelLayout.createSequentialGroup()
                .addComponent(combAndraAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnLäggTillAnställd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbnTaBortAnstalld)
                .addGap(17, 17, 17))
        );
        ValjAnstalldPanelLayout.setVerticalGroup(
            ValjAnstalldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValjAnstalldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ValjAnstalldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnLäggTillAnställd)
                    .addComponent(jbnTaBortAnstalld)
                    .addComponent(combAndraAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        SattLedarePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sätt ledare"));

        combSetLeader.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbnSattNyLedare.setText("Sätt ny ledare");
        jbnSattNyLedare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSattNyLedareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SattLedarePanelLayout = new javax.swing.GroupLayout(SattLedarePanel);
        SattLedarePanel.setLayout(SattLedarePanelLayout);
        SattLedarePanelLayout.setHorizontalGroup(
            SattLedarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SattLedarePanelLayout.createSequentialGroup()
                .addComponent(combSetLeader, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnSattNyLedare)
                .addGap(60, 60, 60))
        );
        SattLedarePanelLayout.setVerticalGroup(
            SattLedarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SattLedarePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SattLedarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combSetLeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnSattNyLedare))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SattDatumPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sätt Datum"));

        javax.swing.GroupLayout SattDatumPanelLayout = new javax.swing.GroupLayout(SattDatumPanel);
        SattDatumPanel.setLayout(SattDatumPanelLayout);
        SattDatumPanelLayout.setHorizontalGroup(
            SattDatumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        SattDatumPanelLayout.setVerticalGroup(
            SattDatumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout OverpanelLayout = new javax.swing.GroupLayout(Overpanel);
        Overpanel.setLayout(OverpanelLayout);
        OverpanelLayout.setHorizontalGroup(
            OverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ValjAnstalldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SattLedarePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(OverpanelLayout.createSequentialGroup()
                        .addGroup(OverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValjProjektPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValtProjektPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SattDatumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OverpanelLayout.setVerticalGroup(
            OverpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ValjProjektPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValtProjektPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SattLedarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValjAnstalldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SattDatumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Overpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Overpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combChangeProjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combChangeProjectItemStateChanged
        displayProjectInfo();
    }//GEN-LAST:event_combChangeProjectItemStateChanged

    private void jbnTaBortAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnTaBortAnstalldActionPerformed
        if(combChangeProject.getSelectedItem().toString().equals("Byt Projekt <inget valt>"))
        {
              
            JOptionPane.showMessageDialog(rootPane, "Välj ett projekt att ta bort nån från");
            return;
        }
        if(combAndraAnstalld.getSelectedItem().toString().equals("<none>"))
        {
            JOptionPane.showMessageDialog(rootPane, "Välj en anställd att ta bort");
            return;
        }
        
        boolean finnsI = false;
        ListModel model = jListProjektJobbare.getModel();
        for( int i = 0; i < model.getSize(); i++)
        {
            if (model.getElementAt(i).toString().equals(combAndraAnstalld.getSelectedItem().toString()))
            {
                finnsI = true;
            }

        }
        if (finnsI)
        {
        String valdAnstalld = combAndraAnstalld.getSelectedItem().toString();
        String anvnamn = valdAnstalld.substring((valdAnstalld.indexOf("(") + 1),
            valdAnstalld.indexOf(")"));
        String valtProjekt = combChangeProject.getSelectedItem().toString();

        String aid = konverteraTillAid(anvnamn);
        String sid = konverteraTillSid(valtProjekt);

        String query = "delete from ARBETAR_I where AID =" + " '" + aid + "' and SID" + "= '" + sid + "';";

        try {
            databasen.delete(query);
        }
        catch (InfException ex)
        {
        }
        setProjectlist();
        }
        
        else
        {  
            JOptionPane.showMessageDialog(rootPane, "Kan ju inte ta bort nån som inte jobbar vettu");
            finnsI = false;
            return;
        }
    }//GEN-LAST:event_jbnTaBortAnstalldActionPerformed

    private void jbnLäggTillAnställdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnLäggTillAnställdActionPerformed

        if(LblProjektNamn.getText().equals("<none>"))
        {
            JOptionPane.showMessageDialog(rootPane, "Välj ett Projekt du kan lägga till en anställd för");
            return;
        }
        
        if(combAndraAnstalld.getSelectedItem().toString().equals("<none>"))
        {
            JOptionPane.showMessageDialog(rootPane, "Välj en anställd");
            return;
        }
        boolean finnsI = false;
        ListModel model = jListProjektJobbare.getModel();
        for( int i = 0; i < model.getSize(); i++)
        {
            if(model.getElementAt(i).toString().equals(combAndraAnstalld.getSelectedItem().toString()))
            {
                finnsI = true;
            }

        }
        if (finnsI)
        {
            JOptionPane.showMessageDialog(rootPane, "Den anställde jobbar redan i projektet");
            return;
        }
        String valdAnstalld = combAndraAnstalld.getSelectedItem().toString();
        String anvnamn = valdAnstalld.substring((valdAnstalld.indexOf("(") + 1),
            valdAnstalld.indexOf(")"));
        String valtProjekt = combChangeProject.getSelectedItem().toString();

        String aid = konverteraTillAid(anvnamn);
        String sid = konverteraTillSid(valtProjekt);

        String query = "insert into ARBETAR_I (AID, SID) values('" + aid + "','" + sid + "');";

        try {
            databasen.insert(query);
        }
        catch (InfException ex)
        {
        }
        setProjectlist();

    }//GEN-LAST:event_jbnLäggTillAnställdActionPerformed

    private void combAndraAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combAndraAnstalldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combAndraAnstalldActionPerformed

    private void combAndraAnstalldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combAndraAnstalldItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combAndraAnstalldItemStateChanged

    private void jbnSattNyLedareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSattNyLedareActionPerformed
    
        if(combSetLeader.getSelectedItem().toString().equals("<Välj ny ledare>"))
        {
            JOptionPane.showMessageDialog(rootPane, "Du måste välja ut en ny ledare ur boxen Välj ny ledare!");
            return;
        
        }
        
        if(combSetLeader.getSelectedItem().toString().equals(lblProjectLeaderName.getText()))
        
        {
            JOptionPane.showMessageDialog(rootPane, "Du bör nog välja en ledare som inte redan är ledare för projektet");
            return;
        }
        if(lblProjectLeaderName.getText().equals("<none>"))
        
        
        {
            JOptionPane.showMessageDialog(rootPane, "Välj ett projekt som du kan sätta en ledare för");
            return;
        }
        String valdledare = combSetLeader.getSelectedItem().toString();
        String anvnamn = valdledare.substring((valdledare.indexOf("(") + 1),
            valdledare.indexOf(")"));
        String spel = combChangeProject.getSelectedItem().toString();
        String aid = konverteraTillAid(anvnamn);
        String query = "UPDATE SPELPROJEKT SET AID = '" + aid + "' where Spelprojekt.beteckning = '" + spel + "';";
        try {
            databasen.update(query);
            lblProjectLeaderName.setText(databasen.fetchSingle("SELECT ANSTALLD.NAMN FROM ANSTALLD WHERE AID = (SELECT AID FROM SPELPROJEKT WHERE BETECKNING = '" + spel + "');"));
        } catch (InfException ex) {
            Logger.getLogger(AndraProjekt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jbnSattNyLedareActionPerformed

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
            java.util.logging.Logger.getLogger(AndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraProjekt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblProjektNamn;
    private javax.swing.JPanel Overpanel;
    private javax.swing.JPanel SattDatumPanel;
    private javax.swing.JPanel SattLedarePanel;
    private javax.swing.JPanel ValjAnstalldPanel;
    private javax.swing.JPanel ValjProjektPanel;
    private javax.swing.JPanel ValtProjektPanel;
    private javax.swing.JComboBox combAndraAnstalld;
    private javax.swing.JComboBox combChangeProject;
    private javax.swing.JComboBox combSetLeader;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListProjektJobbare;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbnLäggTillAnställd;
    private javax.swing.JButton jbnSattNyLedare;
    private javax.swing.JButton jbnTaBortAnstalld;
    private javax.swing.JLabel lblPlattformsNamn;
    private javax.swing.JLabel lblProjectLeaderName;
    private javax.swing.JLabel lblProjektbeskrivning;
    private javax.swing.JLabel lblSlutdatum;
    private javax.swing.JLabel lblStartDatumbeskrivning;
    private javax.swing.JLabel lblStartdatum;
    private javax.swing.JLabel lblplattformbeskrivning;
    private javax.swing.JLabel lblslutdatumbeskrivning;
    // End of variables declaration//GEN-END:variables

    private void setFyllProject() {
        
        String query = "SELECT BETECKNING FROM SPELPROJEKT ORDER BY BETECKNING ASC";
        try {
            
            combChangeProject.removeAllItems();
            ArrayList<String> projekten = databasen.fetchColumn(query);
            combChangeProject.addItem("Byt Projekt <inget valt>");
            for(String projekt : projekten)
            {
                combChangeProject.addItem(projekt);
                
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    private void fyllLedare() {
        String query = "SELECT ANSTALLD.NAMN, ANSTALLD.ANVNAMN FROM PROJEKTLEDARE\n" +
                       "JOIN ANSTALLD ON PROJEKTLEDARE.AID = ANSTALLD.AID\n" +
                       "ORDER BY NAMN ASC";
        try {
            
            combSetLeader.removeAllItems();
            ArrayList<HashMap<String,String>> ledarLista = new ArrayList<>();
           ledarLista = databasen.fetchRows(query);
            combSetLeader.addItem("<Välj ny ledare>");
            for(HashMap<String,String> ledare : ledarLista)
            {
                String enLedare = ledare.get("NAMN") + " (" + ledare.get("ANVNAMN") + ")";
                combSetLeader.addItem(enLedare);
                
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
    private void fyllAnstalld() {
       String query = "SELECT ANSTALLD.NAMN, ANSTALLD.ANVNAMN FROM ANSTALLD ORDER BY NAMN ASC";
        try {
            
            combAndraAnstalld.removeAllItems();
            ArrayList<HashMap<String,String>> anstalldLista = new ArrayList<>();
            anstalldLista = databasen.fetchRows(query);
            combAndraAnstalld.addItem("<none>");
            for(HashMap<String,String> anstalld : anstalldLista)
            {
                
                String enAnstalld = anstalld.get("NAMN")+ " (" + anstalld.get("ANVNAMN") + ")";
                combAndraAnstalld.addItem(enAnstalld);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    private void displayProjectInfo()
    {
        jListProjektJobbare.setModel(new DefaultListModel());
       if( setProjectNamelabel())
       {
         setProjectLeaderName();
         setProjectlist();
        
       }
        
        
           
    }

    private boolean setProjectNamelabel() {
        
        int selectedIndex = combChangeProject.getSelectedIndex();
        if (selectedIndex == -1) {
            return false;
        }
        if (selectedIndex == 0) {
            LblProjektNamn.setText("<none>");
            lblProjectLeaderName.setText("<none>");
            lblPlattformsNamn.setText("<none>");
            lblStartdatum.setText("<none>");
            lblSlutdatum.setText("<none>");
            return false;
        }
        String selectedProject = combChangeProject.getSelectedItem().toString();
        LblProjektNamn.setText(selectedProject);
        return true;
       
    }

    private void setProjectLeaderName() 
    {
        try {
            String spelprojekt = combChangeProject.getSelectedItem().toString();
            String query = "SELECT ANSTALLD.NAMN FROM PROJEKTLEDARE " +
                    "JOIN ANSTALLD ON PROJEKTLEDARE.AID = ANSTALLD.AID " +
                    "JOIN SPELPROJEKT ON PROJEKTLEDARE.AID = SPELPROJEKT.AID "
                    + "WHERE SPELPROJEKT.BETECKNING = '" + spelprojekt + "'";
            
            String ledare = databasen.fetchSingle(query);
            if(ledare != null){
            lblProjectLeaderName.setText(ledare);
            }
            
        } catch (InfException ex) {
        }
    }

    private void setProjectlist() 
    {
    try {
        DefaultListModel DLM = new DefaultListModel();
        String spelprojekt = combChangeProject.getSelectedItem().toString();
        String query = "SELECT ANSTALLD.NAMN, ANSTALLD.ANVNAMN FROM ANSTALLD join ARBETAR_I on ANSTALLD.AID = ARBETAR_I.AID"
                     + " JOIN SPELPROJEKT on ARBETAR_I.SID = SPELPROJEKT.SID "
                     + "WHERE SPELPROJEKT.BETECKNING = '" + spelprojekt + "'";
            ArrayList<HashMap<String,String>> anstallda = new ArrayList<>();
            anstallda = databasen.fetchRows(query);
            for(HashMap<String,String> anstalld : anstallda)
            {
               String enAnstalld = anstalld.get("NAMN")+ " (" + anstalld.get("ANVNAMN") + ")";
               DLM.addElement(enAnstalld);
            }
            jListProjektJobbare.setModel(DLM);
        } 
    catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "bajs!" + ex.getMessage());
        }

    }
    private String konverteraTillAid(String anvNamn)
    {
        
        String aid = "";
        
       
        String query = "SELECT AID FROM ANSTALLD WHERE ANVNAMN = '" + anvNamn + "'";
        try{
            aid = databasen.fetchSingle(query);
        }
        catch(InfException ex)
        {
            System.out.println("BLÄV FÄL!");
        }
        
        
        return aid;
    }
    private String konverteraTillSid(String valtProject)
    { 
        String sid = "";
        try {
           
            String query = "SELECT SPELPROJEKT.SID FROM SPELPROJEKT where BETECKNING = '" + valtProject + "'";
            sid = databasen.fetchSingle(query);
            }
            catch (InfException ex) 
             {
             }
        return sid;
            
     } 

    private void setProjectdatum() {
        
        
    
    }
    
}