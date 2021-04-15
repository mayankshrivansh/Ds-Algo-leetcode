package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class LenghtAndCapacity {

	public static void main(String[] args) {

		int arr[] = new int[6];
		
		arr[0] = 0;
		arr[1] = 1;
		
		System.out.println("length----"+arr.length);
		System.out.println("Array----"+ Arrays.toString(arr));
		
		
		for (int i=2; i<arr.length; i++) {
			arr[i]=i;
		}
		
		System.out.println("length1----"+arr.length);
		System.out.println("Array1----"+ Arrays.toString(arr));
		//for (int )
	}

}
