package Recursion;
import java.util.*;
public class facto {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fac(n));
    }
    public static int fac(int n){
        if(n==0) return 1;
        int val = n*fac(n-1);
        return val;
    }
}
