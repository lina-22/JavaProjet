package varArgs103;

public class Test {
    public static void main(String[] args) {
        AddDemo ob = new AddDemo();

        ob.add(10,20);
        ob.add(10,20,30);
        ob.add(50,50,80,90,70);
    }
}
