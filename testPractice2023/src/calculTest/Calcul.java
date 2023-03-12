package calculTest;

import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");


        double amount = sc.nextDouble();
        int[] notes = {50, 20, 10, 5, 2, 1};
        double[] coins = {0.5, 0.2, 0.1};
        System.out.println("Banknotes:");

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int numNotes = (int) (amount / notes[i]);
                amount -= numNotes * notes[i];
                System.out.println(notes[i] + " x " + numNotes);
            }
        }
        System.out.println("Coins:");

        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                int numCoins = (int) (amount / coins[i]);
                amount -= numCoins * coins[i];
                System.out.println(coins[i] + " x " + numCoins);
            }
        }
        sc.close();
    }
}
