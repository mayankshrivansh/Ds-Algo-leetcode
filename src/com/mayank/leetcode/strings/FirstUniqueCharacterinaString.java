package com.mayank.leetcode.strings;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(firstUniqChar(s));
	}
    public static int firstUniqChar(String s) {
    	HashMap<Character, Integer> map = new HashMap<>();
    	for(int i=0; i<s.length();i++) {
    		char c = s.charAt(i);
    		if(!map.containsKey(c)){
    			map.put(c, i);
    		}else {
    			map.put(c, -1);
    		}
    	}
    	int result =Integer.MAX_VALUE;
    	for(char c : map.keySet()) {
    		if(map.get(c)>-1 && map.get(c)<result) {
    			result= map.get(c);
    		}
    	}
    	
        return result;
    }

}
