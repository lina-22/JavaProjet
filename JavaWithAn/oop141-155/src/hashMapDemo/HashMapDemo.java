package hashMapDemo;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> customer = new HashMap<Integer, String>();

        customer.put(101, "Kashif");
        customer.put(102, "Kaisan");
        customer.put(103, "Kasfia");

        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
        System.out.println(customer.get(101));
    }
}
