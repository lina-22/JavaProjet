package examChap1.exercise7;
//create a program that asks for the price including VAT of an object and displays the price excluding VAT as well as the VAT (20% in France.)
//
//        Modify this program by adding the request for the number of objects then calculating and displaying the final price including tax, total excluding tax and total VAT.
//réaliser un programme qui demande le prix TTC d'un object et qui en affiche le prix HT ainsi que la TVA(20% en France.)

import java.util.Scanner;

//        Modifier ce programme en ajoutant la demande du nombre d'object puis en calculant et affichant le prix final TTC, total HT et la TVA totale.
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbrObj;
        double prixTTC;
        double prixHT;
        double tvaObj;
        final double TVASt = .2;

//      ask for user input -
        System.out.println("Inserez le prix TTC de l'objet svp :");
        prixTTC = sc.nextDouble();

//      HT price with 20% TVA in france -
        tvaObj = prixTTC * TVASt;
        prixHT = prixTTC - tvaObj;
        System.out.println("le prix HT de l'objet est : " + prixHT + "\n" + "le TVA de l'objet est : " + tvaObj);

        System.out.println("Inserez le nombre d'objet svp : ");
        nbrObj = sc.nextInt();
        double prixTTCTotale = nbrObj * prixTTC;
        double HTTotale = nbrObj * prixHT;
        double TVATotale = nbrObj * tvaObj;
        sc.close();
        System.out.println("le prix TTC totale est : " + prixTTCTotale + "\n" +
        "le HTT totale est : " + HTTotale + "\n" +
        "le TVA totale est : " + TVATotale);
    }
}
