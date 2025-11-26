/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_johnson;

import java.util.ArrayList;

/**
 *
 * @author mathi
 */
public class TP3_Heroic_Fantasy_Johnson {

    /**
     * @param args the command line arguments
     */
    




public class Main {
    public static void main(String[] args) {

        // 10. Création de 2 épées
        Epee e1 = new Epee("Excalibur", 7, 5);
        Epee e2 = new Epee("Durandal", 4, 7);

        // 11. Création de 2 bâtons
        Baton b1 = new Baton("Chêne", 4, 5);
        Baton b2 = new Baton("Charme", 5, 6);

        // 12. Création du tableau dynamique
        ArrayList<Armes> tabArmes = new ArrayList<>();
        tabArmes.add(e1);
        tabArmes.add(e2);
        tabArmes.add(b1);
        tabArmes.add(b2);

        // 13. Affichage du contenu
        for (int i = 0; i < tabArmes.size(); i++) {
            System.out.println(tabArmes.get(i));
        }
    }
}
}


   
