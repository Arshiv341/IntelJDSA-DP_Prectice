package Recursion;
import java.util.*;
public class subSequencePrint {
    public static void PrintF(int idx,int[]arr,ArrayList<Integer> list,int n){
        //base condition
        if (idx == n) {
            for (int x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        }
        //take
        list.add(arr[idx]);
        PrintF(idx+1,arr,list,n);
        //remove
        list.remove(list.size() - 1);
        //not take
        PrintF(idx+1,arr,list,n);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>list = new ArrayList<>();
        PrintF(0,arr,list,n);
    }
}
