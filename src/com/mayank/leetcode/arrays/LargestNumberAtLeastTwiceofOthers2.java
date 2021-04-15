package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers2 {

	public static void main(String[] args) {
		int arr[] = {0,0,0,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(dominantIndex(arr));
	}

    public static int dominantIndex(int[] nums) {
    	int max = 0;
    	int secondMax = 0;
    	int index =0;
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]>max) {
    			int temp = max;
    			max=nums[i];
    			secondMax=temp;
    			index = i;
    		}
    	}
    	if(max>=secondMax*2) {
    		return index;
    	}else {
    		return -1;
    	}        
    }
}
