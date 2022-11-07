package examChap1.exercise11Extra;

import java.util.Scanner;

public class Exo11ExtraTry {
    public static void main(String[] args) {
        System.out.println("Plz enter a no:");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        for (int row = 0; row <nb ; row++) {
            for (int col = row; col <=nb ; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <row ; col++) {
                System.out.print("*");
            }
            for (int col = 0; col <=row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
