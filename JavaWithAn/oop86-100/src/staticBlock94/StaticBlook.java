package staticBlock94;

public class StaticBlook {

    static int id;
    static String name;

    static{
        id = 101;
        name = "Linaaa";
    }

    static void display(){
        System.out.println("id " + id);
        System.out.println("Name " + name);
    }

    public static void main(String[] args) {
        StaticBlook.display();
    }
}
