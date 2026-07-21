package DP;
import java.util.*;
public class DP_TopDown {
    static int[][] t = new int[102][1002];
    static {
        for (int i = 0; i < 102; i++) {
            for (int j = 0; j < 1002; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }
    }
    public static int knapsack(int[] wt, int[] val, int w, int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(
                            val[i - 1] + t[i - 1][j - wt[i - 1]],
                            t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }
    public static void main(String[] args) {
        int[] wt = {1,3,4,7};
        int[] val = {1,3,5,7};
        int w = 7;
        System.out.println(knapsack(wt,val,w,wt.length));
    }
}