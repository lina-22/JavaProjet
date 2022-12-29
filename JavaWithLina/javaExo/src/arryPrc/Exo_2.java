package arryPrc;

import java.util.Scanner;


public class Exo_2 {

    public static <Scanner> void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int[] nb = new int[8];

        System.out.println("Saisissez 8 valeur entier svp : ");

        for( int i=0; i<8; i++) {
            nb[i] = sc.nextInt();
            sc.close();
            System.out.println("test ");
        }

        System.out.println("Saisissez un valeur entier à nouveau svp : ");

        int val = sc.nextInt();

    }

}
