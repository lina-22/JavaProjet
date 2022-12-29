package chapitre4.c;

public class MainCPoint {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CPoint c1 = new CPoint() ;
        System.out.println("X: "+c1.getX()+", Y: "+c1.getY());
        System.out.println("Nombre de déplacements: "+c1.getNbDeplacement());
        c1.deplacerPoint(10,25);
        System.out.println("X: "+c1.getX()+", Y: "+c1.getY());
        System.out.println("Nombre de déplacements: "+c1.getNbDeplacement());
        System.out.println();
        c1.ajouterCPoint(new CPoint(-8,12));
        System.out.println("X: "+c1.getX()+", Y: "+c1.getY());
        System.out.println("Nombre de déplacements: "+c1.getNbDeplacement());
        System.out.println();
        System.out.println(c1.comparer(new CPoint(3,37))); //false
        System.out.println(c1.comparer(new CPoint(2,37))); //true

        CPoint c2 = new CPoint(15,-5);
        System.out.println(c1.comparer(c2));	//false

    }

}

