package DSAa2z.Patterns;
import java.util.*;
public class pat04 {
    public static void pat(int n){
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pat(n);
    }
}
