package Arrays2D;

public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3}, 
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };
        int n = matrix.length, m = matrix[0].length;
        int diagnolSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
                if (matrix[i] == matrix[j]) {
                    diagnolSum+=matrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Sum of the diagonal is "+ diagnolSum);
    }
}
