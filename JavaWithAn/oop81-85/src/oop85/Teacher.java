package oop85;

public class Teacher {
    String name;
    int phone;
    Teacher(){
        System.out.println("No value");
    }
    Teacher(String n, int p){
        name = n;
        phone = p;
    }

    public void displayinformation(){
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
    }
}
