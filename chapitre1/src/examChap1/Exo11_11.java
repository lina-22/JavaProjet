package examChap1;

import java.util.Scanner;

public class Exo11_11 {
    public static void main(String[] args) {
        System.out.println("Plz enter a number:");

        Scanner sc = new Scanner(System.in);

        int nb = sc.nextInt();

        for (int row = 1; row <=nb ; row++) {
            for (int col = 1; col <=nb-row ; col++) {
                System.out.print("");
            }
            for (int co = 1; co<=2*row-1 ; co++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
