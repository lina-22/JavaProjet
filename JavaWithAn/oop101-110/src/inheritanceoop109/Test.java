package inheritanceoop109;


public class Test {

    public static void main(String[] args) {
        Teacher2 t2 = new Teacher2();
        t2.name = "Kashif";
        t2.age = 10;
        t2.country = "france";

        t2.display();


        Teacher2 t3 = new Teacher2();
        t3.name = "Kaisan";
        t3.age = 4;
        t3.country = "france";

        t3.display();
    }
}
