package collectionDemo;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> bookList = new HashSet<String>();

        bookList.add("C");
        bookList.add("C++");
        bookList.add("Java");
        bookList.add("Phythons");

        for(String book : bookList){
            System.out.println(book);
        }

    }
}
