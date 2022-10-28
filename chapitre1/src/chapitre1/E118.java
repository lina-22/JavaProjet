package chapitre1;

import java.util.Scanner;

public class E118 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nombre ;
        int max = Integer.MIN_VALUE;
        int x = 0 ;
        int pos=0;
        while (x<10) {
            System.out.println("Donnez un nombre:");
            nombre = sc.nextInt();
            if (nombre>max) {
                max = nombre;
                pos = x+1 ;
            }
            x++;
        }
        System.out.println("Valeur max entrée: "+max);
        System.out.println("à la position "+pos);
    }
}
