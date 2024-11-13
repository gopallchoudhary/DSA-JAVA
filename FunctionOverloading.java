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

    public static void main(String[] args) {
        // # Parameter
        // System.out.println(sum(9, 23));
        // System.out.println(sum(4, 2, 6));

        // # Data Type
        System.out.println(multiply(8, 4));
        System.out.println(multiply(1.2f, 5.6f));
    }
}