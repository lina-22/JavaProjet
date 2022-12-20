package exception;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result :" + result);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Exception" + e1);
        }catch (ArithmeticException e2){
            System.out.println("Exception" + e2);
        }
        finally {
            System.out.println("Last line of the program");
        }
    }
}
