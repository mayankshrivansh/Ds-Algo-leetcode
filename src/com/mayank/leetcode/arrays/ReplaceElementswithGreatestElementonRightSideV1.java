package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSideV1 {

	public static void main(String[] args) {

		int arr[] = {17,18,5,4,6,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(replaceElements(arr)));
		
	}

    public static int[] replaceElements(int[] arr) {
        int max;
        for(int i=0; i<arr.length; i++){
            max=0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            arr[i]=max;
        }
        arr[arr.length-1] =-1;
        return arr;
    }
}
