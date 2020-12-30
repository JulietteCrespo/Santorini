/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorini_richou_crespo;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author julie
 */
public class CelluleGraphique extends JButton {
    Cellule CelluleAssociee;
    
    ImageIcon plateau = new javax.swing.ImageIcon(getClass().getResource("/images/plateau.jpg"));
    ImageIcon plateauG = new javax.swing.ImageIcon(getClass().getResource("/images/plateauG.jpg"));
    ImageIcon plateauB = new javax.swing.ImageIcon(getClass().getResource("/images/plateauB.jpg"));
    ImageIcon niveau1 = new javax.swing.ImageIcon(getClass().getResource("/images/niveau1.jpg"));
    ImageIcon niveau1G = new javax.swing.ImageIcon(getClass().getResource("/images/niveau1.jpg"));
    ImageIcon niveau1B = new javax.swing.ImageIcon(getClass().getResource("/images/niveau1.jpg"));
    ImageIcon niveau2 = new javax.swing.ImageIcon(getClass().getResource("/images/niveau2.jpg"));
    ImageIcon niveau2G = new javax.swing.ImageIcon(getClass().getResource("/images/niveau2G.jpg"));
    ImageIcon niveau2B = new javax.swing.ImageIcon(getClass().getResource("/images/niveau2B.jpg"));
    ImageIcon niveau3 = new javax.swing.ImageIcon(getClass().getResource("/images/niveau3.jpg"));
    ImageIcon niveau3G = new javax.swing.ImageIcon(getClass().getResource("/images/niveau3G.jpg"));
    ImageIcon niveau3B = new javax.swing.ImageIcon(getClass().getResource("/images/niveau3B.jpg"));
    ImageIcon niveau4 = new javax.swing.ImageIcon(getClass().getResource("/images/niveau4.jpg"));
    
    public CelluleGraphique(Cellule uneCellule){
        CelluleAssociee= uneCellule;
    } 
    

   @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        if (CelluleAssociee.etageCourant.niveauEtage==0 && CelluleAssociee.ouvrierCourant==null){
            setIcon(plateau);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==0 && CelluleAssociee.ouvrierCourant.couleur=="B"){
            setIcon(plateauB);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==0 && CelluleAssociee.ouvrierCourant.couleur=="G"){
            setIcon(plateauG);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==1 && CelluleAssociee.ouvrierCourant.couleur=="B"){
            setIcon(niveau1B);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==1 && CelluleAssociee.ouvrierCourant.couleur=="G"){
            setIcon(niveau1G);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==0 && CelluleAssociee.ouvrierCourant==null){
            setIcon(niveau1);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==2 && CelluleAssociee.ouvrierCourant.couleur=="B"){
            setIcon(niveau2B);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==2 && CelluleAssociee.ouvrierCourant.couleur=="G"){
            setIcon(niveau2G);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==2 && CelluleAssociee.ouvrierCourant==null){
            setIcon(niveau2);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==3 && CelluleAssociee.ouvrierCourant.couleur=="B"){
            setIcon(niveau3B);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==3 && CelluleAssociee.ouvrierCourant.couleur=="G"){
            setIcon(niveau3G);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==3 && CelluleAssociee.ouvrierCourant==null){
            setIcon(niveau3);
        }
        else if (CelluleAssociee.etageCourant.niveauEtage==4){
            setIcon(niveau4);
        }
          
              
        
    }

}