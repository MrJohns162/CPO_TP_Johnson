/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author mathi
 * 20/10/2025
 * calculette
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
         int operateur = sc.nextInt();
         
         if (operateur < 1 || operateur > 5) {
            System.out.println("Error: invalid operator. Please choose between 1 and 5.");
            return;
         }
         
          System.out.println("Please enter the first number:");
        double operande1 = sc.nextDouble();
        
         System.out.println("Please enter the second number:");
        double operande2 = sc.nextDouble();

        double resultat = 0;
        
        switch (operateur) {
            case 1: // add
                resultat = operande1 + operande2;
                break;
            case 2: // subtract
                resultat = operande1 - operande2;
                break;
            case 3: // multiply
                resultat = operande1 * operande2;
                break;
            case 4: // divide
                // 8. Gestion division par zéro
                if (operande2 == 0) {
                    System.out.println("Error: cannot divide by zero.");
                    return;
                }
                resultat = operande1 / operande2;
                break;
            case 5: // modulo
                if (operande2 == 0) {
                    System.out.println("Error: cannot modulo by zero.");
                    return;
                }
                resultat = operande1 % operande2;
                break;
        }

        System.out.println("The result is : " + resultat);

    }
    
}
