package Questions.Functions;

import java.util.Scanner;

public class palindrome {
    public static int palindromeNum(int n) {
        int reverse = 0;
        
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n/=10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Palindrome: ");
        int n = sc.nextInt();
        int reverse = palindromeNum(n);
        if(reverse == n) {
            System.out.println(n+" is a palindrome number");
        } else {
            System.out.println(n+" is not a Palindrome number");
        }



        sc.close();
    }
}
