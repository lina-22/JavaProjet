package hashMapDemo;

import java.util.HashSet;

public class HasSetDemo {

    public static void main(String[] args) {
        HashSet<String> fruitsName = new HashSet<String>();

        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Banana");
        fruitsName.add("Strwberry");

        System.out.println(fruitsName);
        System.out.println(fruitsName.size());
    }
}
