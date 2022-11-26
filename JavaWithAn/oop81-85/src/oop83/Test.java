package oop83;

public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        teacher1.setInformation("Lina","33",0753103416 );


        Teacher teacher2 = new Teacher();
        teacher2.setInformation("Kashif", "10", 0753103416);

        teacher1.displayInformation();
        teacher2.displayInformation();
    }

}
