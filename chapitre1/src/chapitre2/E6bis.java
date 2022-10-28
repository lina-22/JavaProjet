package chapitre2;

import java.util.Scanner;

public class E6bis {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int tab [];
        int tab1[]=new int[10];
        int inc=0;
        tab = new int[10];
        for (int i=0; i<tab.length;i++) {
            System.out.println("entrez un chiffre : "+(i+1));
            tab[i]= sc.nextInt();;
        }
        System.out.println("les chiffre entrés sont: ");
        for (int x : tab)
            System.out.print(x +" ");
        System.out.println(" ");
        for (int i=0; i<tab.length;i++) {
            if (tab[i]<0) {
                tab1[inc]=tab[i];
                inc++;
            }
        }
        for (int i=0; i<tab.length;i++) {
            if (tab[i]==0) {
                tab1[inc]=tab[i];
                inc++;
            }
        }
        for (int i=0; i<tab.length;i++) {
            if (tab[i]>0) {
                tab1[inc]=tab[i];
                inc++;
            }
        }

        for (int x :tab1) {
            System.out.print(x + " ");
        }

    }
}
