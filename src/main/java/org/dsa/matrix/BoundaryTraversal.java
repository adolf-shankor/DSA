package org.dsa.matrix;

public class BoundaryTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}
        };

        printBoundary(matrix);
    }

    private static void printBoundary(int[][] matrix) {
        for(int row=0;row<=matrix.length-1;row++){
            for(int col=0;col<=matrix[row].length-1;col++){
               if(row==0){
                   System.out.print(matrix[row][col]+" ");
               }

            }
        }
    }
}
