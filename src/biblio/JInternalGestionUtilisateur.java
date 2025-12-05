/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package biblio;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;




/**
 *
 * @author CLOVIS
 */
public class JInternalGestionUtilisateur extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalGestionUtilisateur
     *
     */

    public JInternalGestionUtilisateur() {
        initComponents();
        
                  ThemeManager.appliquerTheme(this.getContentPane());

                roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  "utilisateur", "admin" }));

        
    }
    
    
    public static String hacherMotDePasse(String motDePasse) {
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(motDePasse.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    } catch (NoSuchAlgorithmException e) {
        throw new RuntimeException("Erreur de hachage", e);
    }
}

    
    
    public void chargerUtilisateurs() {
    DefaultTableModel model = (DefaultTableModel) tableUtilisateurs.getModel();
    model.setRowCount(0); // Vide le tableau

    try (Connection conn = DBConnexion.getConnection()) {
        String sql = "SELECT id_utilisateur, nom, prenom, telephone, role FROM utilisateurs";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id_utilisateur = rs.getInt("id_utilisateur");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String telephone = rs.getString("telephone");
            String role = rs.getString("role");


            model.addRow(new Object[]{id_utilisateur, nom, prenom, telephone, role});
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors du chargement des utilisateurs : " + e.getMessage());
    }
}
                        private void remplirTableUtilisateurs(ResultSet rs) throws SQLException {
    DefaultTableModel model = (DefaultTableModel) tableUtilisateurs.getModel();
    model.setRowCount(0); // Vider les anciennes lignes

    while (rs.next()) {
        Object[] row = {
            rs.getInt("id_utilisateur"),
            rs.getString("nom"),
            rs.getString("prenom"),
            rs.getString("telephone"),
            rs.getString("role"),
            rs.getString("date_creation")
        };
        model.addRow(row);
    }
}


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrenom = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMotDePasse = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUtilisateurs = new javax.swing.JTable();
        btnAjoutertabl = new javax.swing.JButton();
        btnModifiertabl = new javax.swing.JButton();
        btnnSupprimertabl = new javax.swing.JButton();
        btnAffichertabl = new javax.swing.JButton();
        btnRechercher = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTelepone = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prénom:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 181, 54));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/GestionUser.png"))); // NOI18N
        jLabel4.setText("Gestion Utilisateurs");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rôle:");

        roleComboBox.setFont(new java.awt.Font("Segoe UI Historic", 2, 14)); // NOI18N
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Utilisateur", "Administrateur" }));
        roleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mot de Passse");

        tableUtilisateurs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Prénom", "Telephone", "Rôle"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableUtilisateurs);

        btnAjoutertabl.setText("Ajouter");
        btnAjoutertabl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutertablActionPerformed(evt);
            }
        });

        btnModifiertabl.setText("Modifier");
        btnModifiertabl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifiertablActionPerformed(evt);
            }
        });

        btnnSupprimertabl.setText("Supprimer");
        btnnSupprimertabl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnSupprimertablActionPerformed(evt);
            }
        });

        btnAffichertabl.setText("Afficher");
        btnAffichertabl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAffichertablActionPerformed(evt);
            }
        });

        btnRechercher.setText("Rechercher");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telephone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnAjoutertabl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnModifiertabl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnnSupprimertabl)
                        .addGap(50, 50, 50)
                        .addComponent(btnAffichertabl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txtPrenom)
                                    .addComponent(txtEmail)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelepone)))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(71, 71, 71)
                                .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMotDePasse)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTelepone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btnRechercher)
                        .addGap(55, 55, 55)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjoutertabl)
                    .addComponent(btnModifiertabl)
                    .addComponent(btnnSupprimertabl)
                    .addComponent(btnAffichertabl))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjoutertablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutertablActionPerformed
        // TODO add your handling code here:
 String nom = txtNom.getText().trim();
String prenom = txtPrenom.getText().trim();
String email = txtEmail.getText().trim();
String telephone =txtTelepone.getText().trim();
String motDePasse = new String(txtMotDePasse.getPassword()).trim();
String role = roleComboBox.getSelectedItem().toString();

if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || motDePasse.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs !");
    return;
}

