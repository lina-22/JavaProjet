package chapitre3;

import java.util.Arrays;
import java.util.Scanner; // classe utilisée pour réaliser les saisies

public class TableauE {
    /*
     * Déclaration d'une variable objet de type Scanner et création avec l'opérateur
     * new, l'objet sc est accessible à toutes les méthodes (fonctions) de la classe
     * TableauE sc est un attribut de la classe TableauE.
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] tabm = new double[5];
        int choixm; // permet de stocker le choix de l'utilisateur
        System.out.println("Ce programme permet la manipulation d'un tableau de réels.\n");
        do { // Appel de la fonction Menu()
            choixm = menu();
            switch(choixm) {
                case (1) :
                    saisirTab(tabm);
                    break ;
                case (2) :
                    affichageTab(tabm);
                    break ;
                case (3) :
                    System.out.println("Entrer la valeur à ajouter:");
                    double v= sc.nextDouble() ;
                    ajouteValeur(v,tabm);
                case (4) :
                    double min = rechercherMin(tabm) ;
                    System.out.println("Valeur minimale: "+min);
                    break ;
                case (5) :
                    double max= rechercherMax(tabm) ;
                    System.out.println("Valeur maximale: "+max);
                    break ;
                case (6) :
                    double moy= calculMoy(tabm);
                    System.out.println("Valeur moyenne: "+moy);
                    break;
                case (7) :
                    trierTableau(tabm);
                    break ;
                case (8) :
                    double vmin;
                    double vmax;
                    do {
                        System.out.println("Valeur minimale: ");
                        vmin = sc.nextDouble();
                        System.out.println("Valeur maximale: ");
                        vmax = sc.nextDouble();
                    } while (vmin>=vmax);
                    remplirTabAlea(vmin, vmax, tabm);
                case (9) :
                    System.out.println("Combien d'éléments: ");
                    int n = sc.nextInt();
                    tabm = creerNouveauTab(n,tabm) ;
                    break ;
                default :
            }
        } while (choixm != 0);
        System.out.println("Fin du programme\n\n");
    }
    public static double[] creerNouveauTab(int taille, double []t) {
        t = new double [taille] ;
        return t ;
    }
    public static void remplirTabAlea(double min, double max,  double []t) {
        for (int i=0; i<t.length; i++)
            t[i] = min + (max-min)*Math.random();
    }
    public static void trierTableau(double []t) {
        Arrays.sort(t);
    }
    public static double calculMoy(double []t) {
        double moy, somme = 0;
        for (int i=0; i<t.length; i++)
            somme += t[i] ;
        moy = somme/t.length;
        return moy ;
    }
    public static double rechercherMax(double []t) {
        double max = t[0] ;
        for (int i=1; i<t.length; i++) {
            if (t[i]>max)
                max = t[i];
        }
        return max ;
    }
    public static double rechercherMin(double []t) {
        double min = t[0] ;
        for (int i=1 ; i<t.length; i++) {
            if (t[i] < min)
                min = t[i] ;
        }
        return min;
    }
    public static void ajouteValeur(double val, double []t) {
        for (int i=0; i<t.length; i++)
            t[i] +=val ;
    }
    public static int menu() {
        int ch;
        System.out.print("************ Menu *******************\n");
        System.out.print("\tPour saisir les éléments du tableau, tapez \t\t\t1\n");
        System.out.print("\tPour afficher les éléments du tableau, tapez \t\t\t2\n");
        System.out.print("\tPour ajouter une valeur à tous les éléments du tableau, tapez \t3\n");
        System.out.print("\tPour rechercher la valeur minimale du tableau, tapez \t\t4\n");
        System.out.print("\tPour rechercher la valeur maximale du tableau, tapez \t\t5\n");
        System.out.print("\tPour calculer la valeur moyenne du tableau, tapez \t\t6\n");
        System.out.print("\tPour trier le tableau, tapez \t\t\t\t\t7\n");
        System.out.print("\tPour remplir aléatoirement le tableau, tapez \t\t\t8\n");
        System.out.print("\tPour créer un nouveau tableau, tapez \t\t\t\t9\n");
        System.out.print("\tPour sortir, tapez \t\t\t\t\t\t0\n\n");
        System.out.print("--> Entrez votre choix : ");
        ch = sc.nextInt();
        System.out.print("\n");
        return ch;
    }

    public static void affichageTab(double []t) {
        for (double x : t)
            System.out.print(x+" ");
        System.out.println();
    }
    public static void saisirTab(double[] t) {
        int i;
        for (i = 0; i < t.length; i++) {
            System.out.print("-->Saisir l'élément numéro " + (i + 1) + " : ");
            t[i] = sc.nextDouble();
        }
    }
}

