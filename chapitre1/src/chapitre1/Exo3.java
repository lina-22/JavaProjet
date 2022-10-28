package chapitre1;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Quel est le prix:");
        Scanner sc = new Scanner(System.in);
        double prix = sc.nextDouble();
        if (prix <350)
            System.out.println("Pas de remise");
        else {
            if (prix >=350 && prix <600) {
                System.out.println("3% de remise");
                prix = prix*(1-0.03) ;
                System.out.println("Nouveau prix remisé: "+prix);
            }
            else {
                System.out.println("5% de remise");
                prix = prix * 0.95 ;
                System.out.println("Nouveau prix remisé: "+prix);
            }
        }
    }
}
