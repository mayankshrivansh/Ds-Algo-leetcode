package com.mayank.leetcode.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumInArray {

	public static void main(String[] args) {
		int arr[] = {5,2,4,1,3,6,0};
		System.out.println(Arrays.toString(arr));
		System.out.println(thirdMax(arr));
	}

	public static int thirdMax(int[] nums) {
		Set<Integer> newSet = new TreeSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			newSet.add(nums[i]);
		}

		if(newSet.size()>=3){
			newSet.remove(Collections.max(newSet));
			newSet.remove(Collections.max(newSet));
		}
		return Collections.max(newSet);
	}
}
