package arrayPracticeAnisVd;

import java.util.Scanner;

public class AnisVd54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter the no: ");
        double [] nb = new double[5];
        double sum = 0;
        for (int i = 0; i <nb.length ; i++) {
            nb[i]=sc.nextDouble();
            System.out.println();
        }

        for (int i = 0; i <nb.length ; i++) {
            sum = sum+nb[i];
        }
        System.out.println("The sum is: " +sum);

        System.out.println("The avg is: " +sum/ nb.length);

        double max = nb[0];
        double min = nb[0];
        for (int i = 1; i < nb.length ; i++) {
            if (max<nb[i]){
                max = nb[i];
            }
            if(min>nb[i]){
                min = nb[i];
            }
        }
        System.out.println("Maxi num est = " +max);

        System.out.println("min no est :"+min);
    }



}
