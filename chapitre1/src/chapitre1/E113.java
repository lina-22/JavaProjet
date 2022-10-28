package chapitre1;

import java.util.Scanner;

public class E113 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nombre ;
        do {
            System.out.println("Donnez un nombre:");
            nombre = sc.nextInt();
            if (nombre<0 || nombre>3)
                System.out.println("Mauvaise valeur");
        }while (nombre<0 || nombre>3);
        System.out.println("Ok, fin du programme");
    }
}
