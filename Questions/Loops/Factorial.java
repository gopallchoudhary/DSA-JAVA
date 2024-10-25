package Questions.Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = 2; i<=num; i++) {
            factorial *=i;
        }

        System.out.println("FACTORIAL: "+factorial);



        sc.close();
    }
}
