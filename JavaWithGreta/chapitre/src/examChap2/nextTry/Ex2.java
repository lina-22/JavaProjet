package examChap2.nextTry;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //    first part first line
        Scanner sc = new Scanner(System.in);
        int []tab1 = new int[8];

        int i = 0;
        do{
            System.out.println("donner un nb: ");
            int nb = sc.nextInt();
            System.out.println( nb);
            i++;
        }while(i<8);
        //    2nd part first line
        System.out.println("the table is:");
        for (int j = 0; j < tab1.length ; j++) {
            System.out.print(j+" ");
        }
        //    2nd  line
        System.out.println("plz enter ur nb");
        int val = sc.nextInt();

        //    3rd line

        int cn =0;
        for (int j = 0; j < tab1.length ; j++) {
            if(val == j ){
                cn++;
            }
            System.out.println("you enter the nb"+cn+"times");
        }


        }
    }



