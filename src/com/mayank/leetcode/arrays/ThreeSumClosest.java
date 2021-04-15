package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		int target = 1;
		System.out.println(threeSumClosest(nums, target));
	}
	
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0; i<nums.length-2;i++) {
            int j=nums.length-1;
            int k=i+1;
        	while(k<j) {
        	int sum = nums[i]+nums[j]+nums[k];
        	if(sum>target) {
        		j--;
        	}else {
        		k++;
        	}
        	if(Math.abs(sum-target)<Math.abs(result-target)) {
        		result = sum;
        	}
        }
        }
        return result;
    }

}
