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


        CPoint point1 = new CPoint();
        CPoint point2 = new CPoint(2.21, 3.21);

//        double x1 = point2.getX();
//        double y2 = point2.getY();
//
//        double x = point1.getX(); double y = point1.getY();
//        point1.comparer(point2);

        boolean result =  point1.comparer(point2);
        System.out.println(result);

    }



}



