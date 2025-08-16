package Recursion;

public class Decreasing {
    public static void decreasing(int n) {
        System.out.print(n+" ");
        if(n>1) {
            decreasing(n-1);
        }
    }

    public static void main(String[] args) {
        decreasing(50);
    }
}