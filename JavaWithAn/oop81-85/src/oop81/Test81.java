package oop81;

public class Test81 {

    public static void main(String[] args) {
        Teacher81 teacher1 = new Teacher81();//object declaire

        teacher1.name = "Lina";
        teacher1.gender = "Female";
        teacher1.phone = 0753103416;
        teacher1.displayInformation();



        System.out.println("Name :"+ teacher1.name + " and "+teacher1.gender);
    }
}
