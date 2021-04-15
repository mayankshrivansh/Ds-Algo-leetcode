package com.mayank.leetcode.strings;

public class ReverseWordsinaStringIII {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
    public static String reverseWords(String s) {
        char[] newS = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i=newS.length-1;i>=0;i--) {
        	result.append(newS[i]);
        }
        String [] words = result.toString().split(" ");
        StringBuilder result1 = new StringBuilder();
        for(int i=words.length-1;i>=0;i--) {
        	result1.append(words[i]+" ");
        }
        return result1.toString().trim();
    }
}
