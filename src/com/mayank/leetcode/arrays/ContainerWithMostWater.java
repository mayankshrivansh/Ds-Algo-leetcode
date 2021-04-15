package com.mayank.leetcode.arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

    public static int maxArea(int[] height) {
        int area = 0;
        int i=0;
        int j=height.length-1;
        while(i<j) {
        	if(height[i]<height[j]) {
        		area = Math.max(area, height[i]*(j-i));
        		i++;
        	}else {
        		area = Math.max(area, height[j]*(j-i));
        		j--;
        	}
        }
        return area;
    }
}
