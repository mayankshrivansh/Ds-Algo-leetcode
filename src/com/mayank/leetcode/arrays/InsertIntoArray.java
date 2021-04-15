package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class InsertIntoArray {

	public static void main(String[] args) {

		int arr[] = new int[8];
		System.out.println("intial array---"+ Arrays.toString(arr));
		
		//inserting 3 elements into the first 3 index
		for(int i=0;i<3;i++) {
			arr[i]=i;
		}
		System.out.println("inserting first 3 elements---"+Arrays.toString(arr));
		
		//inserting at the end of an array
		arr[arr.length-2]= 8;
		System.out.println("inserting at the end---"+Arrays.toString(arr));

		//inserting at the beginning of an array
		for (int i=6; i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=12;
		System.out.println("inserting at the beginning---"+Arrays.toString(arr));

		//inserting at any index lets say 5
		for (int i=6; i>=5; i--) {
			arr[i+1]=arr[i];
		}
		arr[5]=3;
		System.out.println("inserting at index 5---"+Arrays.toString(arr));

	}

}
