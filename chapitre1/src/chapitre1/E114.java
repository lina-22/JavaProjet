package chapitre1;

import java.util.Scanner;

public class E114 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nombre ;
        do {
            System.out.println("Donnez un nombre:");
            nombre = sc.nextInt();
            if (nombre<10)
                System.out.println("Trop petit");
            if (nombre >20)
                System.out.println("Trop grand");
        }while (nombre<10 || nombre>20);
        System.out.println("Nombre correct, fin du programme");
    }
}
