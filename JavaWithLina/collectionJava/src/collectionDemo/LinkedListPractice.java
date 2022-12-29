package collectionDemo;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();
        studentList.add("Lina");
        studentList.add("Kashif");
        studentList.add("kaisan");
        studentList.add(3, "Kiki");

        System.out.println(studentList);
    }
}
