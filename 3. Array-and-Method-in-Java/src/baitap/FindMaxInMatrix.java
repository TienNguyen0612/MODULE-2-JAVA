package baitap;

import java.util.Arrays;

public class FindMaxInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {3,6,9,11,13},
                {5,6,8,10,15},
                {96,54,32,4,0},
                {12,35,63,84,99},
                {33,66,88,100,5}
        };
        System.out.println("matrix = " + Arrays.deepToString(matrix));
        System.out.println("Max in Matrix = " + findMaxMatrix(matrix));
    }
    public static int findMaxMatrix(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
}
