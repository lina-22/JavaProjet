package examChap1.exercices11;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        System.out.println("plz enter a number");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        if(nb>=10 || nb<=20){
            System.out.println("Plus petit!!");
        }else{
            System.out.println("Plus grand!! :)");
        }
    }
}
//    Scanner sc = new Scanner(System.in);
//    int nombre ;
//        do {
//                System.out.println("Donnez un nombre:");
//                nombre = sc.nextInt();
//                if (nombre<10)
//        System.out.println("Trop petit");
//        if (nombre >20)
//        System.out.println("Trop grand");
//        }while (nombre<10 || nombre>20);
//        System.out.println("Nombre correct, fin du programme");
//        }