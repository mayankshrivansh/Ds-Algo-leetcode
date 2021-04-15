package com.mayank.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {3,0,-2,-1,1,2};
		System.out.println(threeSum(nums));
	}
	
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
        	if((i==0)||(i>0 && nums[i]!=nums[i-1])) {
        	int j = i+1;
        	int k = nums.length-1;
        	int sum = 0-nums[i];
        	while(j<k) {
        		if(sum==nums[j]+nums[k]) {
        			output.add(Arrays.asList(nums[i],nums[j],nums[k]));
        			 while(j<k && nums[j]==nums[j+1])j++;
        			 while(j<k && nums[k]==nums[k-1])k--;
        			j++;
        			k--;
        		}else if(sum<nums[j]+nums[k]) {
        			k--;
        		}else {
        			j++;
        		}
        	}
        }
        }
		return output;
    }
        
    }

