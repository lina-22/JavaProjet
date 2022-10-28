package chapitre1;

import java.util.Scanner;

public class Exo3_bis {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Quel est le prix:");
        Scanner sc = new Scanner(System.in);
        double prix = sc.nextDouble();
        double remise=0;
        if (prix>=350 && prix<600)
            remise=0.03 ;
        if (prix>=600)
            remise =0.05 ;
        System.out.println("vous avez une remise de "+(100*remise)+"%" );
        prix=prix*(1-remise);
        System.out.println("Nouveau prix : "+prix);
    }
}
