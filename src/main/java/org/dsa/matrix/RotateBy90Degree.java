package org.dsa.matrix;

public class RotateBy90Degree {
    // Function to rotate matrix anticlockwise by 90 degrees.
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateby90(matrix);

        // Print the rotated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void rotateby90(int mat[][]) {
        transpose(mat);
        int len=mat.length;
        for(int col=0;col<len;col++){
            for(int row=0;row<len/2;row++){
                int temp=mat[row][col];
                mat[row][col]=mat[len-1-row][col];
                mat[len-1-row][col]=temp;
            }
        }

    }
    public static void transpose(int mat[][]){
        int len=mat.length;
        for(int row=0;row<len;row++){
            for(int col=row;col<len;col++){
                int temp=mat[row][col];
                mat[row][col]=mat[col][row];
                mat[col][row]=temp;
            }
        }
    }
}
