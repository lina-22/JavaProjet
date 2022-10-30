package examChap1.Exercices11;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        System.out.println("Plz enter a number");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();

        if( nb <=3){
            System.out.println("c'est bien");
        }
        else{
            System.out.println( "cest une mouvaise no");

        }
    }
}
