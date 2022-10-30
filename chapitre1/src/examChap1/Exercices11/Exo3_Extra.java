package examChap1.Exercices11;

import java.util.Scanner;

public class Exo3_Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb;
        do {
            System.out.println("Plz Give a no: ");
         nb= sc.nextInt();
            if (nb<0 || nb>3){
                System.out.println("bad number");
            }
        }while(nb<0 || nb>3);

            System.out.println("end of the prg");

    }
}
