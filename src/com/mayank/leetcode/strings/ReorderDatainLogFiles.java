package com.mayank.leetcode.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ReorderDatainLogFiles {

	public static void main(String[] args) {
		String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		System.out.println(Arrays.toString(reorderLogFiles(logs)));
	}

	public static String[] reorderLogFiles(String[] logs) {
				ArrayList<String> digits = new ArrayList<String>();
		        ArrayList<String> letters = new ArrayList<String>();
		        for(String s : logs) {
		        	String [] each_letter = s.split(" ");
		        	if(each_letter[1].matches("^[0-9]*$")) {
		        		digits.add(s);
		        	}
		        	else {
		        		letters.add(s);
		        	}
		        }
		        System.out.println(digits);
		        System.out.println(letters);
		        Collections.sort(letters, (String lineA, String lineB) -> {
		            String[] s1 = lineA.split(" ",2);
		            String[] s2 = lineB.split(" ",2);
		            int len1 = s1.length;
		            int len2 = s2.length;
		            for (int i = 1; i < Math.min(len1, len2); i++) {
		                if (!s1[i].equals(s2[i])) {
		                    return s1[i].compareTo(s2[i]);
		                }
		            }
		            return s1[0].compareTo(s2[0]);
		    });
		        System.out.println(letters);
		        letters.addAll(digits);
		        System.out.println(letters);
		
		        return letters.toArray(new String[letters.size()]);



//		Arrays.sort(logs, (log1, log2) -> {//Using the generics in java, the second parameter redefines the sorting rules
//			String[] split1 = log1.split(" ", 2); // Divide log1 into 2 parts according to the separator "", that is, to separate the identifiers
//			String[] split2 = log2.split(" ", 2);
//			boolean isDigit1 = Character.isDigit(split1[1].charAt(0));//Judging that the first character except the identifier is the number true and the letter false
//			boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
//			if (!isDigit1 && !isDigit2) {//If both logs are letter logs
//				int cmp = split1[1].compareTo(split2[1]); //First compare the content letters split1>split2 then return 1, which is equal to 0, less than -1
//				if (cmp != 0) return cmp;
//				return split1[0].compareTo(split2[0]);//If the content letters are the same, compare the identifiers
//			}
//			return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
//			//If split1 is a numeric character, and split2 is a numeric character, return 0,
//			// If split1 is a numeric character, and split2 is an alphabetic character, return 1, that is, split1>split2, sort from small to large, split2 in advance
//			// If split1 is an alphabetic character, return -1,
//		});
//
//		return logs;


	}

}
