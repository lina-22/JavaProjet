package super118;

public class B extends Asuper{

    int x = 15;

    B(){
        super();
        System.out.println("B's constructor");
    }
    @Override
    void display(){
        System.out.println("Inside B class");
        System.out.println(x);
        System.out.println(super.x);
        super.display();
    }

}
