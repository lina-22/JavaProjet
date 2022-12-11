package oop102Ref;

public class Test {

    public static void main(String[] args) {
        CallbyRef r1 = new CallbyRef();
        r1.name = "KashifSayed";
        System.out.println("before calling :" +r1.name);

        r1.change(r1);
        System.out.println("after calling : " +r1.name);


    }
}
