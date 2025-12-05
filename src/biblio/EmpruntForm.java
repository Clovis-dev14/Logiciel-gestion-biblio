/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package biblio;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.sql.PreparedStatement;
import javax.swing.ListSelectionModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;





/**
 *
 * @author CLOVIS
 */
public class EmpruntForm extends javax.swing.JInternalFrame {
    


    /**
     * Creates new form EmpruntForm
     */
public EmpruntForm() {
    initComponents();
    ThemeManager.appliquerTheme(this.getContentPane());
    initTable(); // Initialise le tableau

    JTable1.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting() && JTable1.getSelectedRow() != -1) {
            int selectedRow = JTable1.getSelectedRow();

            IbTitre.setText(JTable1.getValueAt(selectedRow, 1).toString());
            txtNom.setText(JTable1.getValueAt(selectedRow, 2).toString());
            txtCodeLivre.setText(JTable1.getValueAt(selectedRow, 3).toString());
            txtStatut.setText(JTable1.getValueAt(selectedRow, 6).toString());

            // Format de date : adapte si nécessaire à ton cas
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            try {
                Date dateEmprunt = sdf.parse(JTable1.getValueAt(selectedRow, 4).toString());
                txtDateEmprunt.setDate(dateEmprunt);

                Date dateRestitution = sdf.parse(JTable1.getValueAt(selectedRow, 5).toString());
                txtDateRestitution.setDate(dateRestitution);
            } catch (ParseException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erreur lors de la conversion des dates.");
            }

            // Si tu as une colonne pour l’ID utilisateur
            // txtIDUtilisateur.setText(JTable1.getValueAt(selectedRow, 7).toString());
        }
    });


jScrollPane2.setViewportView(JTable1);

    }
private DefaultTableModel model;

    
    private void viderChamps() {
    IbTitre.setText(""); // Remplace 'txtTitre' par le nom exact de ton champ
    txtNom.setText(""); // Remplace 'txtIDUtilisateur' par le nom du champ
    txtCodeLivre.setText(""); // Remplace 'txtCodeLivre' par le nom du champ
    txtDateEmprunt.setDate(null); // Remplace 'txtDateEmprunt' par le nom du champ
    txtDateRestitution.setDate(null);
    IdUtilisateur.setText("");
    txtStatut.setText("");
    }
    
    private void initTable() {
    // Initialise le modèle avec les colonnes
  DefaultTableModel model = new DefaultTableModel(
    new Object[] {"ID Emprunt", "Titre", "Nom Utilisateur", "ID Livre", "Date Emprunt", "Date Retour", "Statut"}, 0
);
JTable1.setModel(model);
              


   JTable1.setRowSelectionAllowed(true);  // Permet la sélection des lignes
JTable1.setColumnSelectionAllowed(false);  // Permet la sélection des colonnes
JTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  // Mode de sélection unique


    // Associe le modèle au tableau
    JTable1 = new JTable(model);

    // Ajoute le tableau à un panneau défilant (utile si le tableau dépasse la taille de la fenêtre)
    JScrollPane scrollPane = new JScrollPane(JTable1);

    // Ajoute le panneau défilant à l'interface
    this.add(scrollPane);
}

   
    
    public void afficherTableau() {
    DefaultTableModel model = (DefaultTableModel) JTable1.getModel();
    model.setRowCount(0); // Efface les anciennes lignes dans le tableau

    try (Connection conn = DBConnexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement("SELECT id_emprunt, titre, nom, id_livre, date_emprunt, date_retour, statut FROM emprunts");
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            // Récupère les données de chaque colonne dans la base
            int idEmprunt = rs.getInt("id_emprunt");
            String titre = rs.getString("titre");
            String nomUtilisateur = rs.getString("nom");
            int idLivre = rs.getInt("id_livre");
            String dateEmprunt = rs.getString("date_emprunt");
            String dateRetour = rs.getString("date_retour");
            String statut = rs.getString("statut");

            // Ajoute une ligne dans le tableau avec ces données
            model.addRow(new Object[]{idEmprunt, titre, nomUtilisateur, idLivre, dateEmprunt, dateRetour, statut});
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erreur lors du chargement des données !");
        ex.printStackTrace();
    }
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
        jLabel1 = new javax.swing.JLabel();
        IbTitre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodeLivre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnValider = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDateEmprunt = new com.toedter.calendar.JDateChooser();
        txtDateRestitution = new com.toedter.calendar.JDateChooser();
        btnModifier = new javax.swing.JButton();
        btnRestituer = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnAfficher = new javax.swing.JButton();
        btnReinitialiser = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtStatut = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        IdUtilisateur = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Titre");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom Utilisateur");

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Livre");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date Emprunt");

        btnValider.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        btnAnnuler.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 102, 102));
        jTextField1.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 181, 54));
        jTextField1.setText("Nouvel Emprunt/Restitution");
        jTextField1.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Restitution");

        btnModifier.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnRestituer.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnRestituer.setText("Restituer");
        btnRestituer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestituerActionPerformed(evt);
            }
        });

        btnSupprimer.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnAfficher.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnAfficher.setText("Afficher");
        btnAfficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherActionPerformed(evt);
            }
        });

        btnReinitialiser.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnReinitialiser.setText("Reinitialiser");
        btnReinitialiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinitialiserActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Statut");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID Utilisateur");

        JTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Emprunt", "Titre", "Nom  Utilisateur", "ID Livre", "Date Emprunt", "Date Retour", "Statut"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnAfficher)
                        .addGap(73, 73, 73)
                        .addComponent(btnReinitialiser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModifier)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStatut, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtCodeLivre)
                            .addComponent(IbTitre))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRestituer)
                        .addGap(36, 36, 36)
                        .addComponent(btnSupprimer)
                        .addGap(54, 54, 54)
                        .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNom)
                            .addComponent(txtDateEmprunt, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txtDateRestitution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdUtilisateur))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(298, 298, 298))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2))
                    .addComponent(IbTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodeLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addComponent(txtDateEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDateRestitution, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(IdUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestituer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupprimer)
                    .addComponent(btnAnnuler))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValider)
                    .addComponent(btnAfficher)
                    .addComponent(btnReinitialiser))
                .addGap(112, 112, 112))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // TODO add your handling code here:
    try {
        viderChamps(); // Réinitialise uniquement les champs du formulaire
        JOptionPane.showMessageDialog(this, "Les champs ont été annulés !");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erreur lors de l'annulation !");
        ex.printStackTrace();
    }


    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        // TODO add your handling code here:
             
        // Étape 1 : Vérification des champs remplis
