/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_johnson;

import java.util.Scanner;

/**
 *
 * @author mathi
 */

public class TP1_convertisseur_Johnson {

    /**
     * @param args the command line arguments
     */
    
    public static void  CelciusVersKelvin(double[] tCelsius) {
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Entrez une valeur : ");
        double val = scanner.nextDouble();
        
        double valtemp= val + 273.15;
        System.out.print("la valeur en Kelvin:" +valtemp);

    }
    
}
    
    
    
