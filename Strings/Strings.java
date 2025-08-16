package Strings;

import java.util.Scanner;

public class Strings {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    // . Palindrome
    // public static void palindrome(String str) {
    // int first = 0;
    // int last = str.length() - 1;
    // boolean isPalidrome = false;

    // while (first < last) {
    // if (str.charAt(first) != str.charAt(last)) {
    // isPalidrome = false;
    // break;
    // } else {
    // isPalidrome = true;
    // }
    // first++;
    // last--;
    // }

    // if (isPalidrome) {
    // System.out.println("it is palindrome");
    // } else {
    // System.out.println("it is not palindrome");
    // }
    // }

    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String str = "abcd";
        // String str2 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // .concetanation 
        // String firstName = "Gopal";
        // String lastName = "Choudhary";
        // String fullName = firstName + " " + lastName;

        // printLetters("Gopal Choudhary");

        // . palindrome 
        // System.out.println(palindrome("noon"));


        String str1 = new String("Tony");
        String str2 = new String("Tony");
        if(str1.equals(str2)) {  //equals only checks the string  value not the reference address
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        sc.close();
    }
}