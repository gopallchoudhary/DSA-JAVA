import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {
        System.out.println("Enter the side of the square");
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("Area of the square is " + area);
        sc.close();
        
    }
}