package linaTest;

import java.util.Scanner;

public class Lina3 {
    public static void main(String[] args) {
        takeResponse();

    }

    public static void takeResponse() {
        System.out.println("Voulez vous continuer? répondez en tapant oui ou non");

        while (true){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if(input.equals("oui"))System.out.println("On continue");
            if(input.equals("non")){
                System.out.println("On arrete");
                break;
            }
            if(input.equals("oui")||input.equals("non")){
                System.out.println("Voulez vous continuer?");
            }
            System.out.println("Terminé");

        }

    }
}
