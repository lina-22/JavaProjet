package chapitre4.pont;

public class TestPoint {
    public static void main(String[] args) {
        Point a, b; // déclaration de 2 objets nommés a et b (*1)
        a = new Point(10,15); // création d'un objet de la classe Point (*2)
        b = new Point(20,25); // création d'un objet de la classe Point (*2)
        Point c ;
        c = new Point();
        c.affiche();
        a.affiche();
        b.affiche();
        System.out.println();
        //a.x = -10; // (*3)
        //a.y = 8.5; // (*4)
        a.affiche(); // (*5)
        a.deplace(1.5, 2.6); // (*6)
        a.affiche();
        b.place(1.1, 2.2);
        b.affiche();
        //b.x = 10;
        b.deplace(-5, 4);
        b.affiche();
        b.deplace(20);
        b.affiche();
        double xA = a.getX();
        double yA = a.getY();
        System.out.println("Coordonnées : "+ xA+","+yA);

        System.out.println("Coordonnées : "+b.getX()+","+b.getY());
    }
}
