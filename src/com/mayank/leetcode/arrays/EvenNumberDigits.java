package com.mayank.leetcode.arrays;

public class EvenNumberDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {23,456,76543,345,2345};
System.out.println(EvenNumberDigits.findNumbers(nums));
	}
    public static int findNumbers(int[] nums) {
        int even=0;
        String x="";
        for(int i=0; i<nums.length; i++){
            x= String.valueOf(nums[i]);
            if(x.length()%2==0){
                even++;
            }
        }
        return even;
    }

}
