package org.dsa.matrix;

public class SnakePattern {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}
        };

        printSnakePattern(matrix);
    }

    private static void printSnakePattern(int[][] matrix) {
        System.out.println("Row"+matrix.length);
        System.out.println("Column"+matrix[1].length);
        for(int i=0;i<=matrix.length-1;i++){
            if((i%2==0)){
                for(int j=0;j<=matrix[i].length-1;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for(int j=matrix[i].length-1;j>=0;j--){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
    }


}
