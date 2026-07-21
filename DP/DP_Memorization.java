package DP;
import java.util.*;
public class DP_Memorization {
    static int[][] t = new int[102][1002];
    static {
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
    }
    public static int knapsack(int[] wt, int[] val, int W, int n) {
        if (n == 0 || W == 0)
            return 0;
        if (t[n][W] != -1)
            return t[n][W];
        if (wt[n - 1] <= W) {
            t[n][W] = Math.max(
                    val[n - 1] + knapsack(wt, val, W - wt[n - 1], n - 1),
                    knapsack(wt, val, W, n - 1));
        } else {
            t[n][W] = knapsack(wt, val, W, n - 1);
        }
        return t[n][W];
    }
    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int W = 7;
        System.out.println(knapsack(wt, val, W, wt.length));
    }
}