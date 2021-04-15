package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSideV2 {

	public static void main(String[] args) {

		int arr[] = {17,18,5,4,6,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(replaceElements(arr)));

	}

	public static int[] replaceElements(int[] arr) {

		int max =-1;
		for(int i=arr.length-1; i>=0; i--) {
            int temp = max;
            max = Math.max(max, arr[i]);
            arr[i] = temp;			
		}
		return arr;
	}

}
