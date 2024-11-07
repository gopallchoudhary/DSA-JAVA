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
        //swap
        int temp = a; 
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter first number:");
        //int a = sc.nextInt();
       // System.out.println("Enter second number:");
        //int b = sc.nextInt();
        //int sum = calculateSum(a, b); //! a & b are arguments or actual parameters
        //System.out.println("Sum is:  "+sum);

        /// SWAP-NUMBERS  
        int a = 5;
        int b = 10;
        swap(a, b);

        sc.close();
    }
}