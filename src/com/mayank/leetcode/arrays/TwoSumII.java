package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class TwoSumII {

	public static void main(String[] args) {
		int[] numbers = {-1,0};
		int target = -1;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}
	
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i=0; i<numbers.length;i++) {
        	for(int j=i+1; j<numbers.length;j++) {
        		if(numbers[i]+numbers[j]==target) {
        			result[0]=i+1;
        			result[1]=j+1;
        			return result;
        		}
        	}
        }
        return result;
    }

}
