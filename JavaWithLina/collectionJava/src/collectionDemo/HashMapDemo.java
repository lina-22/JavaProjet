package collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(101, "Lina");
        hm.put(102, "Kashif");
        hm.put(103, "Kaisan");

        System.out.println(hm.get(102));

        for (Map.Entry m: hm.entrySet()){
            System.out.println(m);
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
