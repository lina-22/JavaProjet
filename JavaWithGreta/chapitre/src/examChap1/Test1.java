package examChap1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Plz enter a number");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();

//                for (int row = 1; row <=nb; row++) {
//            for (int col = row; col <=nb; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 1; col <row; col++) {
//                System.out.print("*");
//            }
//            for (int col = 1; col <=row; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        for (int row = 1; row <=nb ; row++) {
            for (int col = row; col <=nb; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <row ; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }


}

