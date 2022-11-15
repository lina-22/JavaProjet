package chapitre3;

import java.util.Scanner;

public class E3 {
    public static boolean controleDate(int jour, int mois) {
        int annee[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (mois<=0 || mois>12)
            return false ;
        if (jour<=0 || jour > annee[mois-1])
            return false ;
        return true ;
    }
    public static int getNbJourDebutAn(int jour, int mois) {
        int annee[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int somme = 0;
        int m = 0;
        while ( m< mois-1) {
            somme += annee[m];
            m++;
        }
        somme += jour ;
        return somme ;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        boolean ok ;
        int m, j ;
        do {
            System.out.println("Mois:");
            m = sc.nextInt();
            System.out.println("Jour:");
            j = sc.nextInt();
            ok = controleDate(j,m);
        } while (ok==false);
        System.out.println("Nombre de jours demandé: "+getNbJourDebutAn(j,m));
    }
}
