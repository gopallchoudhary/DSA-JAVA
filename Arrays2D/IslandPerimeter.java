package Arrays2D;

public class IslandPerimeter {
    public static int perimeter(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int p = 0;

        for (int i = 0; i < row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j] == 1) {
                    if(i==0 || matrix[i-1][j] == 0) p++;
                    if(i==row-1 || matrix[i+1][j] ==0) p++;
                    if(j==0 || matrix[i][j-1] == 0) p++;
                    if(j==col-1 || matrix[i][j+1] == 0) p++;
                }
            }
        }

            return p;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 0, 1, 0, 0 },
                { 1, 1, 1, 0 },
                { 0, 1, 0, 0 },
                { 1, 1, 0, 0 }
        };

        System.out.println(perimeter(matrix));
    }
}