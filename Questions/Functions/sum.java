package Questions.Functions;

import java.util.Scanner;

public class sum {
    public static int sumDigits(int n) {
        int sum = 0;
        while (n>0) {
            int lastDigit = n %10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of the digits: ");
        int n = sc.nextInt();
        System.out.println("Sum of each digit of " + n + " is " + sumDigits(n));

        sc.close();
    }
}
