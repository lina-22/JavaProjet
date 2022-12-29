package examChap1.exercices11;

import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        System.out.println("Plz enter a num:");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        int stValue = 0;
        int total = 0;
        do {
            total = total + stValue;
            stValue++;
        }while (stValue <= nb);
        System.out.println("total : " + total);


    }
}
