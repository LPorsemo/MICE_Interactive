/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mice.interactive;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author pemo
 */
public class VisaProjekt extends javax.swing.JFrame {

    
    private InfDB databasen;
    private DatabaseManager dbManager;
    /**
     * Creates new form VisaProjekt
     */
    public VisaProjekt() 
    
    {
        dbManager = new DatabaseManager();
        try {
            databasen = new InfDB("C:\\Program Files\\databasen\\MICEDB.FDB");
       
        } catch (InfException ex) {
            Logger.getLogger(Sokpanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setFyllProject();
        fyllReleaseSpelLista();
        fyllPagaendeSpelLista();
        fyllKommandeSpelLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListReleasadeSpel = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListPagaendeSpel = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListKommandeProjekt = new javax.swing.JList();
        ValjProjektPanel = new javax.swing.JPanel();
        combChangeProject = new javax.swing.JComboBox();
        ValtProjektPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblProjectLeaderName = new javax.swing.JLabel();
        lblProjektbeskrivning = new javax.swing.JLabel();
        LblProjektNamn = new javax.swing.JLabel();
        lblStartDatumbeskrivning = new javax.swing.JLabel();
        lblslutdatumbeskrivning = new javax.swing.JLabel();
        lblStartdatum = new javax.swing.JLabel();
        lblSlutdatum = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListProjektJobbare = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListPlattformar = new javax.swing.JList();
        jPanel7 = new javax.swing.JPanel();
        jbnSystemMeny = new javax.swing.JButton();
        jbnLäggTillProjekt = new javax.swing.JButton();
        jbnUppdateraProjekt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Realeasade Spel"));

        jScrollPane1.setViewportView(ListReleasadeSpel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Spel Under Utveckling"));

        jScrollPane2.setViewportView(ListPagaendeSpel);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Kommande Spelprojekt"));

        jScrollPane3.setViewportView(ListKommandeProjekt);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

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
                .addContainerGap()
                .addComponent(combChangeProject, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        ValjProjektPanelLayout.setVerticalGroup(
            ValjProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValjProjektPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combChangeProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ValtProjektPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Valt Projekt"));

        jLabel9.setText("Ledare:");

        lblProjectLeaderName.setText("<none>");

        lblProjektbeskrivning.setText("Projektnamn:");

        LblProjektNamn.setText("<none>");

        lblStartDatumbeskrivning.setText("Startdatum:");

        lblslutdatumbeskrivning.setText("Slutdatum:");

        lblStartdatum.setText("<none>");

        lblSlutdatum.setText("<none>");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Jobbar i projekt"));

        jScrollPane4.setViewportView(jListProjektJobbare);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Plattformar"));

        jScrollPane5.setViewportView(jListPlattformar);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ValtProjektPanelLayout = new javax.swing.GroupLayout(ValtProjektPanel);
        ValtProjektPanel.setLayout(ValtProjektPanelLayout);
        ValtProjektPanelLayout.setHorizontalGroup(
            ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValtProjektPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ValtProjektPanelLayout.createSequentialGroup()
                        .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ValtProjektPanelLayout.createSequentialGroup()
                                .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ValtProjektPanelLayout.createSequentialGroup()
                                        .addComponent(lblProjektbeskrivning)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ValtProjektPanelLayout.createSequentialGroup()
                                        .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblslutdatumbeskrivning, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(ValtProjektPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LblProjektNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(lblSlutdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblProjectLeaderName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ValtProjektPanelLayout.createSequentialGroup()
                                .addComponent(lblStartDatumbeskrivning)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(lblStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(262, 262, 262))
            .addGroup(ValtProjektPanelLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Gå till"));

        jbnSystemMeny.setText("System meny");
        jbnSystemMeny.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnSystemMenyMouseClicked(evt);
            }
        });

        jbnLäggTillProjekt.setText("Lägg till projekt");
        jbnLäggTillProjekt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnLäggTillProjektMouseClicked(evt);
            }
        });

        jbnUppdateraProjekt.setText("Uppdatera Projekt");
        jbnUppdateraProjekt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnUppdateraProjektMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbnSystemMeny, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbnUppdateraProjekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbnLäggTillProjekt)
                .addGap(25, 25, 25))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnSystemMeny)
                    .addComponent(jbnLäggTillProjekt)
                    .addComponent(jbnUppdateraProjekt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValjProjektPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(ValtProjektPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ValjProjektPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ValtProjektPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combChangeProjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combChangeProjectItemStateChanged
    displayProjectInfo();
    }//GEN-LAST:event_combChangeProjectItemStateChanged

    private void jbnSystemMenyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnSystemMenyMouseClicked
        // TODO add your handling code here:
        Inloggad InloggadFrame = new Inloggad();
        InloggadFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnSystemMenyMouseClicked

    private void jbnLäggTillProjektMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnLäggTillProjektMouseClicked
        // TODO add your handling code here:
        LaggTillSpelProjekt LaggTillSpelProjektFrame = new LaggTillSpelProjekt();
        LaggTillSpelProjektFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnLäggTillProjektMouseClicked

    private void jbnUppdateraProjektMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnUppdateraProjektMouseClicked
        // TODO add your handling code here:
        AndraProjekt AndraProjektFrame = new AndraProjekt(); 
        AndraProjektFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnUppdateraProjektMouseClicked

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
            java.util.logging.Logger.getLogger(VisaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisaProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisaProjekt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblProjektNamn;
    private javax.swing.JList ListKommandeProjekt;
    private javax.swing.JList ListPagaendeSpel;
    private javax.swing.JList ListReleasadeSpel;
    private javax.swing.JPanel ValjProjektPanel;
    private javax.swing.JPanel ValtProjektPanel;
    private javax.swing.JComboBox combChangeProject;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListPlattformar;
    private javax.swing.JList jListProjektJobbare;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbnLäggTillProjekt;
    private javax.swing.JButton jbnSystemMeny;
    private javax.swing.JButton jbnUppdateraProjekt;
    private javax.swing.JLabel lblProjectLeaderName;
    private javax.swing.JLabel lblProjektbeskrivning;
    private javax.swing.JLabel lblSlutdatum;
    private javax.swing.JLabel lblStartDatumbeskrivning;
    private javax.swing.JLabel lblStartdatum;
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
        private void displayProjectInfo()
    {
        jListProjektJobbare.setModel(new DefaultListModel());
        jListPlattformar.setModel(new DefaultListModel());
        
       if( setProjectNamelabel())
       {
         setProjectLeaderName();
         setAnstalldaIProjekt();
         setPlattformList();
         setProjectStartdate();
         setProjectEnddate();
         
        
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
            if(ledare == null)
            {
                lblProjectLeaderName.setText("<none>");
            }
            else
            {
                lblProjectLeaderName.setText(ledare);
            }
        } catch (InfException ex) {
        }
    }

    private void setAnstalldaIProjekt() 
    {
    try {
        DefaultListModel DLM = new DefaultListModel();
        String spelprojekt = combChangeProject.getSelectedItem().toString();
        String query = "SELECT ANSTALLD.NAMN, ANSTALLD.ANVNAMN FROM ANSTALLD join ARBETAR_I on ANSTALLD.AID = ARBETAR_I.AID"
                     + " JOIN SPELPROJEKT on ARBETAR_I.SID = SPELPROJEKT.SID "
                     + "WHERE SPELPROJEKT.BETECKNING = '" + spelprojekt + "'";
            ArrayList<HashMap<String,String>> anstallda = new ArrayList<>();
            anstallda = databasen.fetchRows(query);
            if(anstallda != null)
            {
                for(HashMap<String,String> anstalld : anstallda)
                {
                    String enAnstalld = anstalld.get("NAMN")+ " (" + anstalld.get("ANVNAMN") + ")";
                    DLM.addElement(enAnstalld);
                }
            
            
            
            }
            jListProjektJobbare.setModel(DLM);

        }
        catch (InfException ex) 
                {
                JOptionPane.showMessageDialog(null, "bajs!" + ex.getMessage());
                }
            
        
    }
    private void setPlattformList()
    {
         try {
        DefaultListModel DLM = new DefaultListModel();
        String spelprojekt = combChangeProject.getSelectedItem().toString();
        String query = "SELECT PLATTFORM.BENAMNING FROM INNEFATTAR" 
        + " join PLATTFORM on INNEFATTAR.PID = PLATTFORM.PID"
        + " join SPELPROJEKT on INNEFATTAR.SID = SPELPROJEKT.SID"        
        + " WHERE INNEFATTAR.SID = (SELECT SID FROM SPELPROJEKT WHERE BETECKNING = '" + spelprojekt + "');";
            ArrayList<String> plattformar = new ArrayList<>();
            plattformar = databasen.fetchColumn(query);
            if(plattformar != null)
            {
                for (String plattform : plattformar)
                {
                    DLM.addElement(plattform);
                }
            
            jListPlattformar.setModel(DLM);
            }
            else
            {
                jListPlattformar.setModel(DLM);
                setProjectStartdate();
            }
        } 
    catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "fel!" + ex.getMessage());
        }
    }

    private void setProjectStartdate() {
        try {
            String spelprojekt = combChangeProject.getSelectedItem().toString();
            String query = "SELECT STARTDATUM FROM SPELPROJEKT"
                    + " WHERE SPELPROJEKT.BETECKNING = '" + spelprojekt + "'";
            
            String datum = databasen.fetchSingle(query);
            if(datum != null){
            lblStartdatum.setText(datum);
            }
            else
            {
                lblStartdatum.setText("<none>");
            }
        } catch (InfException ex) {
        }
    }

    private void setProjectEnddate() {
        
        try {
            String spelprojekt = combChangeProject.getSelectedItem().toString();
            String query = "SELECT RELEASEDATUM FROM SPELPROJEKT"
                    + " WHERE SPELPROJEKT.BETECKNING = '" + spelprojekt + "'";
            
            String datum = databasen.fetchSingle(query);
            if(datum != null){
            lblSlutdatum.setText(datum);
            }
            else
            {
                lblSlutdatum.setText("<none>");
            }
        } catch (InfException ex) {
        }
    }
    private void fyllReleaseSpelLista()
    {        
        ArrayList<String> spelprojekt = dbManager.getGammlaSpelprojektLista();
        DefaultListModel Spelprojekt = new DefaultListModel();
        if(spelprojekt != null)
        for(int i = 0; i < spelprojekt.size(); i++)
        {
            
            {
            Spelprojekt.addElement(spelprojekt.get(i));
            }
        }
        ListReleasadeSpel.setModel(Spelprojekt);
    }
    
    private void fyllPagaendeSpelLista()
    {        
        ArrayList<String> spelprojekt = dbManager.getPagaendeSpelprojektLista();
        DefaultListModel Spelprojekt = new DefaultListModel();
        if(spelprojekt != null)
        for(int i = 0; i < spelprojekt.size(); i++)
        {
            
            {
            Spelprojekt.addElement(spelprojekt.get(i));
            }
        }
        ListPagaendeSpel.setModel(Spelprojekt);
    }
    
        private void fyllKommandeSpelLista()
    {        
        ArrayList<String> spelprojekt = dbManager.getKommandeSpelprojektLista();
        DefaultListModel Spelprojekt = new DefaultListModel();
        if(spelprojekt != null)
        for(int i = 0; i < spelprojekt.size(); i++)
        {
            
            {
            Spelprojekt.addElement(spelprojekt.get(i));
            }
        }
        
        ListKommandeProjekt.setModel(Spelprojekt);
    }
    
    
}
