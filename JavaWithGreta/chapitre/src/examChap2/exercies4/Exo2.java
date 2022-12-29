package examChap2.exercies4;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] nb = new int[8];

        int i = 0;
        do{
            System.out.println("Donnez un nombre:");
            nb[i]=sc.nextInt();
            i++;
        }while(i<8);
    }
}
//    int []t = new int[8];
//    Scanner sc = new Scanner(System.in);
//    int i = 0;
//        do {
//                System.out.println("Donnez un nombre:");
//                t[i] = sc.nextInt();
//                i++;
//                }while (i<8) ;
//
//
//        for (int j=0; j<t.length; j++) {
//        System.out.print(t[j]+"  ");
//        }
//        System.out.println();
//        System.out.println("Tapez la valeur recherchée:");
//
//        int val = sc.nextInt();
//        int cp = 0 ;
//
//        for (i=0; i<t.length; i++) {
//        if (t[i] ==val)
//        cp++;
//        }
//        System.out.println("Nombre d'occurence: "+cp);
//        }