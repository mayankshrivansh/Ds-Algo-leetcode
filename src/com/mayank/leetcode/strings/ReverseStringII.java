package com.mayank.leetcode.strings;

import java.util.Arrays;

public class ReverseStringII {

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverseStr(s, k));
	}
    public static String reverseStr(String s, int k) {
        char[] string = s.toCharArray();
        int length = string.length;
    	k=k%length;
        if(k<0) {
        	k=k+length;
        }
        reverse(string, 0, k-1);

//        System.out.println(Arrays.toString(string));
        return new String(string);
    }
    
    public static void reverse(char nums[], int start, int end) {
    	while(end>start) {
    		char temp = nums[end];
    		nums[end]=nums[start];
    		nums[start]=temp;
    		start++;
    		end--;
    	}
    }

}
