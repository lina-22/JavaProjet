package chapitre4.pointtttryyy;

public class CPoint {

    private double x;

    private double y;

    private int nbDeplacement;

    public CPoint(){
        x= 0; y=0; nbDeplacement= 0;
    }

//    Dans le fichier source de la classe CPoint, vous devez justifier soigneusement :
//            - le type et le rôle de chaque attribut;
// - le prototype de chaque méthode :
//            - type et valeurs possibles de la valeur de retour;
// - type et rôle de chaque paramètre;


    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public int getNbDeplacement() {
        return nbDeplacement;
    }


    //    *******************************************
//     - d'une méthode qui permet de déplacer un point (l'appel de cette méthode doit constituer le
//    seul moyen pour l'utilisateur de modifier les coordonnées d'un point après sa création),
//            - de méthodes permettant d'accéder aux attributs du point (justifier vos choix).
//    ********************************************************************
    public void deplacerPoint(double dx, double dy) {
        x += dx;
        y += dy;
        nbDeplacement++;
    }

//    **************************
//    Ajouter dans la classe CPoint une fonction membre:
//    void ajouter(CPoint p)
//    qui recalcule les coordonnées du point appelant en ajoutant les coordonnées du point donné en
//    paramètre:
//    x du point appelant = x du point appelant + x du point en paramètre
//    y du point appelant = y du point appelant + y du point en paramètre

   public void ajouterCPoint(CPoint p){

        x += p.x;
        y += p.y;
        nbDeplacement++;
   }
//
//    Ajouter dans la classe CPoint une fonction membre:
//    boolean comparer(CPoint p)
//    qui retourne true si les coordonnées du point appelant sont égales aux coordonnées du point donné en
//    paramètre.

     public boolean comparer(CPoint p){
        if(x==p.x && y==p.y)
            return true;
        else return false;
     }

}
