package com.mayank.leetcode.arrays;

public class InsertingSquareNumbers {

	public static void main(String[] args) {
		int[] squareNumbers = new int[10];

		// Go through each of the Array indexes, from 0 to 9.
		for (int i = 0; i < 10; i++) {
		    // We need to be careful with the 0-indexing. The next square number
		    // is given by (i + 1) * (i + 1).
		    // Calculate it and insert it into the Array at index i.
		    int square = (i + 1) * (i + 1);
		    squareNumbers[i] = square;
		}
		
		for (int square: squareNumbers) {
			System.out.println(square);
		}

	}

	
}
