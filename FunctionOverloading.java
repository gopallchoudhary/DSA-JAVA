public class FunctionOverloading {
    // .<==Using Parameters==>
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // .<==Using Data Types==>

    // function to calculae int multiply
    public static int multiply(int a, int b) {
        return a * b;
    }

    // function to calculate float multiply
    public static float multiply(float a, float b) {
        return a * b;
    }

    // .<==Prime-Number==> 
    public static boolean isPrime(int n) {
        // corner-cases 1 & 2
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    //. <==PrimeInRange==> 
    public static void primeInRange(int n) {
        for(int i = 1; i<=n; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }

    }


    public static void main(String[] args) {
        // # Parameter
        // System.out.println(sum(9, 23));
        // System.out.println(sum(4, 2, 6));

        // # Data Type
        // System.out.println(multiply(8, 4));
        // System.out.println(multiply(1.2f, 5.6f));

        primeInRange(100);
    }
}