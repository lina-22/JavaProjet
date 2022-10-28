package chapitre2;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []t = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<t.length;i++) {
            double r = Math.random();
            int x = (int)Math.ceil(r*100);
            t[i] = x ;
        }
        for (int v : t)
            System.out.print(v+" ");
        System.out.println();
        System.out.println("Valeur min de l'intervalle:");
        int val1 = sc.nextInt();
        System.out.println("Valeur max de l'intervalle:");
        int val2 = sc.nextInt();
        int cp = 0;
        for (int v : t) {
            if (v>=val1 && v<=val2)
                cp++;
        }
        System.out.println("Nombre de valeurs: "+cp);
    }
}
