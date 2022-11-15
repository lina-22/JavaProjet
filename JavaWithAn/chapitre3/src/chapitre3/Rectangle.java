package chapitre3;

import java.util.Scanner;

public class Rectangle {
    public static Scanner sc = new Scanner(System.in);
    public static int saisieLargeur() {
        System.out.println("Quelle largeur:");
        int l = sc.nextInt();
        return l;
    }
    public static int saisieLongueur() {
        System.out.println("Quelle longueur:");
        int l =  sc.nextInt();
        return l;
    }
    public static int calculAireRectangle(int largeur, int longueur) {
        int s = largeur*longueur ;
        return s ;
    }
    public static int calculPerimetreRectangle(int largeur, int longueur) {
        int p = 2*(largeur+longueur);
        return p;
    }
    public static void affichePerimetreRectangle(int perimetre) {
        System.out.println("Périmétre du rectangle = "+perimetre);
    }
    public static void afficheAire(int aire) {
        System.out.println("Aire du rectangle = "+aire);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int l = saisieLargeur() ;
        int L = saisieLongueur() ;
        int surface = calculAireRectangle(l,L) ;
        afficheAire(surface);
        int p = calculPerimetreRectangle(l,L);
        affichePerimetreRectangle(p);
    }

}
