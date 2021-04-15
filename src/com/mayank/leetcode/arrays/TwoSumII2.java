package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class TwoSumII2 {
	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}
	
    public static int[] twoSum(int[] numbers, int target) {
    	int [] result = new int[2];
    	int i=0;
    	int j = numbers.length-1;
    	while(j>i) {
    		if(numbers[i]+numbers[j]>target) {
    			j--;
    		}else if(numbers[i]+numbers[j]<target){
    			i++;
    		}else {
    			result[0]=i+1;
    			result[1]=j+1;
    			return result;
    		}
    	}
    	return result;
    }
}
