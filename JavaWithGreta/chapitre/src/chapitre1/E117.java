package chapitre1;

import java.util.Scanner;

public class E117 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nombre ;
        System.out.println("Donnez un nombre:");
        nombre = sc.nextInt();
        int s = 0;
        int x = 0 ;
        do {
            s = s+x ;
            x++ ;
        }while (x<=nombre);
        System.out.println("Somme de "+nombre+"="+s);
    }
}
