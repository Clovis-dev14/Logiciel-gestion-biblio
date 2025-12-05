/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;


/**
 *
 * @author CLOVIS
 */


public class UtilisateurDAO {

    public static boolean enregistrerUtilisateur(Utilisateur utilisateur) {
        String sql = "INSERT INTO utilisateurs(nom, prenom, email, telephone, mot_de_passe) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, utilisateur.getNom());
            stmt.setString(2, utilisateur.getPrenom()); // 👈 Ajout du prénom
            stmt.setString(3, utilisateur.getEmail());
            stmt.setString(4, utilisateur.getTelephone());
            stmt.setString(5, utilisateur.getMotDePasse());

            int lignesInserees = stmt.executeUpdate();
            return lignesInserees > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Utilisateur trouverUtilisateurParEmail(String email) {
        String sql = "SELECT * FROM utilisateurs WHERE email = ?";

        try (Connection conn = DBConnexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Utilisateur(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"), 
                    rs.getString("email"),
                    rs.getString("telephone"),
                    rs.getString("mot_de_passe")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}

