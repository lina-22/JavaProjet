package examChap2.nextTry;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []tab = new int[4];

        int i =0;
        do{
            System.out.println("enter a no:");
            tab[i]= sc.nextInt();
            System.out.println(tab[i]);
            i++;
        }while(i<4);

//        range
            System.out.println("the table est:");
        for (int j = 0; j <tab.length ; j++) {
            System.out.print(j+"**");

        }

//        autre 2 entier

        System.out.println("plz enter a no:");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

    }
}
