package examChap1.exercise9;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        System.out.println("plz enter the time:");
        Scanner sc = new Scanner(System.in);
        double t1 = sc.nextDouble();
        if ( t1 <=16)
            System.out.println("Bonjour");
        else if (t1>16)
            System.out.println("Bonsoir");


    }
}
