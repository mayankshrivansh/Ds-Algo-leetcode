package com.mayank.leetcode.strings;

public class IntegerToRoman {

	public static void main(String[] args) {
		int num = 3999;
		System.out.println(intToRoman(num));
	}
    public static String intToRoman(int num) {
        String result = "";
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String [] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        result = thousands[num/1000]+
        		hundreds[(num%1000)/100]+
        		tens[(num%100)/10]+
        		units[num%10];
    	return result;
    }

}
