package chapitre1;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Donnez une heure:");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        ////////////////////////////////////
        // Sécurisation de l'application////
        if (h>=0 && h <=24) {
            if (h <= 16)
                System.out.println("Bonjour");
            else
                System.out.println("Bonsoir");
        }
        else
            System.out.println("Heure donnée bizarre!!!");
    }
}
