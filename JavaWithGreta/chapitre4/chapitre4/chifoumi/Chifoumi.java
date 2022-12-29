package chapitre4.chifoumi;

import java.util.Scanner;

public class Chifoumi {
    private int choixJoueur;
    private int choixMachine;
    private Scanner clavier ;
    public Chifoumi() {
        clavier = new Scanner(System.in);
    }
    public void getChoixmachine() {
        choixMachine = (int)(3*Math.random());
    }
    public void getChoixJoueur() {
        System.out.println("Entrez votre choix:");
        System.out.println("\t0 pour Caillou, 1 pour Papier, 2 pour Ciseaux");
        choixJoueur=clavier.nextInt();
    }
    public void resultatJeu() {
        if (choixMachine==choixJoueur)
            System.out.println("Egalité");
        else {
            if ((choixMachine==0 && choixJoueur==1) ||
                    (choixMachine==2 && choixJoueur==0) ||
                    (choixMachine==1 && choixJoueur==2) )
                System.out.println("Bravo, vous êtes le vainqueur!!!");
            else System.out.println("Tant pis, vous avez perdu!!!");
        }
    }
    public String conversion(int choix) {
        switch(choix) {
            case 0 : return "Caillou";
            case 1 : return  "Ciseaux" ;
            case 2 : return "Papier" ;
            default :
                return null ;
        }
    }
    public void afficheChoix() {
        System.out.println("La machine a choisi "+conversion(choixMachine));
        System.out.println("Vous avez choisi "+conversion(choixJoueur));
    }
}
