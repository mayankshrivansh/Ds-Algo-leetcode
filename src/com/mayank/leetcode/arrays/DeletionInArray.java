package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class DeletionInArray {

	public static void main(String[] args) {
		int length = 0;
		int arr[]= new int[9];
		for (int i=0; i<3; i++) {
			arr[i]=i;
			length ++;
		}
		System.out.println("initial array---"+Arrays.toString(arr)+"length---"+length);
		
		//adding at the end
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==0) {
				continue;
			}
			else {
				arr[i+1]=3;
				break;
			}
		}
		System.out.println("Adding at the last"+ Arrays.toString(arr) );
		
		//deleting at the start of an array
		for(int i=1; i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		System.out.println("Adding at the last"+ Arrays.toString(arr) );

		//deleting at particular index lets say 1
		for(int i=2; i<arr.length;i++) {
			arr[i-1]= arr[i];
		}
		System.out.println("Adding at the last"+ Arrays.toString(arr) );

		
	}

}
