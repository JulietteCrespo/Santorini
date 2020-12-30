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
public class Grille {

    Cellule[][] grille = new Cellule[5][5];

    Grille() {
        for (int i = 0; i < 5; i++) { // Double boucle imbriquer qui nous permet de parcourrir tout le tableau
            for (int j = 0; j < 5; j++) {
                grille[i][j] = new Cellule();
            }
        }
    }

    public boolean AjouterEtagePossible(int ligne, int colonne) {
        if (grille[ligne][colonne].etageCourant.niveauEtage == 4) {
            System.out.print("etage max");
            return false;
        } else {
            //grille[ligne][colonne].etageCourant.niveauEtage++;
            return true;
        }
    }

    public boolean DeplacementPossible(int x1, int y1, int x2, int y2) {
        int a = grille[x2][y2].etageCourant.niveauEtage - grille[x1][y1].etageCourant.niveauEtage;
        if (grille[x2][y2].etageCourant.niveauEtage == 4) {
            return false;
        } else {
            // angle en haut a gauche
            if (x1 == 0 && y1 == 0) {
                if (x2 == x1 + 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                }
                if (x2 == x1 + 1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                }
                if (x2 == x1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
            // Conne 1 
            if (y1 == 0) {
                if (x1 == 1 || x1 == 2 || x1==3) {
                    if (x2 == x1 - 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 - 1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 + 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 + 1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    } else {
                        return false;
                    }

                }
            }

            // angle en bas a gauche
            if (x1 == 4 && y1 == 0) {
                if (x2 == x1 - 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                }
                if (x2 == x1 - 1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                }
                if (x2 == x1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
            // Ligne 1 
            if (x1 == 0) {
                if (y1 == 1 || y1 == 2 || y1==3) {
                    if (y2 == y1 - 1 && x2 == x1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 + 1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 + 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 + 1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    } else {
                        return false;
                    }

                }
            }
            // angle en haut a droite
            if (x1 == 0 && y1 == 4) {
                if (x2 == x1 + 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                }
                if (x2 == x1 + 1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                }
                if (x2 == x1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
            // angle en bas a droite
            if (x1 == 4 && y1 == 4) {
                if (x2 == x1 - 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                }
                if (x2 == x1 - 1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                }
                if (x2 == x1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                    if (a == 1 || a <= 0) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
            // Ligne 4 
            if (x1 == 4) {
                if (y1 == 1 || y1 == 2 || y1==3) {
                    if (y2 == y1 - 1 && x2 == x1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 - 1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 - 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 - 1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    } else {
                        return false;
                    }

                }
            }

            // Conne 4 
            if (y1 == 4) {
                if (x1 == 1 || x1 == 2 || x1==3) {
                    if (y2 == y1 && x2 == x1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 - 1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 + 1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 + 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    } else {
                        return false;
                    }

                }
            }

            //Centre 
            if (y1 == 1 || y1 == 2 || y1==3) {
                if (x1 == 1 || x1 == 2 || x1==3) {
                    if (x2 == x1 + 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 - 1 && y2 == y1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 + 1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 - 1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 + 1 && y2 == y1 - 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    }
                    if (x2 == x1 - 1 && y2 == y1 + 1 && grille[x2][y2].presenceOuvrier() == false) {
                        if (a == 1 || a <= 0) {
                            return true;
                        }
                    } else {
                        return false;
                    }

                }
            }
        }

        return false;

    }

    public void viderGrille() {
        int i;
        int j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) { // double boucle qui permet de mettre les cellules a null
                // on mets grille[i][j] a null

                grille[i][j].etageCourant.niveauEtage = 0;
                grille[i][j].ouvrierCourant = null;
            }
        }
    }

    public void afficherGrilleSurConsole() {
        int i;
        int j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (grille[i][j].ouvrierCourant != null) { //on affiche d'abord les trou noir car un trou noir peu caché un desintegrateur
                    System.out.print(grille[i][j].ouvrierCourant.couleur);
                } else if (grille[i][j].etageCourant.niveauEtage == 0) {
                    System.out.print("   ");
                } else if (grille[i][j].etageCourant.niveauEtage == 1) {
                    System.out.print(" 1 ");
                } else if (grille[i][j].etageCourant.niveauEtage == 2) {
                    System.out.print(" 2 ");
                } else if (grille[i][j].etageCourant.niveauEtage == 3) {
                    System.out.print(" 3 ");
                } else if (grille[i][j].etageCourant.niveauEtage == 4) {
                    System.out.print(" X ");

                } else if (grille[i][j].ouvrierCourant == null) {
                    System.out.print("   ");
                }
            }
            System.out.println("\u001B[47m " + (i + 1) + " \u001B[40m");
        }
        for (int k = 0; k < 5; k++) {
            System.out.print("\u001B[47m " + (k + 1) + " \u001B[40m");
        }
        System.out.println();
    }

    boolean etreGagnantePourJoueur(Joueur unJoueur) {
        if (unJoueur.ListeOuvrier[0].niveauEtage == 3 || unJoueur.ListeOuvrier[1].niveauEtage == 3) {
            return true;
        }
        return false;
    }

    public boolean etrePerdantPourJoueur(Joueur unJoueur) {
        // un des deux ouvries dois pouvoir jouer
        int x = unJoueur.ListeOuvrier[0].Xouvrier;
        int y = unJoueur.ListeOuvrier[0].Youvrier;

        // angle en haut a gauche
        if (x == 0 && y == 0) {
            if (DeplacementPossible(x, y, x + 1, y) == false) {
                if (DeplacementPossible(x, y, x + 1, y + 1) == false) {
                    if (DeplacementPossible(x, y, x, y + 1) == false) {
                        return true;
                    }
                }
            }
        }
        // Conne 1 
        if (y == 0) {
            if (x == 1 || x == 2|| x==3) {
                if (DeplacementPossible(x, y, x - 1, y) == false) {
                    if (DeplacementPossible(x, y, x - 1, y + 1) == false) {
                        if (DeplacementPossible(x, y, x, y + 1) == false) {
                            if (DeplacementPossible(x, y, x + 1, y) == false) {
                                if (DeplacementPossible(x, y, x + 1, y + 1) == false) {
                                    return true;
                                }
                            }

                        }
                    }
                }

            }
        }

        // angle en bas a gauche
        if (x == 4 && y == 0) {
            if (DeplacementPossible(x, y, x - 1, y) == false) {
                if (DeplacementPossible(x, y, x - 1, y + 1) == false) {
                    if (DeplacementPossible(x, y, x, y + 1) == false) {
                        return true;
                    }
                }
            }
        }
        // Ligne 1 
        if (x == 0) {
            if (y == 1 || y == 2|| y==3) {
                if (DeplacementPossible(x, y, x, y - 1) == false) {
                    if (DeplacementPossible(x, y, x + 1, y - 1) == false) {
                        if (DeplacementPossible(x, y, x + 1, y) == false) {
                            if (DeplacementPossible(x, y, x + 1, y + 1) == false) {
                                if (DeplacementPossible(x, y, x, y + 1) == false) {
                                    return true;
                                }
                            }
                        }
                    }
                }

            }
        }
        // angle en haut a droite
        if (x == 0 && y == 4) {
            if (DeplacementPossible(x, y, x + 1, y) == false) {
                if (DeplacementPossible(x, y, x + 1, y - 1) == false) {
                    if (DeplacementPossible(x, y, x + 1, y - 1) == false) {
                        return true;
                    }
                }
            }

        }
        // angle en bas a droite
        if (x == 4 && y == 4) {
            if (DeplacementPossible(x, y, x - 1, y) == false) {
                if (DeplacementPossible(x, y, x - 1, y - 1) == false) {
                    if (DeplacementPossible(x, y, x, y - 1) == false) {
                        return true;
                    }
                }
            }
        }
        // Ligne 4 
        if (x == 4) {
            if (y == 1 || y == 2|| y==3) {
                if (DeplacementPossible(x, y, x, y - 1) == false) {
                    if (DeplacementPossible(x, y, x - 1, y - 1) == false) {
                        if (DeplacementPossible(x, y, x - 1, y) == false) {
                            if (DeplacementPossible(x, y, x - 1, y + 1) == false) {
                                if (DeplacementPossible(x, y, x, y + 1) == false) {
                                    return true;
                                }
                            }
                        }

                    }

                }
            }
        }
        // Conne 4 
        if (y == 4) {
            if (x == 1 || x == 2|| x== 3) {
                if (DeplacementPossible(x, y, x - 1, y) == false) {
                    if (DeplacementPossible(x, y, x - 1, y - 1) == false) {
                        if (DeplacementPossible(x, y, x, y - 1) == false) {
                            if (DeplacementPossible(x, y, x + 1, y - 1) == false) {
                                if (DeplacementPossible(x, y, x + 1, y + 1) == false) {
                                    return true;
                                }
                            }
                        }
                    }

                }
            }

        }

        //Centre 
        if (y == 1 || y == 2 || y==3) {
            if (x == 1 || x == 2 ||x==3) {
                if (DeplacementPossible(x, y, x + 1, y) == false) {
                    if (DeplacementPossible(x, y, x, y + 1) == false) {
                        if (DeplacementPossible(x, y, x + 1, y + 1) == false) {
                            if (DeplacementPossible(x, y, x - 1, y) == false) {
                                if (DeplacementPossible(x, y, x, y - 1) == false) {
                                    if (DeplacementPossible(x, y, x - 1, y - 1) == false) {
                                        if (DeplacementPossible(x, y, x - 1, y + 1) == false) {
                                            if (DeplacementPossible(x, y, x + 1, y - 1) == false) {
                                                return true;
                                            }
                                        }

                                    }

                                }

                            }
                        }
                    }
                }

            }
        }

        int x1 = unJoueur.ListeOuvrier[1].Xouvrier;
        int y1 = unJoueur.ListeOuvrier[1].Youvrier;
        if (x1 == 0 && y1 == 0) {
            if (DeplacementPossible(x1, y1, x1 + 1, y1) == false) {
                if (DeplacementPossible(x1, y1, x1 + 1, y1 + 1) == false) {
                    if (DeplacementPossible(x1, y1, x1, y1 + 1) == false) {
                        return true;
                    }
                }
            }
        }
        // Conne 1 
        if (y1 == 0) {
            if (x1 == 1 || x1 == 2 || x1==3) {
                if (DeplacementPossible(x1, y1, x1 - 1, y1) == false) {
                    if (DeplacementPossible(x1, y1, x1 - 1, y1 + 1) == false) {
                        if (DeplacementPossible(x1, y1, x1, y1 + 1) == false) {
                            if (DeplacementPossible(x1, y1, x1 + 1, y1) == false) {
                                if (DeplacementPossible(x1, y1, x1 + 1, y1 + 1) == false) {
                                    return true;
                                }
                            }

                        }
                    }
                }

            }
        }

        // angle en bas a gauche
        if (x1 == 4 && y1 == 0) {
            if (DeplacementPossible(x1, y1, x1 - 1, y1) == false) {
                if (DeplacementPossible(x1, y1, x1 - 1, y1 + 1) == false) {
                    if (DeplacementPossible(x1, y1, x1, y + 1) == false) {
                        return true;
                    }
                }
            }
        }
        // Ligne 1 
        if (x1 == 0) {
            if (y1 == 1 || y1 == 2|| y1==3) {
                if (DeplacementPossible(x1, y1, x1, y1 - 1) == false) {
                    if (DeplacementPossible(x1, y1, x1 + 1, y1 - 1) == false) {
                        if (DeplacementPossible(x1, y1, x1 + 1, y1) == false) {
                            if (DeplacementPossible(x1, y1, x1 + 1, y1 + 1) == false) {
                                if (DeplacementPossible(x1, y1, x1, y1 + 1) == false) {
                                    return true;
                                }
                            }
                        }
                    }
                }

            }
        }
        // angle en haut a droite
        if (x1 == 0 && y1 == 4) {
            if (DeplacementPossible(x1, y1, x1 + 1, y1) == false) {
                if (DeplacementPossible(x1, y1, x1 + 1, y1 - 1) == false) {
                    if (DeplacementPossible(x1, y1, x1 + 1, y1 - 1) == false) {
                        return true;
                    }
                }
            }

        }
        // angle en bas a droite
        if (x1 == 4 && y1 == 4) {
            if (DeplacementPossible(x1, y1, x1 - 1, y1) == false) {
                if (DeplacementPossible(x1, y1, x1 - 1, y1 - 1) == false) {
                    if (DeplacementPossible(x1, y1, x1, y1 - 1) == false) {
                        return true;
                    }
                }
            }
        }
        // Ligne 4 
        if (x1 == 4) {
            if (y1 == 1 || y1 == 2|| y1==3) {
                if (DeplacementPossible(x1, y1, x1, y1 - 1) == false) {
                    if (DeplacementPossible(x1, y1, x1 - 1, y1 - 1) == false) {
                        if (DeplacementPossible(x1, y1, x1 - 1, y1) == false) {
                            if (DeplacementPossible(x1, y1, x1 - 1, y1 + 1) == false) {
                                if (DeplacementPossible(x1, y1, x1, y1 + 1) == false) {
                                    return true;
                                }
                            }
                        }

                    }

                }
            }
        }
        // Conne 4 
        if (y1 == 4) {
            if (x1 == 1 || x1 == 2|| x1==3) {
                if (DeplacementPossible(x1, y1, x1 - 1, y1) == false) {
                    if (DeplacementPossible(x1, y1, x1 - 1, y1 - 1) == false) {
                        if (DeplacementPossible(x1, y1, x1, y1 - 1) == false) {
                            if (DeplacementPossible(x1, y1, x1 + 1, y1 - 1) == false) {
                                if (DeplacementPossible(x1, y1, x1 + 1, y1 + 1) == false) {
                                    return true;
                                }
                            }
                        }
                    }

                }
            }

        }

        //Centre 
        if (y1 == 1 || y1 == 2 || y1==3) {
            if (x1 == 1 || x1 == 2|| x1==3) {
                if (DeplacementPossible(x1, y1, x1 + 1, y1) == false) {
                    if (DeplacementPossible(x1, y1, x1, y1 + 1) == false) {
                        if (DeplacementPossible(x1, y1, x1 + 1, y1 + 1) == false) {
                            if (DeplacementPossible(x1, y1, x1 - 1, y1) == false) {
                                if (DeplacementPossible(x1, y1, x1, y1 - 1) == false) {
                                    if (DeplacementPossible(x1, y1, x1 - 1, y1 - 1) == false) {
                                        if (DeplacementPossible(x1, y1, x1 - 1, y1 + 1) == false) {
                                            if (DeplacementPossible(x1, y1, x1 + 1, y1 - 1) == false) {
                                                return true;
                                            }
                                        }

                                    }

                                }

                            }
                        }
                    }
                }

            }
        }
        return false;

    }

    public boolean EtageComplet(int x, int y) {
        if (grille[x][y].etageCourant.niveauEtage == 4) {
            return true;
        }
        return false;
    }

    public boolean possibleDeConstruire(Ouvrier unOuvrier) {
        // un des deux ouvries dois pouvoir jouer
        int x = unOuvrier.Xouvrier;
        int y = unOuvrier.Youvrier;

        // angle en haut a gauche
        if (x == 0 && y == 0) {
            if (EtageComplet(x + 1, y) == false && grille[x][y].presenceOuvrier() == false) {

                return true;
            }
            if (EtageComplet(x + 1, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                return true;
            }
            if (EtageComplet(x, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                return true;
            } else {
                return false;
            }
        }
        // Conne 1 
        if (y == 0) {
            if (x == 1 || x == 2|| x==3) {
                if (EtageComplet(x - 1, y) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x - 1, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x + 1, y) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x + 1, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;

                } else {
                    return false;
                }

            }
        }

        // angle en bas a gauche
        if (x == 4 && y == 0) {
            if (EtageComplet(x - 1, y) == false && grille[x][y].presenceOuvrier() == false) {
                return true;
            }
            if (EtageComplet(x - 1, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                return true;
            }
            if (EtageComplet(x, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                return true;

            } else {
                return false;
            }
        }
        // Ligne 1 
        if (x == 0) {
            if (y == 1 || y == 2|| y==3) {
                if (EtageComplet(x, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x + 1, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x + 1, y) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x + 1, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;

                } else {
                    return false;
                }

            }
        }
        // angle en haut a droite
        if (x == 0 && y == 4) {
            if (EtageComplet(x + 1, y) == false && grille[x][y].presenceOuvrier() == false) {

                return true;
            }
            if (EtageComplet(x + 1, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                return true;
            }
            if (EtageComplet(x, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                return true;

            } else {
                return false;
            }
        }
        // angle en bas a droite
        if (x == 4 && y == 4) {
            if (EtageComplet(x - 1, y) == false && grille[x][y].presenceOuvrier() == false) {

                return true;
            }
            if (EtageComplet(x - 1, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                return true;
            }
            if (EtageComplet(x, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                return true;

            } else {
                return false;
            }
        }
        // Ligne 4 
        if (x == 4) {
            if (y == 1 || y == 2 || y==3) {
                if (EtageComplet(x, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x - 1, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x - 1, y) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x - 1, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                } else {
                    return false;
                }

            }
        }

        // Conne 4 
        if (y == 4) {
            if (x == 1 || x == 2|| x==  3) {
                if (EtageComplet(x, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x - 1, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x + 1, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x + 1, y) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;

                } else {
                    return false;
                }

            }
        }

        //Centre 
        if (y == 1 || y == 2 || y==3) {
            if (x == 1 || x == 2 || x==3) {
                if (EtageComplet(x + 1, y) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x - 1, y) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x + 1, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x - 1, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x - 1, y + 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;
                }
                if (EtageComplet(x + 1, y - 1) == false && grille[x][y].presenceOuvrier() == false) {

                    return true;

                } else {
                    return false;
                }

            }
        }

        return false;
    }

}
