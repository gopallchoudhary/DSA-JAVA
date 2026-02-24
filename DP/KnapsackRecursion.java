package DP;

public class KnapsackRecursion {

    public static int knapsack(int val[], int wt[], int W, int n, int memo[]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (memo[n - 1] != 0) {
            return memo[n - 1];
        }

        if (wt[n - 1] <= W) {
            int include = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1, memo);
            int exclude = knapsack(val, wt, W, n - 1, memo);
            memo[n - 1] = Math.max(include, exclude);
        } else {
            return knapsack(val, wt, W, n - 1, memo);
        }
        return memo[n - 1];

        // if (wt[n - 1] <= W) {
        // int include = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);
        // int exclude = knapsack(val, wt, W, n - 1);
        // return Math.max(include, exclude);
        // } else {
        // return knapsack(val, wt, W, n - 1);
        // }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int memo[] = new int[val.length];
        System.out.println(knapsack(val, wt, W, val.length, memo));
    }
}