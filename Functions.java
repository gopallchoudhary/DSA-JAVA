import java.util.*;

public class Functions {
    //.<==Function without params==> 
    public static void printHW() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    //.<==Function with params==> 
    public static int calculateSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int sum = calculateSum(a, b); //! sum function
        System.out.println("Sum is:  "+sum);

        sc.close();
    }
}