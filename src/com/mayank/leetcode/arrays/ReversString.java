package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class ReversString {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
	}

    public static void reverseString(char[] s) {
//        char[] result = new char[s.length];
        System.out.println(Arrays.toString(s));

        int j=0;
        for(int i=s.length-1;i>=0;i--) {
        	if(j<i) {
        	char temp = s[j];
        	s[j]=s[i];
        	s[i]=temp;
        	j++;}
        }
        System.out.println(Arrays.toString(s));
    }
}
