/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_johnson;

/**
 *
 * @author mathi
 */
public class TP2_Bieres_JOHNSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ; 
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe"); 
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere2 = new BouteilleBiere("86",12,"Bar a chicha");
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere3 = new BouteilleBiere("Vodka",18,"quentin aime les enfants");
        uneBiere.lireEtiquette();
        BouteilleBiere autreBiere4 = new BouteilleBiere("Poliakov",17,"EPF");
        uneBiere.lireEtiquette();
    }
    
}
