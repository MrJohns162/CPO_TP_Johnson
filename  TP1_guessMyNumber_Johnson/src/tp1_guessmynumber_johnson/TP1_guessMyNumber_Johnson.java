/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_johnson;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mathi
 */
public class TP1_guessMyNumber_Johnson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        int max = 100; // interval par défaut
        int limiteEssais = Integer.MAX_VALUE; // essais illimités par défaut
        
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1 - Facile");
        System.out.println("2 - Normal");
        System.out.println("3 - Difficile");
        
        int choix = scanner.nextInt();
        
        if (choix == 1) { // Facile
            max = 50;
            System.out.println("Mode facile choisi (0 - 50, aide disponible).");
        } else if (choix == 3) { // Difficile
            max = 500;
            limiteEssais = 10;
            System.out.println("Mode difficile choisi (0 - 500, 10 essais maximum !");
        } else {
            System.out.println("Mode normal choisi (0 - 100).");
        }

        int n = generateurAleat.nextInt(max + 1); 
        int val = -1;
        int tentatives = 0;

        System.out.println("Devinez le nombre entre 0 et " + max + " :");

        while (val != n && tentatives < limiteEssais) {
            val = scanner.nextInt();
            tentatives++;

            int ecart = Math.abs(val - n); // différence

            if (val < n) {
                if (choix == 1 && ecart > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (val > n) {
                if (choix == 1 && ecart > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                System.out.println("Gagné !");
                System.out.println("Vous avez trouvé en " + tentatives + " tentatives.");
                return;
            }

            if (tentatives == limiteEssais) {
                System.out.println("💥 Vous avez atteint la limite d'essais !");
                System.out.println("Le nombre secret était : " + n);
                return;
            }
        }
         
         
         2 
    }
}