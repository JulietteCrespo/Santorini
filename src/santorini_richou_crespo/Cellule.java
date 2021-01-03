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
public class Cellule {

    Etage etageCourant;
    Ouvrier ouvrierCourant;
    

    public Cellule() {
        etageCourant = new Etage(0);
        ouvrierCourant = null;
    }
    
    public boolean placerEtage (){
    if (etageCourant.niveauEtage==4){
        return false;
    }
    else {
        etageCourant.niveauEtage++;
        return true;
    } 
}
    public boolean affecterEtage(Etage unEtage){
    if (etageCourant==null){
        etageCourant=unEtage;
        return true;
    }
    else {
        return false;
    }
}
  public boolean presenceEtage(){
      return etageCourant!= null;
  }
    
 public boolean presenceOuvrier(){
      return ouvrierCourant!= null;
  }
 public boolean etageRemplie(){
     if (etageCourant.niveauEtage==4){
         return true;
     }
     else{
         return false;
     }
 }
}