if (txtNom.getText().isEmpty() || txtCodeLivre.getText().isEmpty() || txtDateEmprunt.getDate() == null) {
    JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs !");
    return;
}

String titreLivre = ""; // Variable pour stocker le titre du livre

try (Connection conn = DBConnexion.getConnection()) {
    // Étape 2 : Récupérer le titre du livre depuis la table "livres"
    try (PreparedStatement stmtTitle = conn.prepareStatement("SELECT titre FROM livres WHERE id_livre = ?")) {
        stmtTitle.setString(1, txtCodeLivre.getText()); // ID Livre à rechercher
        try (ResultSet rs = stmtTitle.executeQuery()) {
            if (rs.next()) {
                titreLivre = rs.getString("titre"); // Stocke le titre récupéré
            } else {
                JOptionPane.showMessageDialog(this, "Livre introuvable !");
                return; // Quitte si le livre n'existe pas
            }
        }
    }

    // Étape 3 : Insertion des données dans la table "emprunts"
    try (PreparedStatement stmt = conn.prepareStatement(
        "INSERT INTO emprunts (id_utilisateur, nom, id_livre, date_emprunt, date_retour, statut, titre) VALUES (?, ?, ?, ?, ?, ?, ?)",
        Statement.RETURN_GENERATED_KEYS // Permet de récupérer l'ID généré
    )) {
        stmt.setInt(1, Integer.parseInt(IdUtilisateur.getText()));
        stmt.setString(2, txtNom.getText()); // Utilise setString pour le nom de l'utilisateur
        stmt.setString(3, txtCodeLivre.getText()); // ID Livre
        stmt.setDate(4, new java.sql.Date(txtDateEmprunt.getDate().getTime())); // Date Emprunt
         // Ajoute la date de retour, ou NULL si elle n'est pas spécifiée
        stmt.setDate(5, txtDateRestitution.getDate() != null 
                      ? new java.sql.Date(txtDateRestitution.getDate().getTime()) 
                      : null);

        stmt.setString(6, "emprunté"); // Statut par défaut
        stmt.setString(7, titreLivre); // Ajout du titre récupérétable 

        stmt.executeUpdate(); // Exécute l'insertion SQL

        // Récupération de l'ID généré
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                int idEmprunt = rs.getInt(1); // Récupérer l'ID généré
                System.out.println("ID Emprunt généré : " + idEmprunt); // Affichage dans la console
                JOptionPane.showMessageDialog(this, "Emprunt ajouté avec l'ID : " + idEmprunt);
            }
        }
    }

   
    
    
    DefaultTableModel model = new DefaultTableModel(
    new Object[] {"ID Emprunt", "Titre", "Nom Utilisateur", "ID Livre", "Date Emprunt", "Date Retour", "Statut"}, 0
);
JTable1.setModel(model);


} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Erreur SQL : " + ex.getMessage());
    ex.printStackTrace();
}


 

    }//GEN-LAST:event_btnValiderActionPerformed

    private void btnAfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherActionPerformed
 
   
    afficherTableau(); // Charge et affiche les données dans le tableau

    }//GEN-LAST:event_btnAfficherActionPerformed

    private void btnReinitialiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinitialiserActionPerformed
        // TODO add your handling code here:
    try {
        DefaultTableModel model = (DefaultTableModel) JTable1.getModel();
        model.setRowCount(0); // Vide le tableau

        viderChamps(); // Réinitialise tous les champs du formulaire
        JOptionPane.showMessageDialog(this, "Tableau et champs réinitialisés !");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erreur lors de la réinitialisation !");
        ex.printStackTrace();
    }

    }//GEN-LAST:event_btnReinitialiserActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
   // TODO add your handling code here:
