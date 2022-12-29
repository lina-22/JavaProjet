package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(30);
        num.add(20);
        num.add(3,25);

        System.out.print("Array List is"+num);

      for(int temp : num){
            System.out.println("arryList is " +temp);
        }

      num.remove(0);
        int x = num.size();

        System.out.println(x);

       boolean b = num.isEmpty();
        System.out.println(b);

        boolean indx = num.contains(25);
        System.out.println(indx);

    }
}
