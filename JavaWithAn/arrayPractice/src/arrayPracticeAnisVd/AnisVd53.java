package arrayPracticeAnisVd;

import java.util.Scanner;

public class AnisVd53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[]nb = new double[5];
        double sum =0;

        System.out.println("Plz Ent 5 no: ");
//        nb[0] = sc.nextDouble();
//        nb[1] = sc.nextDouble();
//        nb[2] = sc.nextDouble();
//        nb[3] = sc.nextDouble();
//        nb[4] = sc.nextDouble();
// or for loop

        for (int i = 0; i <5 ; i++) {
            nb[i]= sc.nextDouble();
        }

        for (int i = 0; i <5 ; i++) {
            sum = sum+nb[i];
        }
//        sum = nb[0]+nb[1]+nb[2]+nb[3]+nb[4];
        System.out.println("The sum is : "+sum);
        System.out.println("The sum is : "+sum/nb.length);
    }

}
