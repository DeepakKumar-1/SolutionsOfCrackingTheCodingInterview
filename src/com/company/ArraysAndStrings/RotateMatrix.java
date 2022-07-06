package com.company.ArraysAndStrings;
import java.util.Arrays;
import java.util.Scanner;
public class RotateMatrix {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        // To Rotate an Image by 90 degree there are Two Steps
        /*
         Step1 : Transpose the Matrix (Ri -> Ci)
         Step2 : Flip the Elements
         */

        // Step1 : Transpose the Matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < row; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

//        for(int []row : matrix){
//            System.out.println(Arrays.toString(row));
//        }

        // Now Flip the Elements of Columns
        int start = 0;
        int end = matrix[0].length - 1;
        while (start <= end) {
            for (int row = 0; row < matrix.length; row++) {
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
            }
            start++;
            end--;
        }

        // Display the Output
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
