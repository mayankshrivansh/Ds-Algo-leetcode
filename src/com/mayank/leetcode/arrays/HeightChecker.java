package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class HeightChecker {	

	public static void main(String[] args) {
		int arr[] = {1,1,4,2,1,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(heightChecker(arr));

	}
    public static int heightChecker(int[] heights) {

    		int output=0;
    		int[] newArr = Arrays.copyOf(heights, heights.length);
    		
    		Arrays.sort(newArr);
    		for(int i=0; i<heights.length; i++) {
    			if(heights[i]!=newArr[i]) {
    				output++;
    			}
    		}
        return output;
    }

}
