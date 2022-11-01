package examChap2.exercies4;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] nb = new int[8];

        int i=0;
        do{
            System.out.println("enter a no:");
            nb[i]=sc.nextInt();
            i++;
        }while(i<8);

        for (int j = 0; j <8 ; j++) {
            System.out.print( nb[j] +" ");

        }

    }
}
