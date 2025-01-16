package Questions.Functions;

import java.util.Scanner;

public class average {
    public static double averagee(double a, double b, double c) {
        double avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();

        System.out.println("Enter second number");
        double b = sc.nextDouble();

        System.out.println("Enter third number");
        double c = sc.nextDouble();

        System.out.println("The average value is "+averagee(a, b, c));
        //System.out.println(String.format("Average of three no.s is %d", average));


        sc.close();
    }
}
