package chapitre2;

import java.util.Scanner;

public class
Tableau2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nb ;

        System.out.println("Quel est le nombre actuel de stagiaires:");
        nb = sc.nextInt();
        sc.nextLine();
        String classe[] ;

        classe = new String[nb];

        for (int i=0; i<classe.length; i++) {
            System.out.println("Nom : ");
            classe[i] = sc.nextLine();
        }
        //Vérif
        for(String n : classe)
            System.out.println("Nom : "+n);
    }
}
