package chapitre4.formes;


import java.util.Scanner;

public class MainRectangle {
    public static Rectangle creerRectangle() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Longueur:");
        float L = sc.nextFloat();
        System.out.println("Largeur:");

        float l = sc.nextFloat();
        System.out.println("X:");
        int x = sc.nextInt();
        System.out.println("Y:");
        int y = sc.nextInt();
        Rectangle r = new Rectangle(L,l,x,y);
        return r;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        Rectangle monrec;
        monrec = new Rectangle();
        monrec.afficher();
        monrec.translater(10, 15);
        monrec.afficher();
        Rectangle r1 = new Rectangle(100,90);
        r1.afficher();
        Rectangle r2 = new Rectangle(20,15,50,40);
        r2.afficher();
		/*
		System.out.println("Longueur:");
		float L = sc.nextFloat();
		System.out.println("Largeur:");
		float l = sc.nextFloat();
		Rectangle r3 = new Rectangle(L,l);
		r3.afficher();*/
        System.out.println();
        Rectangle r4 = creerRectangle();
        r4.afficher();
        r4.agrandir(2);
        r4.afficher();
        System.out.println(r1.compareSurface(r4));
        System.out.println(r1.compareSurface(r1));
        System.out.println(r2.compareSurface(r1));
    }
}
