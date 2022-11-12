package arrayPracticeAnisVd;

import java.util.ArrayList;

public class Vd63 {
    public static void main(String[] args) {
        ArrayList<Integer> nb = new ArrayList<>();
        nb.add(10);
        nb.add(30);
        nb.add(2,40);

//        System.out.println(nb);

        for (int x:nb
             ) {
            System.out.print("  "+x);

        }
        System.out.println();
        System.out.println(nb.size());
    }
}
