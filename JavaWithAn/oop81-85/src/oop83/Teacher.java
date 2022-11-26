package oop83;

public class Teacher {

    String name, age;
    int phone;
    void setInformation(String n,String a,int ph){
        name = n;
        age = a;
        phone = ph;
    }

    void displayInformation(){
        System.out.println("Name  : "+name);
    }
}
