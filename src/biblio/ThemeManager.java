/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblio;

/**
 *
 * @author CLOVIS
 */
import javax.swing.*;
import java.awt.*;

public class ThemeManager {

    public enum Theme {
        CLAIR,
        SOMBRE
    }
    
    // Dans ThemeManager.java
public static void changerTheme(Theme nouveauTheme, Component fenetre) {
    themeActuel = nouveauTheme;
    appliquerTheme(fenetre);
    fenetre.repaint();
}


    private static Theme themeActuel = Theme.CLAIR;

    public static void appliquerTheme(Component composant) {
  if (themeActuel == Theme.SOMBRE) {
        composant.setBackground(Color.DARK_GRAY);

        if (composant instanceof JLabel || composant instanceof JButton || composant instanceof JTextField || composant instanceof JTable) {
            ((JComponent) composant).setForeground(Color.WHITE);
        }

        if (composant instanceof JTextField) {
            ((JComponent) composant).setBackground(new Color(50, 50, 50));
        }

    } else {
        // Couleurs pour le mode clair
        composant.setBackground(new Color(0, 102, 102)); // ton vert clair préféré ?

        if (composant instanceof JLabel || composant instanceof JButton) {
            ((JComponent) composant).setForeground(Color.ORANGE); // ou ta couleur de base
        }

        if (composant instanceof JTextField) {
            ((JComponent) composant).setForeground(Color.BLACK);
            ((JComponent) composant).setBackground(Color.WHITE);
        }

        if (composant instanceof JTable) {
            ((JComponent) composant).setForeground(Color.BLACK);
            ((JComponent) composant).setBackground(Color.WHITE);
        }
    }

    // Récursion sur les enfants si c’est un conteneur
    if (composant instanceof Container) {
        for (Component c : ((Container) composant).getComponents()) {
            appliquerTheme(c);
        }
    }
    }

    public static void changerTheme(Theme nouveauTheme, JFrame fenetre) {
        themeActuel = nouveauTheme;
        appliquerTheme(fenetre.getContentPane());
        fenetre.repaint();
    }

    public static Theme getThemeActuel() {
        return themeActuel;
    }
}

