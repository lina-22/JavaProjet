package chapitre1;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle est la taille:");
        double taille = sc.nextDouble();
        System.out.println("Quelle est le poids:");
        double poids = sc.nextDouble();

        double imc = poids/(taille*taille) ;
        System.out.println("L'imc vaut: "+imc);
        if (imc<16.5)
            System.out.println("Dénutrition");
        if (imc>=16.5 && imc<18.5)
            System.out.println("Maigreur");
        if (imc>=18.5 && imc<25)
            System.out.println("Normal");
        if (imc>=25 && imc<30)
            System.out.println("Surpoids");
        if (imc>=30)
            System.out.println("Obésité");
    }
}
