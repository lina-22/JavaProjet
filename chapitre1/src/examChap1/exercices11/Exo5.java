package examChap1.exercices11;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        System.out.println("Plz enter a number:");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int h = nb+i;
            System.out.print(h);

        }

    }
}


//    // TODO Auto-generated method stub
//    Scanner sc = new Scanner(System.in);
//    int nombre ;
//        System.out.println("Donnez un nombre:");
//                nombre = sc.nextInt();
//                for (int x=1; x<=10; x++) {
//                int s = nombre+x;
//                System.out.println(s);
//                }
//                }