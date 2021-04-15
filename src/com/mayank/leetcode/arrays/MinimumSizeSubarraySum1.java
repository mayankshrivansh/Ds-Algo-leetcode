package com.mayank.leetcode.arrays;

public class MinimumSizeSubarraySum1 {

	public static void main(String[] args) {
		int target = 7;
		int [] nums = {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(target,nums));
	}
	
    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum=0;
        for(int i=0; i<nums.length; i++) {
        	for(int j=i;j<nums.length; j++) {
        		sum+=nums[j];
        		if(sum>=target) {
        			result= Math.min(result, j-i+1);
        		}
        	}
        	sum=0;
        }
        return result!=Integer.MAX_VALUE?result:0;
    }

}
