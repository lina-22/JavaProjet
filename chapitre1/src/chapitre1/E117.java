package chapitre1;

import java.util.Scanner;

public class E117 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nombre ;
        System.out.println("Donnez un nombre:");
        nombre = sc.nextInt();
        int x = 0 ;
        int s = 0;
        do {
            s = s+x ;
            x++ ;
        }while (x<=nombre);
        System.out.println("Somme de "+nombre+"="+s);
    }
}
