package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
	
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        
        int [] left = new int[length];
        int [] right = new int[length];
        
        int [] result = new int [length];
        
        left[0]=1;
        right[length-1]=1;
        for(int i=1;i<length;i++) {
        	left[i]=nums[i-1]*left[i-1];
        }
        for(int i=length-2;i>=0;i--) {
        	right[i]=nums[i+1]*right[i+1];
        }
        
        for(int i=0;i<length;i++) {
        	result[i]=left[i]*right[i];
        }
//      result[length-1]=1;
//
//      for(int i=length-2;i>=0;i--) {
//    	result[i]=nums[i+1]*result[i+1];
//    }
//        int R=1;
//      for(int i=0;i<length;i++) {
//    	result[i]=result[i]*R;
//    	R= R*nums[i];
//    }
        
        return result;

    }

}
