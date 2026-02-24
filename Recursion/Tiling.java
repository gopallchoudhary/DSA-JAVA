package Recursion;

public class Tiling {
    public static int tilingWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertically
        int fn1 = tilingWays(n - 1);

        // horizontally
        int fn2 = tilingWays(n - 2);

        return fn1 + fn2;

    }

    public static void main(String[] args) {
        System.out.println(tilingWays(3));
        System.out.println(tilingWays(4));
        System.out.println(tilingWays(5));
        System.out.println(tilingWays(6));
    }
}