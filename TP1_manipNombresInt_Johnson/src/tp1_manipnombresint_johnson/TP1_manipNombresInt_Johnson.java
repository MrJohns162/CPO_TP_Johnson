/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_johnson;

import java.util.Scanner;

/**
 *
 * @author mathi
 */
public class TP1_manipNombresInt_Johnson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Demande du premier entier
        System.out.print("Entrez le premier entier : ");
        int nombre1 = scanner.nextInt();

        // Demande du deuxième entier
        System.out.print("Entrez le deuxième entier : ");
        int nombre2 = scanner.nextInt();

        // Affichage des deux entiers saisis
        System.out.println("Vous avez entré : " + nombre1 + " et " + nombre2);

        // Fermeture du Scanner (bonne pratique)
        scanner.close();
    }
}
   
        


     

    
    

