package examChap2.exercies4;


import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
//        1st line 1st part
        Scanner sc = new Scanner(System.in);
        int [] tab = new int[8];
        int i = 0;
        do{
            System.out.println("plz enter a no:");
            tab[i]=sc.nextInt();
            i++;
        }while(i<8);

//        1st line 2nd part
        System.out.println("le tab est:");
        for (int j = 0; j < tab.length ; j++) {
            System.out.print(j +" ");
        }


//        min et max
        System.out.println();
        int max = Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;

        for (int j = 0; j < tab.length ; j++) {
            if(tab[j]>max)
                max = tab[j];

            if (tab[j] < min)
                min = tab[j] ;
        }
        System.out.println("min valu est "+ min +"max value est:"+max);
    }
}
