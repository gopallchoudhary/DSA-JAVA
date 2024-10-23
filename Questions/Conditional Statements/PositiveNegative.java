/*Write a Java program to get a number from the user and print whether it is
positive or negative. */

import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        String numType = (number > 0) ? "POSITIVE" : "NEGATIVE";
        System.out.println(numType);
    }
}
