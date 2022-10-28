package examChap1;

import java.util.Scanner;

public class Exo11_10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int nb = sc.nextInt();

        for (int row = 0; row <= nb ; row++) {
            for (int col = 0; col <=row ; col++) {
                System.out.print("#");
            }
            System.out.println();

        }


    }
}
