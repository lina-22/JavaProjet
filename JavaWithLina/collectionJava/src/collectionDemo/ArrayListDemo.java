package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(30);
        num.add(20);
        num.add(3,25);

        System.out.print("Array List is"+num);

       /* for(int temp : num){
            System.out.println("arryList is " +temp);
        }*/

        Iterator itr = num.iterator();
        int x = num.size();

        while(itr.hasNext()){
            System.out.println("Arrylist is that " + itr.next() + "and size "+ x);
        }
    }
}
