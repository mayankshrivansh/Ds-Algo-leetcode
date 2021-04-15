package com.mayank.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,2,3,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(findDisappearedNumbers(arr).toString());
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result =new ArrayList<Integer>();

		Set<Integer> temp = new HashSet<>();
		for(int num: nums) {
			temp.add(num);
		}

		for(int i=1;i<nums.length;i++) {
			if(!temp.contains(i)) {
				result.add(i);
			}
		}
		System.out.println(result);
		return result;
	}
}
