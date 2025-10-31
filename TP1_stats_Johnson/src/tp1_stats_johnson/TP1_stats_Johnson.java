/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_johnson;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mathi
 */
public class TP1_stats_Johnson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Random generateurAleat = new Random();
        System.out.print("saisissez un entier: ");
        int m = clavier.nextInt();
        
        int[] faces = new int[6];
        
        for(int i = 0; i < m; i++){
            int tirage = generateurAleat.nextInt(6);
            faces[m]++;
        }
        System.out.println("\nRésultats des lancers (valeurs) :");
        for (int i = 0; i < faces.length; i++) {
            System.out.println("Face " + (i+1) + " : " + faces[i]); 
        }
        System.out.println("\nRésultats en pourcentage :");
        for (int i = 0; i < faces.length; i++) {
            double pourcentage = (faces[i] * 100.0) / m; // conversion en double
            System.out.println("Face " + (i + 1) + " : " + pourcentage + "%");
        }
        

    }
    
}
