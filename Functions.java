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

    //. <==Binomial-Coefficient==> 
    public static int binomial(int n, int r) {
        int nmr = n-r;
        int binomialCoefficient = factorial(n) /(factorial(r) * factorial(nmr));
        return binomialCoefficient;

    };

    //. BinaryToDecimal 
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int decimalNum = 0;
        int pow = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10; 
            decimalNum = decimalNum + (int)(lastDigit * Math.pow(2, pow)); // Math.pow take and returns double data type
            pow++;
            binNum /= 10;
        }
        System.out.println(String.format("Decimal of %d = %d", myNum, decimalNum));
    }
    
    //.DecimalToBinary 
    public static void DecimalToBinary(int decimalNum) {
        int myNum = decimalNum;
        int pow = 0;
        int binaryNum = 0;
        
        while (decimalNum > 0) {
            int rem = decimalNum%2;
            binaryNum = binaryNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decimalNum/=2;
        }

        System.out.println(String.format("The binary of %d = %d", myNum, binaryNum));
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
        // System.out.println("Enter a number to find the factorial");
        // int n = sc.nextInt();
        // int fact = factorial(n);
        // System.out.println("Factorial of a " + n + " is: " + fact);

        /// Binomial-Coefficient
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // System.out.println("Enter a number");
        // int r = sc.nextInt();
        // int binomial = binomial(n, r);
        // System.out.println("Binomial coefficient is "+binomial);
        // System.out.println(binomial(n, r));
        
        //binToDec(101);
        System.out.println("Enter a number to convert into binary");
        int deciNum = sc.nextInt();
        DecimalToBinary(deciNum);
        

                sc.close();
    }
}