package examChap1.exercise7;
//Ecrire un programme qui échange la valeur de deux variables.
//        Exemple, si a=1 et b=5, le programme donnera a=5 et b=2.


//        Write a program that swaps the value of two variables.
//        Example, if a=1 and b=5, the program will give a=5 and b=2.
public class Q14 {
    public static void main(String[] args) {
        // int, double, float
//        int a, b;
//        a = 15;
//        b = 27;
//        System.out.println("Before swapping : a, b = "+a+", "+ + b);
//        a = a + b;
//        b = a - b;


//        a = a - b;
//        System.out.println("After swapping : a, b = "+a+", "+ + b);

//        second way************
        int a=50, b=100, c;
        System.out.println("First show: a ="+ a +"and b = "+b);
         c = a;
         a = b;
         b = c;
        System.out.println("new velue of a and b: " +a+" and"+b );
    }
}

