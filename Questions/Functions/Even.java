package Questions.Functions;

import java.util.Scanner;

public class Even {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check EVEN");
        int num = sc.nextInt();
        
        if(isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        sc.close();
    }

    public static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
