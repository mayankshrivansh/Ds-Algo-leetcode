package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		for(int[] a: matrix) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
		rotate(matrix);

	}

    public static void rotate(int[][] matrix) {
        int length = matrix.length;
        for(int i=0; i<length;i++) {
        	for(int j=i; j<length; j++) {
        		int temp = matrix[i][j];
        		matrix[i][j]=matrix[j][i];
        		matrix[j][i]=temp;
        	}
        }
        
		for(int[] a: matrix) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
		
		for(int i=0; i<length;i++) {
			for(int j=0; j<length/2;j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[i][length-1-j];
				matrix[i][length-1-j]=temp;
			}
		}
		for(int[] a: matrix) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
    }
}
