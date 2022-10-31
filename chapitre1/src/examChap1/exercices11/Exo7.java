package examChap1.exercices11;

import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        System.out.println("Plz enter a num:");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        int x;

        for (int i = 1; i <=nb ; i++) {
            int nb2 = nb+i;
            System.out.println(nb2);

        }

    }
}
