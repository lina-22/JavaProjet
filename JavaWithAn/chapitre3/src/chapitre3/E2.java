package chapitre3;

import java.util.Scanner;

public class E2 {
    public static int saisirEntier() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }
    public static int genereNombre(int n) {
        double l = n*Math.random();  // retourne un nombre aléatoire double compris entre 0 et n exclu
        long L = Math.round(l);  	// arrondit le double en long compris entre 0  et n
        int x = (int)L;				// convertit le long en entier
        return x ;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int alea = genereNombre(100);
        int n ;
        do {
            System.out.println("Donner un entier:");
            n = saisirEntier() ;
            if ( n> alea)
                System.out.println("Trop grand");
            if (n<alea)
                System.out.println("Trop petit");
        } while (alea != n);
        System.out.println("Bravo, vous avez gagné le jambon!");
    }
}
