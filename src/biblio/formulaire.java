/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package biblio;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import biblio.inscription; // le package de ta classe Inscription
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author CLOVIS
 */
public class formulaire extends javax.swing.JFrame {
    
 private int essaisRestants = 3;
 



        public formulaire() {
    initComponents(); 
             setLocationRelativeTo(null); // Centrer la fenêtre

      Authenttic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/authentic.png")));
 
}

         
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtseconecter = new javax.swing.JButton();
        btnsinscrire = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        textlogin = new javax.swing.JTextField();
        mdpauthentification = new javax.swing.JLabel();
        txtmdp = new javax.swing.JPasswordField();
        Authenttic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtseconecter.setBackground(new java.awt.Color(0, 153, 153));
        txtseconecter.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        txtseconecter.setForeground(new java.awt.Color(255, 255, 255));
        txtseconecter.setText("Se Connecter");
        txtseconecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtseconecterActionPerformed(evt);
            }
        });

        btnsinscrire.setBackground(new java.awt.Color(0, 153, 153));
        btnsinscrire.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        btnsinscrire.setForeground(new java.awt.Color(255, 255, 255));
        btnsinscrire.setText("S'inscrire");
        btnsinscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinscrireActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Nom Utilisateur");

        mdpauthentification.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        mdpauthentification.setForeground(new java.awt.Color(255, 255, 255));
        mdpauthentification.setText("Mot de Passe");

        Authenttic.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        Authenttic.setForeground(new java.awt.Color(255, 181, 54));
        Authenttic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/authentic.png"))); // NOI18N
        Authenttic.setText("Formulaire d'authentification");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mdpauthentification, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtseconecter, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textlogin)
                                            .addComponent(txtmdp)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnsinscrire, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addGap(73, 73, 73)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Authenttic, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Authenttic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(textlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdpauthentification)
                    .addComponent(txtmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtseconecter, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsinscrire, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsinscrireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinscrireActionPerformed
              inscription inscriptionPage = new inscription(); // Le nom de ta classe JFrame d’inscription
    inscriptionPage.setVisible(true);
    this.dispose(); // Ferme la page actuelle (connexion)




    }//GEN-LAST:event_btnsinscrireActionPerformed
                     
    private void txtseconecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtseconecterActionPerformed
        // TODO add your handling code here:
         // Récupérer les identifiants saisis
     String login = textlogin.getText(); // Récupère le texte du champ login
    String motDePasse = new String(txtmdp.getPassword()); // Récupère le mot de passe

        if (login.equals("admin") && motDePasse.equals("1234")) {
    new Accueil().setVisible(true);
    dispose();
            JOptionPane.showMessageDialog(this, "Bienvenue Admin ");

} else {
    // Requête SQL pour les autres utilisateurs
    try (Connection conn = DBConnexion.getConnection();
     PreparedStatement stmt = conn.prepareStatement(
         "SELECT * FROM utilisateurs WHERE (CONCAT(nom, ' ', prenom) = ? OR email = ?) AND mot_de_passe = ?"
     )) {

    String motdepasseHashe = PasswordUtils.hashPassword(motDePasse); // on hache le mot de passe saisi

    stmt.setString(1, login);              // nom complet
    stmt.setString(2, login);              // ou email
    stmt.setString(3, motdepasseHashe);    // mot de passe haché ici ✅

    ResultSet rs = stmt.executeQuery();
    
        if (rs.next()) {
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String email = rs.getString("email");
            AccueilUser accueil = new AccueilUser(nom, prenom, email);
            accueil.setVisible(true);
            dispose();
         JOptionPane.showMessageDialog(this, "Bienvenue " + nom + " " + prenom);
        } 
        
          else {
        essaisRestants--; // Diminue le compteur d'essais restants
        System.out.println("Essais restants : " + essaisRestants); // Débogage console

        if (essaisRestants > 0) {
            // Affiche un message d'erreur et vide les champs
            JOptionPane.showMessageDialog(this, "Identifiant ou mot de passe incorrect ! Tentatives restantes : " + essaisRestants);
            textlogin.setText(""); // Efface le champ login
            txtmdp.setText(""); // Efface le champ mot de passe
        } else {
            // Bloque l'accès après épuisement des tentatives
            JOptionPane.showMessageDialog(this, "Trop de tentatives incorrectes. Veuillez patienter 30 secondes !");
            txtseconecter.setEnabled(false); // Désactive le bouton "Se connecter"

            // Réactiver le bouton après 30 secondes
            Timer timer = new Timer(30000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    essaisRestants = 3; // Réinitialise les tentatives
                    txtseconecter.setEnabled(true); // Réactive le bouton
                    JOptionPane.showMessageDialog(null, "Vous pouvez maintenant réessayer !");
                }
            });
            timer.setRepeats(false); // Assure que le Timer ne se répète pas
            timer.start(); // Démarre le Timer
        }
        
    }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur Lors de la Connection : " + ex.getMessage());
    }
}   
        
       
    
        
                     
       // Récupérer les identifiants saisis

  

    }//GEN-LAST:event_txtseconecterActionPerformed

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
            java.util.logging.Logger.getLogger(formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulaire().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Authenttic;
    private javax.swing.JButton btnsinscrire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel login;
    private javax.swing.JLabel mdpauthentification;
    private javax.swing.JTextField textlogin;
    private javax.swing.JPasswordField txtmdp;
    private javax.swing.JButton txtseconecter;
    // End of variables declaration//GEN-END:variables
}
