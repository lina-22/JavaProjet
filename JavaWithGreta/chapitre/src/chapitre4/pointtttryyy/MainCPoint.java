package chapitre4.pointtttryyy;

import chapitre4.c.CPoint;

public class MainCPoint {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        chapitre4.c.CPoint c1 = new chapitre4.c.CPoint() ;
        System.out.println("X: "+c1.getX()+", Y: "+c1.getY());
        System.out.println("Nombre de déplacements: "+c1.getNbDeplacement());
        c1.deplacerPoint(10,25);
        System.out.println("X: "+c1.getX()+", Y: "+c1.getY());
        System.out.println("Nombre de déplacements: "+c1.getNbDeplacement());
        System.out.println();
        c1.ajouterCPoint(new chapitre4.c.CPoint(-8,12));
        System.out.println("X: "+c1.getX()+", Y: "+c1.getY());
        System.out.println("Nombre de déplacements: "+c1.getNbDeplacement());
        System.out.println();
        System.out.println(c1.comparer(new chapitre4.c.CPoint(3,37))); //false
        System.out.println(c1.comparer(new chapitre4.c.CPoint(2,37))); //true

        chapitre4.c.CPoint c2 = new chapitre4.c.CPoint(15,-5);


        chapitre4.c.CPoint point1 = new chapitre4.c.CPoint();
        chapitre4.c.CPoint point2 = new CPoint(2.21, 3.21);

//        double x1 = point2.getX();
//        double y2 = point2.getY();
//
//        double x = point1.getX(); double y = point1.getY();
//        point1.comparer(point2);

        boolean result =  point1.comparer(point2);
        System.out.println(result);

    }



}



