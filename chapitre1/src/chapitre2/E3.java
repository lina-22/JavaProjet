package chapitre2;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []t = new int[8];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Donnez un nombre:");
            t[i] = sc.nextInt();
            i++;
        }while (i<8) ;

        for (int j=0; j<t.length; j++) {
            System.out.print(t[j]+"  ");
        }
        System.out.println();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (i=0;i<t.length;i++) {
            if (t[i] > max)
                max = t[i] ;
            if (t[i] < min)
                min = t[i] ;
        }
        System.out.println("Max = "+max+" ,min = "+min);
    }
}
