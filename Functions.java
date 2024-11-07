import java.util.*;

public class Functions {
    // .<==Function without params==>
    public static void printHW() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    // .<==Function with params==>
    public static int calculateSum(int n1, int n2) { // ! n1 & n2 are parameters or formal parameters
        int sum = n1 + n2;
        return sum;

    }

    // .<==Swap Numbers
    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // .<==Product==>
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    // .<==Factorial==>
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number:");
        // int a = sc.nextInt();
        // System.out.println("Enter second number:");
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b); //! a & b are arguments or actual parameters
        // System.out.println("Sum is: "+sum);

        /// SWAP-NUMBERS
        // int a = 5;
        // int b = 10;
        // swap(a, b);

        /// Product of Numbers
        // int a = 5;
        // int b = 10;
        // int prod = multiply(a, b);
        // System.out.println("Product of a and b is " + prod);
        // prod = multiply(5, 20);
        // System.out.println("Product of a and b is " + prod);

        /// Factorial
        System.out.println("Enter a number to find the factorial");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial of a " + n + " is: " + fact);

        sc.close();
    }
}