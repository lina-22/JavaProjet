package examChap1.exercices11;

import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        System.out.println("plz enter a number:");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
            System.out.println("Le tableau de:" + nb +"est" );
        for (int i = 1; i <=10 ; i++) {
            int nb2 = i;
            System.out.println(nb +"x" +i +"=" +nb*i);

        }
    }
}
