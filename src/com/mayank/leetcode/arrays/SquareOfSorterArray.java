package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class SquareOfSorterArray {

	public static void main(String[] args) {
		int nums[] = {1,4,-5,0,2};

		System.out.println(Arrays.toString(SquareOfSorterArray.sortedSquares(nums)));
	}

	public static int[] sortedSquares(int[] nums) {
		int result[]=new int[nums.length];
		
		for (int i=0; i<nums.length;i++) {
			result[i]=nums[i]*nums[i];
		}
		
		Arrays.sort(result);
		
		//reverse order array
		System.out.println("Reverse order");
		int reverse[] = new int[result.length];
		int j=result.length;
		
		for (int i=0; i<result.length; i++) {
			reverse[j-1]=result[i];
			j=j-1;
		}
		System.out.println(Arrays.toString(reverse));
		return result;
		
//		List<Integer> result = new ArrayList<Integer>();
//
//		for (int i=0; i<nums.length; i++) {
//			result.add(nums[i]*nums[i]);
//		}
//		Collections.sort(result);
//		int[] primitive = result.stream()
//								.mapToInt(Integer::intValue)
//								.toArray();
//		System.out.println(result);
//		return primitive;

	}
}
