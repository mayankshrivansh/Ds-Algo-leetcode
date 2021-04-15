package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target = 13;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}
//	
//    public static int[] twoSum(int[] nums, int target) {
//    	HashMap<Integer, Integer> map = new HashMap<>();
//    	int [] result = new int[2];
//    	for(int i=0; i<nums.length; i++) {
//    		int diff = target-nums[i];
//    		if(map.containsKey(diff)) {
//    			result[0]=i;
//    			result[1]=map.get(diff);
//    			return result;
//    		}
//    		else{
//    			map.put(nums[i], i);
//    		}
//    	}
//    	return result;
//    }
    
    public static int[] twoSum(int[] nums, int target) {
    	int [] result = new int[2];
    	for(int i=0; i<nums.length;i++) {
    		for(int j=i+1; j<nums.length;j++) {
    			if(nums[i]+nums[j]==target) {
    				result[0] = i;
    				result[1] = j;
    			}
    		}
    	}
    	return result;
    }
}
