package AdvancedPattern;

public class Patterns {
    // . hollowRectange
    public static void hollow_rectange(int totalRows, int totalCols) {
        for (int i = 1; i <= totalRows; i++) {
            // outer-loop
            for (int j = 1; j <= totalCols; j++) {
                // inner-loop (i,j)
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    // boundary-cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle(int n) {
        int print = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(print + " ");
                print++;
            }
            print = 1;
            System.out.println();
        }
    }

    public static void floydsTriangle(int n) {
        int print = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(print + " ");
                print++;
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n) {
        int print = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(print + " ");
                print++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_rectange(5,8);
        // floydsTriangle(5);
        // halfPyramid(5);
        // zeroOneTriangle(5);
        numberPyramid(5);
    }
}
