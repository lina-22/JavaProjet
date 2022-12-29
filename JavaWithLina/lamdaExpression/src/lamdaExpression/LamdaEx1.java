package lamdaExpression;

public class LamdaEx1 {
    public static void main(String[] args) {
       Printable obj = (message) ->System.out.println(message);
       obj.print("Lambda Exemple with single parameter");

    }

    interface Printable{
        void print(String message);
    }
}
