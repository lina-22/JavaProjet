package examChap2.nextTry;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int []tab1 =new int[8];

//        first part

        int i =0;
        do{
            System.out.println("Enter un num: ");
            tab1[i]=sc.nextInt();
            i++;
        }while(i<8);


//        2nd part of first line

        System.out.println("  ");
        System.out.println("range dans un tableau");
        for (int j=0; j<tab1.length; j++) {
            System.out.print(tab1[j]+"  ");
        }
        System.out.println();

        //        3rd part of 2nd line

        System.out.println("choisissez le nombre");
        int val = sc.nextInt();


        //        4th part of last line


        int cn = 0;

        for (int j = 0; j <tab1.length ; j++) {
            if(tab1[j]==val)
                cn++;
        }
        System.out.println("nb déja exist:"+cn);


    }
}

