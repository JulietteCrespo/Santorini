/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorini_richou_crespo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author julie
 */
public class Partie {

    Joueur[] ListesJoueur = new Joueur[2];
    Joueur joueurCourant;
    Grille newGrille = new Grille();

    public void attribuerTypeAuxJoueurs() {
        // on define aleatoirement la couleur du joueur 
        Random r = new Random();
        int n = 1 + r.nextInt(2); // on nombre aléatoire entre 1 et 2
        if (n == 1) {
            ListesJoueur[0].typePersonnage = "Arthemis";
            ListesJoueur[1].typePersonnage = "Zeus";
        } else {
            ListesJoueur[1].typePersonnage = "Arthemis";
            ListesJoueur[0].typePersonnage = "Zeus";
        }
    }

    public Grille initialiserPartie() {

        // 2 - on vide la grille
        newGrille.viderGrille();

        Ouvrier OuvrierBleu1 = new Ouvrier(" B1");
        Ouvrier OuvrierBleu2 = new Ouvrier(" B2");
        Ouvrier OuvrierGris1 = new Ouvrier(" G1");
        Ouvrier OuvrierGris2 = new Ouvrier(" G2");

        if ("Arthemis".equals(ListesJoueur[1].typePersonnage)) {
            ListesJoueur[0].ListeOuvrier[0] = OuvrierBleu1;
            ListesJoueur[0].ListeOuvrier[1] = OuvrierBleu2;
        } else if ("Zeus".equals(ListesJoueur[1].typePersonnage)) {
            ListesJoueur[1].ListeOuvrier[0] = OuvrierGris1;
            ListesJoueur[1].ListeOuvrier[1] = OuvrierGris2;
        }

        if ("Arthemis".equals(ListesJoueur[0].typePersonnage)) {
            ListesJoueur[0].ListeOuvrier[0] = OuvrierBleu1;
            ListesJoueur[0].ListeOuvrier[1] = OuvrierBleu2;
        } else if ("Zeus".equals(ListesJoueur[0].typePersonnage)) {
            ListesJoueur[1].ListeOuvrier[0] = OuvrierGris1;
            ListesJoueur[1].ListeOuvrier[1] = OuvrierGris2;
        }

        // 3 - on place les ouvriers 
        Random r = new Random();
        
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 2; i++) {
                int x = r.nextInt(4);
                int y = r.nextInt(4);
                if (newGrille.grille[x][y].ouvrierCourant == null) {
                    newGrille.grille[x][y].ouvrierCourant = ListesJoueur[j].ListeOuvrier[i];
                    ListesJoueur[j].ListeOuvrier[i].Xouvrier = x;
                    ListesJoueur[j].ListeOuvrier[i].Youvrier = y;
                    ListesJoueur[j].ListeOuvrier[i].niveauEtage = newGrille.grille[x][y].etageCourant.niveauEtage;
                } else {
                    i--;
                }
            }
        }

        return newGrille;
    }

    public void debuterPartie() {
        // 1- Création des Joueurs :
        Joueur newJoueur1 = new Joueur("Joueur1");
        Joueur newJoueur2 = new Joueur("Joueur2");
        ListesJoueur[0] = newJoueur1; // on definie listeJoueur avec nos nouveaux joueur 
        ListesJoueur[1] = newJoueur2;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Entrer le spseudo du JOUEUR-1 : "); //ulisiteur saisie un speuso
        String Joueur1 = sc.nextLine(); // creer alors un premier joueur
        System.out.println(" Entrer le spseudo du JOUEUR-2 : ");
        String Joueur2 = sc.nextLine();
        ListesJoueur[0].nom = Joueur1; // on definie listeJoueur avec nos nouveaux joueur 
        ListesJoueur[1].nom = Joueur2;

        // 2- Définie les couleurs aux joueurs
        attribuerTypeAuxJoueurs();

        // 4- On députer la partie
        Grille GrilleJeu; // on recupére notre grille de jeu 
        GrilleJeu = initialiserPartie();

        System.out.println(ListesJoueur[0].nom + " vous etes : " + ListesJoueur[0].typePersonnage + "vos ouvriers sont " + ListesJoueur[0].ListeOuvrier[0].couleur);
        System.out.println(ListesJoueur[1].nom + " vous etes : " + ListesJoueur[1].typePersonnage + "vos ouvriers sont " + ListesJoueur[1].ListeOuvrier[0].couleur);

        //5- Quel joueur peux commencer ?
        Random r = new Random();
        int n = 1 + r.nextInt(2);
        if (n == 1) {
            joueurCourant = ListesJoueur[0];
        } else {
            joueurCourant = ListesJoueur[1];
        }
        System.out.println(joueurCourant.nom + " -> c'est à toi commencer ! ");

        //-------- Affiche grille
        GrilleJeu.afficherGrilleSurConsole();

        // 6- On commence a jouer
        while (GrilleJeu.etrePerdantPourJoueur(ListesJoueur[1]) == false && GrilleJeu.etrePerdantPourJoueur(ListesJoueur[0]) == false && GrilleJeu.etreGagnantePourJoueur(ListesJoueur[1]) == false && GrilleJeu.etreGagnantePourJoueur(ListesJoueur[0]) == false) {
            // quel ouvrier jouer -
            System.out.println(joueurCourant.nom + " quel ouvrier veut tu bouger ? ");
            System.out.println("Ouvrier 1: colonne -> " + (joueurCourant.ListeOuvrier[0].Xouvrier + 1) + " ligne -> " + (joueurCourant.ListeOuvrier[0].Youvrier+1));
            System.out.println("Ouvrier 2: colonne -> " + (joueurCourant.ListeOuvrier[1].Xouvrier + 1) + " ligne -> " + (joueurCourant.ListeOuvrier[1].Youvrier+1));
            int ouvrier = sc.nextInt();
            
            //on trouve quel ouvrier c'est
            switch (ouvrier) {
                case 1:
                    joueurCourant.ouvrierCourant = joueurCourant.ListeOuvrier[0];
                    break;
                case 2:
                    joueurCourant.ouvrierCourant = joueurCourant.ListeOuvrier[1];
                    break;
                default:
                    System.out.println(" pas trouvé ");
                    break;
            }

            //---- on demande ou il veut jouer
            System.out.println(joueurCourant.nom + " où veut te deplacer ? ");
            System.out.println(" ligne : ");
            int y =sc.nextInt()-1;
            System.out.println(" colonne : ");
            int x =sc.nextInt()-1;
            //::::::::::::::::::::::
            //verifie si il peut aller sur la case?
            if (newGrille.DeplacementPossible(joueurCourant.ouvrierCourant.Xouvrier, joueurCourant.ouvrierCourant.Youvrier, x, y) == true) {
                newGrille.grille[joueurCourant.ouvrierCourant.Xouvrier][joueurCourant.ouvrierCourant.Youvrier].ouvrierCourant = null;
                newGrille.grille[x][y].ouvrierCourant = joueurCourant.ouvrierCourant;
                joueurCourant.ouvrierCourant.Xouvrier = x;
                joueurCourant.ouvrierCourant.Youvrier = y;
                joueurCourant.ouvrierCourant.niveauEtage = newGrille.grille[x][y].etageCourant.niveauEtage;
            } else {
                System.out.println("vous ne pouvez pas vous deplacer ici");
            }
            GrilleJeu.afficherGrilleSurConsole();
            // il doit construire 
            // if si il peut de rajouter un etage sinon fini
            
            if (newGrille.possibleDeConstruire(joueurCourant.ouvrierCourant)==false){
              System.out.println(joueurCourant.nom + " ou veut tu construire ? ");
              System.out.println(" ligne : ");
              int yT = sc.nextInt() - 1;
              System.out.println(" colonne : ");
              int xT = sc.nextInt() - 1;
              if (newGrille.AjouterEtagePossible(xT, yT) == true && newGrille.grille[xT][yT].ouvrierCourant==null) {
                System.out.println(" etage ajouter ");
                newGrille.grille[xT][yT].etageCourant.niveauEtage++;
               } else {
                System.out.println(" ne peut pas ajouter d'étage ");
               }
              
            }else{
               System.out.println(joueurCourant.nom + " Vous avez perdue "); 
               break;
            }
            

            // on change de joueur
            if (joueurCourant == ListesJoueur[0]) {
                joueurCourant = ListesJoueur[1];
            } else {
                joueurCourant = ListesJoueur[0];
            }
            // l'autre joueur peux joueur
            //-------- Affiche grille avec le changement

            GrilleJeu.afficherGrilleSurConsole();

        }
    }

}
