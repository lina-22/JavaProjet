package eceptionProblemDemo;

import java.util.Scanner;

public class ExceptionProblrm {
    public static void main(String[] args) {
        int count = 1;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter num1 :");

                int num1 = sc.nextInt();
                System.out.println("Please enter num2 :");

                int num2 = sc.nextInt();
                int result = num1 / num2;
                count = 2;
                System.out.println("Result: " + num1 + "/" + num2 + " = " + result);
            } catch (Exception e) {
                System.out.println("Exception :" + e);
                System.out.println("You must enter integer. Please try again");

            }



        }while (count == 1) ;
    }
}

