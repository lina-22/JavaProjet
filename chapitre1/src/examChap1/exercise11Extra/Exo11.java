package examChap1.exercise11Extra;

import java.util.Scanner;

public class Exo11 {
    public static void main(String[] args) {
        System.out.println("Plz enter a number");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();

//                Diamond patern* ************
        for (int row = 0; row <nb; row++) {
            for (int col = row; col <=nb; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <row; col++) {
                System.out.print("*");
            }
            for (int col = 0; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
 }
}
