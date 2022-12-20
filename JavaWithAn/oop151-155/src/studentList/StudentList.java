package studentList;

import java.util.LinkedList;

public class StudentList {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<Student>();

        //creattion of student

        Student s1 = new Student(101, "Karim", "Eleven");
        Student s2 = new Student(102, "Rahim", "Elevnen");

        //adding student

        list.add(s1);
        list.add(s2);

        for (Student s: list
             ) {
            System.out.println(" Student details display" + s.id + " " + s.name + " " + s.className);
        }





    }
}