try (Connection conn = DBConnexion.getConnection()) {

    // Vérifie si l'email existe déjà
    String verifSql = "SELECT COUNT(*) FROM utilisateurs WHERE email = ?";
    PreparedStatement verifStmt = conn.prepareStatement(verifSql);
    verifStmt.setString(1, email);
    ResultSet rs = verifStmt.executeQuery();
    if (rs.next() && rs.getInt(1) > 0) {
        JOptionPane.showMessageDialog(this, "Cet email est déjà utilisé !");
        return;
    }

    // Insère un nouvel utilisateur
    String sql = "INSERT INTO utilisateurs (nom, prenom, email, telephone, mot_de_passe, date_creation, role) VALUES (?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setString(1, nom);
    stmt.setString(2, prenom);
    stmt.setString(3, email);
    stmt.setString(4, telephone);
    stmt.setString(5, hacherMotDePasse(motDePasse));
    stmt.setString(6, java.time.LocalDate.now().toString());
    stmt.setString(7, role);

    int rows = stmt.executeUpdate();
    if (rows > 0) {
        JOptionPane.showMessageDialog(this, "Utilisateur ajouté avec succès !");
        chargerUtilisateurs();
    } else {
        JOptionPane.showMessageDialog(this, "Erreur lors de l’ajout.");
    }

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Erreur : " + e.getMessage());
}



    }//GEN-LAST:event_btnAjoutertablActionPerformed

    private void btnModifiertablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifiertablActionPerformed
        // TODO add your handling code here:
    int selectedRow = tableUtilisateurs.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Sélectionnez un utilisateur à modifier !");
        return;
    }

    int ID = Integer.parseInt(tableUtilisateurs.getValueAt(selectedRow, 0).toString());

    String nom = txtNom.getText().trim();
    String prenom = txtPrenom.getText().trim();
    String email = txtEmail.getText().trim();
    String telephone =txtTelepone.getText().trim();
    String motDePasse = new String(txtMotDePasse.getPassword()).trim();
    String role = roleComboBox.getSelectedItem().toString();

    if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || motDePasse.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires !");
        return;
    }

    try (Connection conn = DBConnexion.getConnection()) {
        String sql = "UPDATE utilisateurs SET nom = ?, prenom = ?, email = ?, telephone = ?, mot_de_passe = ?, role = ? WHERE id_utilisateur = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
     
        stmt.setString(1, nom);
        stmt.setString(2, prenom);
        stmt.setString(3, email);
        stmt.setString(4, telephone);
        stmt.setString(5, motDePasse);
        stmt.setString(6, role);
        stmt.setInt(7, ID);
        int rows = stmt.executeUpdate();

        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "Utilisateur modifié !");
            chargerUtilisateurs();
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de la modification.");
    }


    }//GEN-LAST:event_btnModifiertablActionPerformed

    private void btnAffichertablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAffichertablActionPerformed
        // TODO add your handling code here:
    try (Connection conn = DBConnexion.getConnection()) {
        String sql = "SELECT * FROM utilisateurs";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        remplirTableUtilisateurs(rs); // Méthode pour remplir ta JTable

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de l'affichage des utilisateurs.");
    }



    }//GEN-LAST:event_btnAffichertablActionPerformed

    private void btnnSupprimertablActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnSupprimertablActionPerformed
        // TODO add your handling code here:
        
    int selectedRow = tableUtilisateurs.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner un utilisateur à supprimer !");
        return;
    }

      String[] options = {"Oui", "Non"};
int confirm = JOptionPane.showOptionDialog(
    this,
    "Confirmer la suppression ?",
    "Confirmation",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null, // Pas d'icône personnalisée
    options, // Options personnalisées
    options[0] // Option par défaut ("Oui")
);

if (confirm != 0) return; // 0 correspond à "Oui"

int ID = Integer.parseInt(tableUtilisateurs.getValueAt(selectedRow, 0).toString()); // Assure-toi que la 1ère colonne = id

    
    try (Connection conn = DBConnexion.getConnection()) {
        String sql = "DELETE FROM utilisateurs WHERE id_utilisateur = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, ID);
        int rows = stmt.executeUpdate();

        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "Utilisateur supprimé !");
            chargerUtilisateurs(); // Recharge la table
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de la suppression.");
    }

    }//GEN-LAST:event_btnnSupprimertablActionPerformed

    private void roleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComboBoxActionPerformed

    private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
        // TODO add your handling code here:
        
        String motCle = txtNom.getText().trim();

if (motCle.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Entrez un nom pour rechercher !");
    return;
}

try (Connection conn = DBConnexion.getConnection()) {
    String sql = "SELECT * FROM utilisateurs WHERE nom LIKE ?";
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setString(1, "%" + motCle + "%");

    ResultSet rs = stmt.executeQuery();
    remplirTableUtilisateurs(rs);

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Erreur lors de la recherche.");
}

    }//GEN-LAST:event_btnRechercherActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAffichertabl;
    private javax.swing.JButton btnAjoutertabl;
    private javax.swing.JButton btnModifiertabl;
    private javax.swing.JButton btnRechercher;
    private javax.swing.JButton btnnSupprimertabl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JTable tableUtilisateurs;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtMotDePasse;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtTelepone;
    // End of variables declaration//GEN-END:variables
}
