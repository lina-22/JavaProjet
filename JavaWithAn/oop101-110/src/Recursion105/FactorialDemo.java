package Recursion105;

public class FactorialDemo {
    int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
