package org.dsa.matrix;

import java.util.ArrayList;

public class SpiralTraversal {
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        int top=0;
        int left=0;
        int right=mat[0].length-1;
        int bottom=mat.length-1;
        ArrayList<Integer> res=new ArrayList<Integer>();
        //left to right
        while(top<=bottom && left<=right ){
            for(int i=left;i<=right;i++){
                res.add(mat[top][i]);
                //row is constant and it is top , column is change which is i value
            }
            top++;
            //Increment top so as to move downside

            //move from top to bottom
            for(int i=top;i<=bottom;i++){
                res.add(mat[i][right]);
                //column is constant and it is right value , row is changing.
            }
            right--;

            //move from right to left
            if(top<=bottom)
                for(int i=right;i>=left;i--){
                    res.add(mat[bottom][i]);
                }
            bottom--;

            //move from bottom to top
            if(left<=right)
                for(int i=bottom;i>=top;i--){
                    res.add(mat[i][left]);
                }
            left++;}
        return res;
    }

    public static void main(String[] args) {
        SpiralTraversal st = new SpiralTraversal();
        int[][] matrix = {

                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ArrayList<Integer> result = st.spirallyTraverse(matrix);
        System.out.println(result);
    }
}
