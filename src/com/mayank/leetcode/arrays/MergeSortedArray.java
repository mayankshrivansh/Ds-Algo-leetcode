package com.mayank.leetcode.arrays;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int nums1[]= {1,3,8,0,0,0,0};
		int nums2[]= {9,10,67,90};
		int m= 3;
		int n= 4;
		
		merge(nums1, m, nums2, n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
//two pointer starting at the end
		 int p1 =m-1;
		 int p2 =n-1;
		 
		 int p = m+n-1;
		 
//		 for (int i=p; i>=0; i--) {
//			 if(p2<0) {
//				 break;
//			 }
//			 if(p1>=0&&(nums1[p1]>nums2[p2])) {
//				 nums1[p]=nums1[p1--];
//			 }
//			 else {
//				 nums1[p]=nums2[p2--];
//			 }
//		 }
		 
		 while (p1>=0&&p2>=0) {
			 nums1[p--]=nums1[p1]<nums2[p2]?nums2[p2--]:nums1[p1--];
		 }


	System.out.println(Arrays.toString(nums1));



	}
	

}
