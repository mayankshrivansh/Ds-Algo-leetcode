package com.mayank.leetcode.arrays;

public class LongestPrefix {

	public static void main(String[] args) {
		String strs[] = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}

    public static String longestCommonPrefix(String[] strs) {
        String result="";
        result = strs[0];
        if(strs.length==0)return "";
        for(int i=1; i<strs.length;i++) {
        	while(strs[i].indexOf(result)!=0) {
        		result = result.substring(0, result.length()-1);
        	}
        }
        return result;
    }
}
