/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorini_richou_crespo;

import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author julie
 */
public class FenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form FenetreDeJeu
     */
    Joueur[] ListesJoueur = new Joueur[2];
    Joueur joueurCourant;
    Grille newGrille = new Grille();
    boolean premierClic;
    boolean deuxiemeClic;
    boolean troisiemeClic;
    int xlast;
    int ylast;
    int X;
    int Y;
    int Xcons;
    int Ycons;
    boolean bloqB1;
    boolean bloqB2;
    boolean bloqG1;
    boolean bloqG2;
    boolean fin;

    public FenetreDeJeu() {
        initComponents();
        ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/images/sa.png"));

        jLabel4.setIcon(img);
        Joueur2.setVisible(false);
        Joueur1photo.setVisible(false);
        Joueur1.setVisible(false);
        Joueur2photo.setVisible(false);
        jPanel3.setVisible(false);
        jPanel2.setVisible(false);
        jPanel1.setVisible(false);

        premierClic = true;
        deuxiemeClic = true;
        troisiemeClic = true;
        bloqB1 = false;
        bloqB2 = false;
        bloqG1 = false;
        bloqG2 = false;
        fin = false;
        text.setText("  Quel ouvrier veut tu bouger ?");
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(newGrille.grille[i][j]);
                cellGraph.Xc = i;
                cellGraph.Yc = j;

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.CelluleAssociee;

                        if (newGrille.etrePerdantPourJoueur(joueurCourant) == true) {
                            text.setText(joueurCourant.nom + "Vous avez perdu vous ne pouvez plus bouger");
                            deuxiemeClic = false;
                            troisiemeClic = false;
                            premierClic = false;
                        } else {
                            if (premierClic == true) {
                                xlast = cellGraph.Xc;
                                ylast = cellGraph.Yc;
                                if ("B".equals(c.ouvrierCourant.couleur) && "Zeus".equals(joueurCourant.typePersonnage) || "G".equals(c.ouvrierCourant.couleur) && "Arthemis".equals(joueurCourant.typePersonnage)) {
                                    premierClic = false;
                                    joueurCourant.ouvrierCourant = c.ouvrierCourant;
                                    text.setText(" Ok, où voulez vous aller ? ");
                                } else {
                                    text.setText("Erreur : saisir un ouvrier ");
                                }

                            } else if (deuxiemeClic == true) {
                                X = cellGraph.Xc;
                                Y = cellGraph.Yc;
                                if (newGrille.DeplacementPossible(xlast, ylast, X, Y) == true) {
                                    newGrille.grille[X][Y].ouvrierCourant = newGrille.grille[xlast][ylast].ouvrierCourant;
                                    newGrille.grille[xlast][ylast].ouvrierCourant = null;
                                    joueurCourant.ouvrierCourant.Xouvrier = X;
                                    joueurCourant.ouvrierCourant.Youvrier = Y;
                                    text.setText("Ok, maintenant où voulez vous construire ?");
                                    deuxiemeClic = false;
                                } else if (newGrille.unOuvrierNePeutPlusBouger(xlast, ylast) == true) {

                                    premierClic = true;
                                    text.setText(" Votre Ouvirier est bloquer vous ne pouvez plus bouger, vous devez choisir un autre ouvrier  ");
                                } else {
                                    text.setText(" Vous ne pouvez pas aller la  ");
                                }
                            } else if (newGrille.grille[X][Y].etageCourant.niveauEtage == 3 && troisiemeClic == true) {
                                text.setText(" Victoire de " + joueurCourant.nom);
                                troisiemeClic = false;
                            } else if (troisiemeClic == true) {
                                Xcons = cellGraph.Xc;
                                Ycons = cellGraph.Yc;
                                if (newGrille.AjouterEtagePossible(X, Y, Xcons, Ycons) == true && newGrille.grille[Xcons][Ycons].ouvrierCourant == null) {
                                    newGrille.grille[Xcons][Ycons].etageCourant.niveauEtage++;
                                    troisiemeClic = false;
                                    text.setText(" Ok etage construit ");
                                    joueurSuivant();
                                } else {
                                    text.setText(" Vous ne pouvez pas construire ici ");
                                }
                            }
                        }

                    }
                });
                panelGrille.add(cellGraph);
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Santorini = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelGrille = new javax.swing.JPanel();
        Joueur1photo = new javax.swing.JPanel();
        photo1 = new javax.swing.JLabel();
        Joueur2photo = new javax.swing.JPanel();
        photo2 = new javax.swing.JLabel();
        Infojouer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomJoueur1 = new javax.swing.JTextField();
        nomJoueur2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Joueur1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        typeJoueur1 = new javax.swing.JLabel();
        NOM1 = new javax.swing.JLabel();
        Joueur2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        typeJoueur2 = new javax.swing.JLabel();
        NOM2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pion1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pion2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        joueurcourant = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Santorini.setBackground(new java.awt.Color(255, 255, 255));
        Santorini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        Santorini.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 140));

        getContentPane().add(Santorini, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 770, 140));

        panelGrille.setBackground(new java.awt.Color(255, 255, 255));
        panelGrille.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(panelGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 500, 500));

        Joueur1photo.setBackground(new java.awt.Color(255, 255, 255));
        Joueur1photo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Joueur1photo.add(photo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 170));

        getContentPane().add(Joueur1photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 170));

        Joueur2photo.setBackground(new java.awt.Color(255, 255, 255));
        Joueur2photo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Joueur2photo.add(photo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 170));

        getContentPane().add(Joueur2photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 120, 170));

        Infojouer.setBackground(new java.awt.Color(0, 102, 204));
        Infojouer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 1 :");
        Infojouer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 83, -1));

        jLabel2.setText("Nom Joueur 2 :");
        Infojouer.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 83, -1));
        Infojouer.add(nomJoueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 11, 76, -1));
        Infojouer.add(nomJoueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 42, 76, -1));

        jButton1.setText("Démarrer Partie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Infojouer.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        getContentPane().add(Infojouer, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 190, 120));

        Joueur1.setBackground(new java.awt.Color(0, 102, 204));
        Joueur1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText(" vous étes : ");
        Joueur1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        typeJoueur1.setText("Typejouer1");
        Joueur1.add(typeJoueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 69, -1));

        NOM1.setText("jLabel6");
        Joueur1.add(NOM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(Joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, 40));

        Joueur2.setBackground(new java.awt.Color(0, 102, 204));
        Joueur2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText(" vous étes :  ");
        Joueur2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        typeJoueur2.setText("Typejouer2");
        Joueur2.add(typeJoueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 69, -1));

        NOM2.setText("jLabel6");
        Joueur2.add(NOM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(Joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 210, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(pion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 60, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(pion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 60, 80));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 170, 150));

        joueurcourant.setText("joueurcourant");
        jPanel3.add(joueurcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jLabel6.setText("C'est le tour de :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 190, 210));

        setBounds(0, 0, 1035, 758);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Joueur2.setVisible(true);
        Joueur1photo.setVisible(true);
        Joueur1.setVisible(true);
        Joueur2photo.setVisible(true);
        jPanel3.setVisible(true);
        jPanel2.setVisible(true);
        jPanel1.setVisible(true);
        initialiserPartie();
        panelGrille.repaint();
        jButton1.setEnabled(false);


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }

    public void joueurSuivant() {
        if (joueurCourant == ListesJoueur[0]) {
            joueurCourant = ListesJoueur[1];
        } else {
            joueurCourant = ListesJoueur[0];
        }
        joueurcourant.setText(joueurCourant.nom);

        premierClic = true;
        deuxiemeClic = true;
        troisiemeClic = true;
        text.setText("  Quel ouvrier veut tu bouger ?");
    }

    public Grille initialiserPartie() {

        // 2 - on vide la grille
        newGrille.viderGrille();
        // 1- Création des Joueurs :
        String nomjoueur1 = nomJoueur1.getText();
        Joueur Joueur1 = new Joueur(nomjoueur1);

        String nomjoueur2 = nomJoueur2.getText();
        Joueur Joueur2 = new Joueur(nomjoueur2);

        ListesJoueur[0] = Joueur1; // on definie listeJoueur avec nos nouveaux joueur 
        ListesJoueur[1] = Joueur2;

        // 2- Définie les couleurs aux joueurs
        attribuerTypeAuxJoueurs();

        Ouvrier OuvrierBleu1 = new Ouvrier("B");
        Ouvrier OuvrierBleu2 = new Ouvrier("B");
        Ouvrier OuvrierGris1 = new Ouvrier("G");
        Ouvrier OuvrierGris2 = new Ouvrier("G");
        ImageIcon perso2 = new javax.swing.ImageIcon(getClass().getResource("/images/athena.png"));
        ImageIcon pionZ = new javax.swing.ImageIcon(getClass().getResource("/images/pionZ.jpg"));
        ImageIcon perso1 = new javax.swing.ImageIcon(getClass().getResource("/images/zeus1.png"));
        ImageIcon pionA = new javax.swing.ImageIcon(getClass().getResource("/images/pionA.jpg"));

        if ("Arthemis".equals(ListesJoueur[1].typePersonnage)) {

            photo2.setIcon(perso2);
            pion2.setIcon(pionZ);
            ListesJoueur[0].ListeOuvrier[0] = OuvrierGris1;
            ListesJoueur[0].ListeOuvrier[1] = OuvrierGris2;
        } else if ("Zeus".equals(ListesJoueur[1].typePersonnage)) {

            pion2.setIcon(pionA);
            photo2.setIcon(perso1);

            ListesJoueur[1].ListeOuvrier[0] = OuvrierBleu1;
            ListesJoueur[1].ListeOuvrier[1] = OuvrierBleu2;
        }

        if ("Arthemis".equals(ListesJoueur[0].typePersonnage)) {

            photo1.setIcon(perso2);
            pion1.setIcon(pionZ);
            ListesJoueur[0].ListeOuvrier[0] = OuvrierGris1;
            ListesJoueur[0].ListeOuvrier[1] = OuvrierGris2;

        } else if ("Zeus".equals(ListesJoueur[0].typePersonnage)) {

            pion1.setIcon(pionA);
            photo1.setIcon(perso1);
            ListesJoueur[1].ListeOuvrier[0] = OuvrierBleu1;
            ListesJoueur[1].ListeOuvrier[1] = OuvrierBleu2;
        }
        NOM1.setText(Joueur1.nom);
        NOM2.setText(Joueur2.nom);

        typeJoueur1.setText(Joueur1.typePersonnage);
        typeJoueur2.setText(Joueur2.typePersonnage);

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
        System.out.println(ListesJoueur[0].nom + " vous etes : " + ListesJoueur[0].typePersonnage + "vos ouvriers sont " + ListesJoueur[0].ListeOuvrier[0].couleur);
        System.out.println(ListesJoueur[1].nom + " vous etes : " + ListesJoueur[1].typePersonnage + "vos ouvriers sont " + ListesJoueur[1].ListeOuvrier[0].couleur);

        //5- Quel joueur peux commencer ?
        int n = 1 + r.nextInt(2);
        if (n == 1) {
            joueurCourant = ListesJoueur[0];
        } else {
            joueurCourant = ListesJoueur[1];
        }
        System.out.println(joueurCourant.nom + " -> c'est à toi commencer ! ");
        joueurcourant.setText(joueurCourant.nom);

        return newGrille;
    }

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Infojouer;
    private javax.swing.JPanel Joueur1;
    private javax.swing.JPanel Joueur1photo;
    private javax.swing.JPanel Joueur2;
    private javax.swing.JPanel Joueur2photo;
    private javax.swing.JLabel NOM1;
    private javax.swing.JLabel NOM2;
    private javax.swing.JPanel Santorini;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel joueurcourant;
    private javax.swing.JTextField nomJoueur1;
    private javax.swing.JTextField nomJoueur2;
    private javax.swing.JPanel panelGrille;
    private javax.swing.JLabel photo1;
    private javax.swing.JLabel photo2;
    private javax.swing.JLabel pion1;
    private javax.swing.JLabel pion2;
    private javax.swing.JTextArea text;
    private javax.swing.JLabel typeJoueur1;
    private javax.swing.JLabel typeJoueur2;
    // End of variables declaration//GEN-END:variables
}
