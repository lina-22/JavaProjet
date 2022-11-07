package examChap1;

import java.util.Scanner;

public class ExtraTry5 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);

        int nb = sc.nextInt();
        int T=0;
        int L=0;
        for (int i = 1; i <=10 ; i++) {
             L = nb+i;
            System.out.print(L+ " ");
        }
        System.out.println("The total sum is : "+(L =  L+L));


    }
}
