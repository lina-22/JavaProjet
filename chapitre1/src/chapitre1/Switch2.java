package chapitre1;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("entrez un nombre:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String resultat = switch(n) {
            case 0 -> "n vaut 0" ;
            case 1  -> { System.out.println("lalala");
                yield "n vaut 1";
            }
            case 2  ->" n vaut 2" ;
            default  -> "n différent de 0, 1 et 2";
        };
        System.out.println("Résultat : "+ resultat);
    }
}
