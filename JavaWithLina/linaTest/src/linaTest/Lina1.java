package linaTest;

import java.util.Scanner;

public class Lina1 {

        public static void main(String[] args) {
            System.out.println("Please enter a number between 0 and 20: ");
            Scanner sc = new Scanner(System.in);
            int nb = sc.nextInt();

            if(nb>=0 || nb<=20 ){
                System.out.println("Note correct");
            }else if(nb<10){
                System.out.println("Refusé");
            } else if (nb>=10 || nb<14) {
                System.out.println("Admis");
            } else if (nb>=14) {
                System.out.println("Félicitation du jury");
            }
        }
    }

