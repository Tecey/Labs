package com.FirstStart;

public class mainMatrix {
    public static void main(String ags[]){
        int [][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++)
                System.out.println(matrix[i][j] + " ");
        }
    }

}
