package chapitre2;

import java.util.Scanner;

public class E5bis {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []annee = {31,28,31,30,31,30,31,31,30,31,30,31};
        int mois, jour, nb=0;

        String date ;
        Scanner sc = new Scanner(System.in);
        String []dateT ;
        do {
            do {
                System.out.println("Quelle date (jj/mm) :");
                date= sc.nextLine();
                dateT = date.split("/");
            } while(dateT.length !=2);
            jour = Integer.parseInt(dateT[0]);
            mois = Integer.parseInt(dateT[1]);
        }while(mois<=0 || mois>12 || jour<=0 || jour> annee[mois-1]);

        int i = 0;
        while (i<mois-1) {
            nb = nb+annee[i] ;
            i++;
        }
        nb = nb +jour ;
        System.out.println("Nombre de jours demandé: "+nb);
    }
}
