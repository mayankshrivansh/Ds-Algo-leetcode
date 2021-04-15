package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {

		int arr[]={1,0,3,4,5,0,3,4};
		System.out.println("array---"+Arrays.toString(arr));
		duplicateZeros(arr);
	}
    public static void duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
        		if(arr[i]==0) {
        			for(int j=arr.length-2;j>=i;j--) {
        				arr[j+1]=arr[j];
        			}
        			i++;
        		}
        }
		System.out.println("result---"+Arrays.toString(arr));
    }
   

}
