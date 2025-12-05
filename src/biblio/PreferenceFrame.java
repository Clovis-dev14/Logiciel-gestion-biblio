/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package biblio;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Locale;


/**
 *
 * @author CLOVIS
 */
public class PreferenceFrame extends javax.swing.JInternalFrame {

  

    /**
     * Creates new form PreferenceFrame
     */
    public PreferenceFrame() {
        initComponents();
                          ThemeManager.appliquerTheme(this.getContentPane());


            }
  
 


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CheckBoxNotification = new javax.swing.JCheckBox();
        CheckBoxModeSombre = new javax.swing.JCheckBox();
        btnSauvegarder = new javax.swing.JButton();
        btnFermerPref = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 181, 54));
        jLabel1.setText("     Préférences");

        CheckBoxNotification.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        CheckBoxNotification.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxNotification.setText("Activer les notifications");

        CheckBoxModeSombre.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        CheckBoxModeSombre.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxModeSombre.setText("Mode Sombre");
        CheckBoxModeSombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxModeSombreActionPerformed(evt);
            }
        });

        btnSauvegarder.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        btnSauvegarder.setText("Sauvegarder");
        btnSauvegarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauvegarderActionPerformed(evt);
            }
        });

        btnFermerPref.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        btnFermerPref.setText("Fermer");
        btnFermerPref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerPrefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnSauvegarder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFermerPref)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(CheckBoxNotification)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(CheckBoxModeSombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxModeSombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSauvegarder)
                    .addComponent(btnFermerPref))
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSauvegarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauvegarderActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(this, "Préférences sauvegardées !");
    }//GEN-LAST:event_btnSauvegarderActionPerformed

    private void btnFermerPrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerPrefActionPerformed
        // TODO add your handling code here:
         this.dispose(); // Ferme la fenêtre
    }//GEN-LAST:event_btnFermerPrefActionPerformed

    private void CheckBoxModeSombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxModeSombreActionPerformed
        // TODO add your handling code here:

    JCheckBox source = (JCheckBox) evt.getSource();

    // Obtenir la fenêtre principale (AccueilUser ou AccueilAdmin)
    JFrame fenetrePrincipale = (JFrame) SwingUtilities.getWindowAncestor(this);

    if (source.isSelected()) {
        ThemeManager.changerTheme(ThemeManager.Theme.SOMBRE, fenetrePrincipale);
    } else {
        ThemeManager.changerTheme(ThemeManager.Theme.CLAIR, fenetrePrincipale);
    }



    }//GEN-LAST:event_CheckBoxModeSombreActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxModeSombre;
    private javax.swing.JCheckBox CheckBoxNotification;
    private javax.swing.JButton btnFermerPref;
    private javax.swing.JButton btnSauvegarder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
