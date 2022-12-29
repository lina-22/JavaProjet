package chapitre4.pont;

public class Point {

    private double x; // abscisse
    private double y; // ordonnée

    public Point() {
        x=0;
        y=0;
    }
    public Point(double x, double y){
        this.x = x ;
        this.y = y ;
    }
    // méthode accesseur de type GETTER
    public double getX() {
        return x ;
    }
    //méthode accesseur de type GETTER
    public double getY() {
        return y ;
    }
    public void setX(double x) {
        if (x>=0)
            this.x = x;
    }
    public void setY(double ynew) {
        if (ynew>=0)
            y = ynew;
    }
    public void placeBis(double xnew, double ynew) {
        setX(xnew) ;
        setY(ynew) ;
    }
    public void place(double xnew, double ynew) {
        if (xnew>=0)
            x = xnew; // on affecte dans l'attribut x la valeur reçue en 1er paramètre
        if (ynew>=0)
            y = ynew;
    }
    // même déplacement en x et y
    public void deplace (double dxy) {
        x += dxy; // on ajoute à l'attribut x la valeur reçue en 1er paramètre
        if (x<=0)
            x=0;
        y += dxy;
        if (y<=0)
            y=0;
    }
    public void deplace(double dx, double dy) {
        x += dx; // on ajoute à l'attribut x la valeur reçue en 1er paramètre
        if (x<=0)
            x=0;
        y += dy;
        if (y<=0)
            y=0;
    }

    public void affiche() {
        System.out.println("x = " + x + ", y = " + y);
    }
}