DefaultTableModel model = (DefaultTableModel) JTable1.getModel();
int selectedRow = JTable1.getSelectedRow();


if (selectedRow == -1) {
    JOptionPane.showMessageDialog(this, "Veuillez sélectionner une ligne dans le tableau !");
    return;
}

// Colonne 0 contient l'ID de l'emprunt
int idEmprunt = (int) model.getValueAt(selectedRow, 0);
System.out.println("ID à supprimer : " + idEmprunt);

try (Connection conn = DBConnexion.getConnection();
     PreparedStatement stmt = conn.prepareStatement("DELETE FROM emprunts WHERE id_emprunt = ?")) {

    stmt.setInt(1, idEmprunt);
    int rowsAffected = stmt.executeUpdate();

    if (rowsAffected > 0) {
        model.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "Suppression réussie !");
    } else {
        JOptionPane.showMessageDialog(this, "Erreur : emprunt non trouvé !");
    }

} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Erreur SQL lors de la suppression !");
    ex.printStackTrace();
}





    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnRestituerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestituerActionPerformed
        // TODO add your handling code here:
    int row = JTable1.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner une ligne dans le tableau !");
        return;
    }

    // Récupère l'id_emprunt depuis le tableau
    int idEmprunt = (int) JTable1.getValueAt(row, 0); // Colonne 0 = id_emprunt

    try (Connection conn = DBConnexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(
             "UPDATE emprunts SET statut = ?, date_retour = ? WHERE id_emprunt = ?"
         )) {
        stmt.setString(1, "restitué"); // Change le statut en "restitué"
        stmt.setDate(2, new java.sql.Date(System.currentTimeMillis())); // Date de retour = aujourd'hui
        stmt.setInt(3, idEmprunt);

        stmt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Emprunt restitué avec succès !");
        afficherTableau(); // Met à jour le tableau après restitution

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erreur lors de la restitution !");
        ex.printStackTrace();
    }

    }//GEN-LAST:event_btnRestituerActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
    int row = JTable1.getSelectedRow();
if (row == -1) {
    JOptionPane.showMessageDialog(this, "Veuillez sélectionner une ligne dans le tableau !");
    return;
}

try {
    // Récupère l'id_emprunt depuis la première colonne
    int idEmprunt = (int) JTable1.getValueAt(row, 0);

    // Vérifie que tous les champs importants sont remplis
    if (IbTitre.getText().isEmpty() || txtCodeLivre.getText().isEmpty() || txtDateEmprunt.getDate() == null ||
        txtDateRestitution.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs requis !");
        return;
    }

    try (Connection conn = DBConnexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(
             "UPDATE emprunts SET titre = ?, id_livre = ?, date_emprunt = ?, date_retour = ? WHERE id_emprunt = ?"
         )) {

        stmt.setString(1, IbTitre.getText());
        stmt.setString(2, txtCodeLivre.getText());

        java.sql.Date dateEmprunt = new java.sql.Date(txtDateEmprunt.getDate().getTime());
        java.sql.Date dateRetour = new java.sql.Date(txtDateRestitution.getDate().getTime());

        stmt.setDate(3, dateEmprunt);
        stmt.setDate(4, dateRetour);
        stmt.setInt(5, idEmprunt);

        stmt.executeUpdate();

        JOptionPane.showMessageDialog(this, "Emprunt modifié avec succès !");
        afficherTableau(); // Met à jour le tableau

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erreur lors de la modification !");
        ex.printStackTrace();
    }

} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Erreur de données : vérifie les champs !");
    ex.printStackTrace();
}




    }//GEN-LAST:event_btnModifierActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IbTitre;
    private javax.swing.JTextField IdUtilisateur;
    private javax.swing.JTable JTable1;
    private javax.swing.JButton btnAfficher;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnReinitialiser;
    private javax.swing.JButton btnRestituer;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCodeLivre;
    private com.toedter.calendar.JDateChooser txtDateEmprunt;
    private com.toedter.calendar.JDateChooser txtDateRestitution;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtStatut;
    // End of variables declaration//GEN-END:variables
}
