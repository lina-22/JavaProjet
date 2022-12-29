package lambdaExpression;

public class LambdaExpression2 {
    public static void main(String[] args) {

        Addable obj1 = (a,b)->{
                       return (a+b);};
        System.out.println("The sum is = " +obj1.add(50, 20));

        Substract obj2 =(x,y)->{
                       return (x-y);};
        System.out.println("The sub is " +obj2.sub(45, 23));
    }
}

interface  Addable{
    int add(int a, int b);
}

interface Substract{
    int sub(int x, int y);
}
