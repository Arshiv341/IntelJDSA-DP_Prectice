package Recursion;
import java.util.*;
public class fibo {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fib(n));

    }
    public static int fib(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        int val =fib(n-1)+fib(n-2);
        return val;
    }
}
