package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums, k);
	}
	
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
    	k=k%length;
        if(k<0) {
        	k=k+length;
        }
        reverse(nums, length-k, length-1);
        reverse(nums, 0, length-k-1);
        reverse(nums, 0, length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int nums[], int start, int end) {
    	while(end>start) {
    		int temp = nums[end];
    		nums[end]=nums[start];
    		nums[start]=temp;
    		start++;
    		end--;
    	}
    }

}
