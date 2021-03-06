package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class MaximumConsecutiveZeroII {

	public static void main(String[] args) {
		int arr[] = {1,1,0,0,1,1,0,1,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(findMaxConsecutiveOnes(arr));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {

		int ans=0;
		int j =-1;
		int count=0;
		int i;
		for(i=0; i<nums.length;i++) {
			if(nums[i]==0) {
				count++;
			}

			while(count>1) {
				j++;
				if(nums[j]==0) {
					count--;
				}
			}

			int len = i-j;
			if(len>ans) {
				ans=len;
			}
		}
		return ans;

	}

}
