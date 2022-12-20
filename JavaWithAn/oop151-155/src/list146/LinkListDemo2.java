package list146;

import java.util.LinkedList;

public class LinkListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<String>();
        countryNames.add("Afghanistan");
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        countryNames.add(5, "Brazil");
        countryNames.addFirst("Australia");
        countryNames.addLast("Japan");
        countryNames.remove("Nepal");

        for(String country : countryNames){
            System.out.println(country);
        }
        System.out.println("Size of the linked List : "+countryNames.size());
    }
}
