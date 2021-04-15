package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers {

	public static void main(String[] args) {
		int arr[] = {0,0,0,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(dominantIndex(arr));
	}

    public static int dominantIndex(int[] nums) {
    	int largestNumber = 0;
    	int result=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]>largestNumber) {
        		largestNumber = nums[i];
        		result =i;
        	}
        }
        for(int i=0;i<nums.length;i++) {
        	if(result!=i && largestNumber<2*nums[i]) {
        		result = -1;
        	}
        }
        
        System.out.println(largestNumber);
		return result;
        
    }
}
