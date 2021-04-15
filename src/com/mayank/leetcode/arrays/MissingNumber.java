package com.mayank.leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {3,0,1};
		System.out.println(missingNumber(nums));
	}
	//guess formula___________
//    public static int missingNumber(int[] nums) {
//        int sum =0;
//        int expectedSum =nums.length*(nums.length+1)/2;
//        for(int a:nums) {
//        	sum+=a;
//        }
//        return expectedSum-sum;
//    }
    
    public static int missingNumber(int[] nums) {
    	HashSet<Integer> set = new HashSet<>();
    	for(int a :nums) {
    		set.add(a);
    	}
    	for(int i=0;i<=nums.length;i++) {
    		if(!set.contains(i)) {
    			return i;
    		}
    	}
    	return -1;
    }

}
