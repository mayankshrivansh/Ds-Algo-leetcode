package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class PivotIndex {

	public static void main(String[] args) {
		int arr[] = {1,7,3,6,5,6};
		System.out.println(Arrays.toString(arr));
		System.out.println(pivotIndex(arr));
	}

	
    public static int pivotIndex(int[] nums) {
        
        int total_sum=0;
        int left_sum = 0;
        for(int i=0;i<nums.length; i++){
            total_sum += nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            if(i!=0)left_sum+=nums[i-1];
            if(total_sum-left_sum-nums[i]==left_sum){
                return i;
            }
        }
        return -1;
        
    }
}
