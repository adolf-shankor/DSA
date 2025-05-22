package org.dsa.basics;

import java.io.IOException;

public class SnakePattern {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printSnakePattern(arr);


    }

    private static void printSnakePattern(int[][] arr) {
        int length=arr[0].length;
        int j=0;
        for(int i=0;i<length;i++){
            while(j==0 || j==length-1){

                j++;
            }


        }
    }
}
