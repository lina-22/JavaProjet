package chapitre1;

import java.util.Scanner;

public class E110 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nb ;
        System.out.println("Donnez le nombre de lignes:");
        nb = sc.nextInt();
        for (int i=1; i<=nb; i++) {
            for (int j=1 ; j<i+1 ; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
