package examChap1;

import java.util.Scanner;

public class Exo11_10 {
    public static void main(String[] args) {
        System.out.println("Donnez le nombre de lignes:");
         Scanner sc = new Scanner(System.in);
         int nb = sc.nextInt();
        for (int row = 1; row <= nb ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("#");
            }
            System.out.println();

        }


    }
}
