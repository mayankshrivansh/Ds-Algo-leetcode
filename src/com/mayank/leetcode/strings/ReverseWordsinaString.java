package com.mayank.leetcode.strings;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(reverseWords(s));
	}

    public static String reverseWords(String s) {
        s= s.trim();
        StringBuilder result = new StringBuilder();
        String[] news = s.split("\\s+");
        for(int i=news.length-1;i>=0;i--) {
        	result.append(news[i]+" ");
        }
        return result.toString().trim();
    }
}
