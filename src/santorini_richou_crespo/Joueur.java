/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorini_richou_crespo;

/**
 *
 * @author julie
 */
public class Joueur {

    String nom;
    String typePersonnage;
    Ouvrier[] ListeOuvrier = new Ouvrier[2];
    Ouvrier ouvrierCourant;

   public Joueur(String unNom){
       nom=unNom;   
   }

    public void affecterTypePersonne(String untypePersonnage) {
        typePersonnage = untypePersonnage;
    }

    public void ajouterOuvrier(Joueur unJoueur) {
        Ouvrier OuvrierBleu = new Ouvrier("Bleu");
        Ouvrier OuvrierGris = new Ouvrier("Gris");

        for (int i = 0; i < 2; i++) {
            if (unJoueur.typePersonnage == "Arthemis") {
                unJoueur.ListeOuvrier[i] = OuvrierBleu;
            } else if (unJoueur.typePersonnage == "Zeus") {
                unJoueur.ListeOuvrier[i] = OuvrierGris;
            }

        }

    }
}
