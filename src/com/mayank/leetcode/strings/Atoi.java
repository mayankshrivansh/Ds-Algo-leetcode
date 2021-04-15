package com.mayank.leetcode.strings;

public class Atoi {

	public static void main(String[] args) {
		int result;
		String s= "-4193 with words";
		result = myAtoi(s);
		System.out.println("Result: "+result);
	}
    public static int myAtoi(String s) {
    		StringBuilder result = new StringBuilder();
    		char[] ch = s.toCharArray();
    		for(int i=0; i<ch.length; i++) {
    			if(ch[i]=='-' ||ch[i]=='+' || !(ch[i]>='0') &&!(ch[i]<='9')){
    				return 0;    			
    				}
    			if(ch[i]<='9' && ch[i]>='0') {
    				result.append(ch[i]);
    			}
    			else {
    				return 0;
    			}
    		}
    		System.out.println(result);
        return -1;
    }
}
