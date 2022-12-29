package chapitre4.formes;

public class Rectangle {
    /* Les propriétés = attributs = données membres */
    private float largeur;
    private float longueur;
    // Position du centre du rectangle (X,Y) dans le plan.
    private int x;
    private int y;
    private float angle;

    public Rectangle(float longueur, float largeur) {
        this.largeur = largeur;
        this.longueur = longueur;
        x = 0;
        y = 0;
        angle = 0;
    }

    public Rectangle(float longueur, float largeur, int x, int y) {
        this.largeur = largeur;
        this.longueur = longueur;
        this.x = x;
        this.y = y;
        angle = 0;
    }

    public Rectangle() {
        largeur = 10;
        longueur = 20;
        x = 10;
        y = 5;
        angle = 0;
    }

    /* Les opérations = méthodes = fonctions membres */
    public void translater(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public void tourner(float a) {
        /* A coder */ }

    public void agrandir(float a) {
        if (a > 1) {
            largeur *= a;
            longueur *= a;
        }
    }
    public int compareSurface(Rectangle r) {
        float s = largeur*longueur;
        float sArgument = r.largeur*r.longueur;
        if (s > sArgument)
            return 1;
        if (s == sArgument)
            return 0;
        return -1 ;
    }
    public void reduire(float a) {
        /* A coder */ }

    public void afficher() {
        System.out.println("Ma longueur= " + longueur + " et ma largeur= " + largeur);
        System.out.println("Je suis en X = " + x + " et en Y = " + y);
    }
}
