package inheriting110_125;

public class Teacher extends Person {
    // name, age, displayInformation1

    String qualification;
    void displayInformation2(){
        System.out.println("Name :" + name);
        System.out.println("Age :" +age);
        // displayInformation1();
        System.out.println("Qualification :" +qualification);
    }


}
