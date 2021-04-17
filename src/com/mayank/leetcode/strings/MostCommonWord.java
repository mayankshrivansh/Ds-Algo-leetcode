package com.mayank.leetcode.strings;

import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {

	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		System.out.println(mostCommonWord(paragraph, banned));
	}
	
    public static String mostCommonWord(String paragraph, String[] banned) {
    	String result ="";
    	HashSet<String> banned_words = new HashSet<String>();
    	HashMap<String, Integer> word_count = new HashMap<String, Integer>();
    	for(String b_word : banned) {
    		banned_words.add(b_word);
    	}
    	String[] words = paragraph.toLowerCase().split("\\W+");
    	for(String p_words : words) {
    		if(!banned_words.contains(p_words)) {
    			word_count.put(p_words, word_count.getOrDefault(p_words, 0)+1);
    		}
    	}
    	int max =0;
    	for(String count : word_count.keySet()) {
    		if(word_count.get(count)>max) {
    			max=word_count.get(count);
    			result=count;
    		}
    	}
    	return result;
    }

}
