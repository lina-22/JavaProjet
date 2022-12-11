package oop102;

public class Test {
    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int x =10;//primitive data type
        System.out.println("x before call : "+x);

        ob.change(x);
        System.out.println("x aftyer call :" +x);
    }
}
