package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class MoveZerosV1 {

	public static void main(String[] args) {

		int arr[] = {0,1,0,3,12,0};
		System.out.println(Arrays.toString(arr));
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void moveZeroes(int[] nums) {

		int length = nums.length;
		int[] newArr = new int[length];
		if(length==0) {
			System.out.println("empty array");
			return;
		}
		int j=0;
		for(int i=0; i<length; i++) {
			if(nums[i]!=0) {
				newArr[j]=nums[i];
				j++;
			}
		}
		//newArr=nums;
		System.out.println(Arrays.toString(newArr));
	}

}
