package collectionDemo;

public class LambdaExpression1 {
    public static void main(String[] args) {
        Printable obj = (message)-> System.out.println(message);

        obj.print("Lambda exemple with single parameter");
    }
}

interface Printable{
    void print(String message);
}
