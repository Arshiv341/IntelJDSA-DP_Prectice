package Recursion;
import java.util.*;
public class rec01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
    public static int sum(int n ){
        if(n==0) return 0;
        int val = n+sum(n-1);
        return val;

    }
}
