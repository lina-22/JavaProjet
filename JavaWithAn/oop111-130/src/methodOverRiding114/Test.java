package methodOverRiding114;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        t1.name = "Kashif";
        t1.age = 10;
        t1.qualification = "CM2";

        t1.displayInformation();


        System.out.println(" ***********************" +
                "");
        Person p1 = new Person();

        p1.name = "Kaisan";
        p1.age = 4;


        p1.displayInformation();
    }
}
