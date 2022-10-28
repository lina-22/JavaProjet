package chapitre1;

import java.util.Scanner;

public class E116 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nombre ;
        System.out.println("Donnez un nombre:");
        nombre = sc.nextInt();
        for (int x=1; x<=10; x++) {
            int s = nombre+x;
            System.out.println(s);
        }
    }
}
