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
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Entrez une valeur : ");
        double val = scanner.nextDouble();
        System.out.println("\nChoisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) Celsius → Kelvin");
        System.out.println("2) Kelvin → Celsius");
        System.out.println("3) Celsius → Fahrenheit");
        System.out.println("4) Kelvin → Fahrenheit");
        System.out.println("5) Fahrenheit → Kelvin");
        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();

        double resultat = 0;
        String uniteDepart = "";
        String uniteArrivee = "";

        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(val);
                uniteDepart = "Celsius";
                uniteArrivee = "Kelvin";
                break;
            case 2:
                resultat = KelvinVersCelcius(val);
                uniteDepart = "Kelvin";
                uniteArrivee = "Celsius";
                break;
            case 3:
                resultat = CelciusVersFarenheit(val);
                uniteDepart = "Celsius";
                uniteArrivee = "Fahrenheit";
                break;
            case 4:
                resultat = KelvinVersFarenheit(val);
                uniteDepart = "Kelvin";
                uniteArrivee = "Fahrenheit";
                break;
            case 5:
                resultat = FarenheitVersKelvin(val);
                uniteDepart = "Fahrenheit";
                uniteArrivee = "Kelvin";
                break;
            default:
                System.out.println("Choix invalide !");
                scanner.close();
                return;
        }

        System.out.println();
        System.out.printf("%.2f degrés %s = %.2f degrés %s%n",
                val, uniteDepart, resultat, uniteArrivee);

        scanner.close();
    }
    public static double  CelciusVersKelvin(double tCelcius) {
        
        double tKelvin = tCelcius + 273.15;
        return tKelvin;
    }
    public static double  KelvinVersCelcius(double tKelvin) {
        
        double tCelcius = tKelvin - 273.15;
        return tCelcius;
    }
    public static double CelciusVersFarenheit(double tCelcius) {
        
        double tFarenheit = (tCelcius*9/5)+32;
        return tFarenheit;
    }
    public static double KelvinVersFarenheit(double tKelvin) {
        
        double TFarenheit = (((tKelvin+273)*9/5)+32);
        return TFarenheit;
    }
    public static double FarenheitVersKelvin(double tFarenheit) {
        
        double TKelvin = (tFarenheit-32)*(5/9)+273.15;
        return TKelvin;
    } 
}
    
    
    
