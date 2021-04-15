package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int arr[] = {9,9,9,9};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(plusOne(arr)));
	}

	public static int[] plusOne(int[] digits) {
		if(digits[digits.length-1]!=9) {
			digits[digits.length-1]+=1;
			return digits;
		}
		else {
			for(int i=digits.length-1; i>=0;i--) {
				if(digits[i]==9) {
					digits[i]=0;
				}
				else {
					digits[i]++;
					return digits;
				}
			}
			digits = new int[digits.length+1];
			digits[0]=1;
			return digits;
		}
	}

}
