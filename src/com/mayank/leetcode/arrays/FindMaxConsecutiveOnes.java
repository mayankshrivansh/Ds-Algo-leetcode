package com.mayank.leetcode.arrays;

public class FindMaxConsecutiveOnes {

	public static void main(String[] args) {
		//		int arr[]	= new int[4];
		//		char arr2[] = new char[5];
		//		float arr3[]= new float[3];
		//		boolean arr4[] = new boolean[3];
		//		String arr5[] = new String[3];

		int num[] = {0,1,0};
		System.out.println(FindMaxConsecutiveOnes.consecutiveOnes(num));
	}
	public static int consecutiveOnes(int [] num) {

		int count = 0, maxCount = 0;
		for (int i=0; i<num.length;i++) {
			if (num[i]==1) {
				count +=1;
			}
			else {
				maxCount =Math.max(maxCount, count);
				count = 0;
			}
		}
		return maxCount =Math.max(maxCount, count);
	
	}

}
