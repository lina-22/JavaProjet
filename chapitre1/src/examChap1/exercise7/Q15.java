package examChap1.exercise7;

import java.util.Scanner;

//demande la saisie d'un entier, puis affiche l'entier saisi,
//        demande la saisie d'une chaine de caractère puis affiche la chaine saisie.
public class Q15 {
    public static void main(String[] args) {
        System.out.println("plz enter a num:");
    Scanner sc = new Scanner(System.in);
    int nb = sc.nextInt();
        System.out.println(nb);

        System.out.println("Plz enter a line:");
    Scanner ph = new Scanner(System.in);
    String line = ph.next();
        System.out.println(line);
    }

}
