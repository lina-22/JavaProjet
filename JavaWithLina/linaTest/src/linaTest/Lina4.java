package linaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lina4 {
    public static void main(String[] args) {

        takeAndDisplayNote();
    }

    public static void takeAndDisplayNote() {
        List<Integer>notes = new ArrayList<>();
        int note = 0;
        System.out.println("Saisissez les notes, appuyez Y pour terminatr le saisie");
        System.out.println("...................");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            note = sc.nextInt();
            notes.add(note);
        }

        if(!sc.hasNextInt()){
            notes.forEach(eachNote-> System.out.println(eachNote + "|"));
        }

    }
}
