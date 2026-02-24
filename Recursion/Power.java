package Recursion;

public class Power {
    public static int power(int x, int n) {

        // if(n==0) {
        // return 1;
        // }
        // return x * power(x, n-1);

        // optimized
        if (n <= 0) {
            return 1;
        }
        int halfPower = power(x, n / 2);
        if (n % 2 == 0) {
            // return power(x, n/2) * power(x, n/2); calls the function twice
            return halfPower * halfPower;
        } else {
            // return x * power(x, n/2) * power(x, n/2); calls the function twice
            return x * power(x, n / 2) * power(x, n / 2);
        } 
        // it reduces the TC & SP both
    }

    public static void main(String[] args) {
        System.out.println(power(2, 9));
    }
}