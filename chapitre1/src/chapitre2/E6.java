package chapitre2;

import java.util.Arrays;
import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int []t1 = new int [10] ;
        int []t2 = new int [10] ;

        for (int i=0;  i<t1.length; i++) {
            System.out.println("Valeur:");
            t1[i] = sc.nextInt() ;
        }
        for (int x : t1)
            System.out.print(x+" ");
        System.out.println();

        int n = 0;
        int p = 9;
//Arrays.stream(t1).sorted().forEach(data -> System.out.println("sorted" + data));

        for (int i=0; i<t1.length; i++) {
            if (t1[i]<0) {
                t2[n] = t1[i] ;
                n++;
            }
            if (t1[i] > 0) {
                t2[p] = t1[i] ;
                p--;
            }
        }
        for (int x : t2)
            System.out.print(x+" ");
    }
}
