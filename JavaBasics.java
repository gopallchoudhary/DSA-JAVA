import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        /*
         * Scanner sc = new Scanner(System.in);
         * String name = sc.next();
         * System.out.println(name);
         * 
         * String name = sc.nextLine();
         * System.out.println(name);
         * 
         * int num = sc.nextInt();
         * System.out.println(num);
         * 
         * boolean sach = sc.nextBoolean();
         * System.out.println(sach);
         * 
         * double num = sc.nextDouble();
         * System.out.println(num);
         */

        // !sum of two no.s from user input

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // int product = a * b;
        // System.out.println(product);

        // ! Area of circle
        // float pie = 3.14f;
        // System.out.println("Enter the radius of a circle");
        // float r = sc.nextFloat();
        // float area = pie * r * r;
        // System.out.println("The area of the cirlce is " + area);

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter three numbers");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // double avg = (a+b+c)/3;
        // System.out.println("Average is " + avg);

        /// Assignment operators
        /*
         * int A = 2;
         * int B = 5;
         * A += 54; // A = A + 54;
         * B -= 2; // B = B - 2;
         * A *= 2; // A = A * 2;
         * B /= 2; // B = B / 2;
         * System.out.println(B/A);
         */

        /// Conditional Statements

        // ! Age check
        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();
        // if (age >= 18) {
        // System.out.println("Adult: You can drive and vote");
        // }
        // if (age >= 13 && age <= 18) {
        // System.out.println("Teenager: You can drive but not vote");
        // } else {
        // System.out.println("Not Adult: You can't drive and vote");
        // }

        // ! Largest of two numbers
        // System.out.println("Enter two numbers");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a > b) {
        // System.out.println("A is greater than B");
        // } else {
        // System.out.println("B is greater than A");
        // }

        // ! Odd or Even
        // System.out.println("Enter a number");
        // int num = sc.nextInt();

        // if (num % 2 == 0) {
        // System.out.println(num + " is an EVEN number");
        // } else {
        // System.out.println(num + " is an ODD number");
        // }

        // !<==Else-if==>
        // int age = 5;
        // if (age >= 18) {
        // System.out.println("Adult");
        // }

        // else if (age >= 13 && age <= 18) {
        // System.out.println("Teenager");
        // } else {
        // System.out.println("Child");
        // }

        /// <==INCOME-TAX==>

        // System.out.println("Enter your income: ");
        // int income = sc.nextInt();

        // if (income < 500000) {
        // System.out.println("0% Tax " + income);
        // } else if (income >= 500000 && income <= 1000000) {
        // double totalAmount = income + (income / 100) * 20;
        // System.out.println("20% Tax " + totalAmount);
        // } else {
        // double totalAmount = income + (income / 100) * 30;
        // System.out.println("30% Tax " + totalAmount);
        // }

        /// <==largest of three numbers==>
        // System.out.println("Enter the first number");
        // int a = sc.nextInt();

        // System.out.println("Enter the second number");
        // int b = sc.nextInt();

        // System.out.println("Enter the third number");
        // int c = sc.nextInt();

        // if((a>b) && (a>c)) {
        // System.out.println("a is the largest number");
        // }
        // else if(b>c) {
        // System.out.println("b is the largest");
        // } else {
        // System.out.println("c is the largest");
        // }

        // ! Ternary Operator
        // System.out.println("Enter a number");
        // int number = sc.nextInt();
        // String numType = (number % 2 == 0) ? "EVEN" : "ODD";
        // System.out.println(numType);

        // System.out.println("Enter the marks");
        // int marks = sc.nextInt();
        // String result = (marks>=33) ? "PASS" : "FAIL";
        // System.out.println(result);

        /// <==SWITCH==>

        // char ch = 'C';
        // switch (ch) {
        //     case 'c':
        //         System.out.println("Chicken chilly");
        //         break;
        //     case 'C':
        //         System.out.println("Chicken Roast");
        //         break;
        //     case 'm':
        //         System.out.println("Mutton Curry");
        //         break;

        //     default:
        //         System.out.println("Dreaming");
        // }

        

        sc.close();
    }
}