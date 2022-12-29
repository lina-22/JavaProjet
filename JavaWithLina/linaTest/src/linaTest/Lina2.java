package linaTest;

import java.util.Scanner;

public class Lina2 {
    public static void main(String[] args) {
        System.out.println("Voulez vous continuer? Répondez en tapant oui ou non");
        Scanner sc = new Scanner(System.in);
        while (true){
            String input = sc.nextLine();
            if("oui".equals(input)){
                System.out.println("On continue");
            }else if ("non".equals(input)){
                System.out.println("On arrete");
                break;
            }else {
                System.out.println("Voulez vous continue?");
            }
        }
        System.out.println("Terminé!!!!!");
    }
}
