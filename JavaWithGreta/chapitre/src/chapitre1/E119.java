package chapitre1;

import java.util.Scanner;

public class E119 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nombre ;
        int max = Integer.MIN_VALUE;
        int x = 0 ;
        int pos=0;
        do {
            x++;
            System.out.println("Donnez un nombre:");
            nombre = sc.nextInt();
            if (nombre>max && nombre!=0) {
                max=nombre;
                pos=x;
            }
        }while (nombre!=0);
        System.out.println("Valeur max entrée: "+max);
        System.out.println("à la position "+pos);
    }
}
