package Arrays2D;

import java.util.Scanner;

public class Matrices {
    
    //? search
    public static boolean search(int matrix[][], int key) {
        int n = matrix.length, m = matrix[0].length;

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(matrix[i][j]  == key) {
                    System.out.println(key+" found at cell ("+i+","+j+").");
                    return true;
                } 
            }
        }
        System.out.println("key not found");
        return false;
    }
    

    //? largest
    public static void largest(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i <  n; i++) {
            for (int j = 0; j < m; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element in the matrix is: "+largest);
    }

    //? smallest
    public static void smallest(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i <  n; i++) {
            for (int j = 0; j < m; j++) {
                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest element in the matrix is: "+smallest);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        System.out.println("Enter "+n*m+" elements");
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 7);
        largest(matrix);
        smallest(matrix);

        sc.close();
    }

}
