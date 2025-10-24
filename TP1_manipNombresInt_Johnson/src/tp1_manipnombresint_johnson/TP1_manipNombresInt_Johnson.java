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

        
        System.out.print("Entrez le premier entier : ");
        double nombre1 = scanner.nextInt();

        
        System.out.print("Entrez le deuxième entier : ");
        double nombre2 = scanner.nextInt();

        
        System.out.println("Vous avez entré : " + nombre1 + " et " + nombre2);
        
        double somme= nombre1 + nombre2;
        double produit= nombre1 * nombre2;
        double quotient= nombre2/nombre1;
        
        System.out.println("la somme est :"+somme);
        
        double difference = nombre2 - nombre1;
        System.out.println("la difference est :"+difference);
        
         System.out.println("le produit est :"+produit);
         System.out.println("le quotient est :"+ quotient);
         
         
        
        
      

        
        scanner.close();
    }
}
   
        


     

    
    

