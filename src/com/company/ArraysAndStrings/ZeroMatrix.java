package com.company.ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {
    public static void main(String []args){
        int [][]matrix = {{1, 2, 3},{4, 0, 6}, {7, 8, 9}};
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                if(matrix[row][col] == 0){
                   rows.add(row);
                   cols.add(col);
                }
            }
        }

        // Set Zeros
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                if(rows.contains(row) || cols.contains(col)){
                    matrix[row][col] = 0;
                }
            }
        }
        // Display the Resultant Matrix
        for(int []row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
