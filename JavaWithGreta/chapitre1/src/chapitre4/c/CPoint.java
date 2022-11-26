package chapitre4.c;

public class CPoint {
    private double x ;
    private double y ;
    private int nbDeplacement ;

    public CPoint() {
        x=0; y=0; nbDeplacement=0;
    }
    public CPoint(double x, double y) {
        this.x = x;
        this.y = y;
        nbDeplacement=0;
    }
    public boolean comparer(CPoint p) {
        if (x==p.x && y==p.y)
            return true ;
        else return false ;
    }
    public void ajouterCPoint(CPoint p) {
        x += p.x;
        y += p.y;
        nbDeplacement++ ;
    }
    public void deplacerPoint(double dx, double dy) {
        x += dx;
        y += dy;
        nbDeplacement++;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public int getNbDeplacement() {
        return nbDeplacement;
    }
}
