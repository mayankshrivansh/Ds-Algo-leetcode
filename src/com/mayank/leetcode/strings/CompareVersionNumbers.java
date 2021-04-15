package com.mayank.leetcode.strings;

public class CompareVersionNumbers {

	public static void main(String[] args) {
		String version1 = "1.01";
		String version2 = "1.001.1";
		System.out.println(compareVersion(version1, version2));
	}
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int maxLength = Math.max(version1.length(), version2.length());
        for(int i=0; i<maxLength; i++) {
        	int q1 = i<v1.length?Integer.parseInt(v1[i]):0;
        	int q2 = i<v2.length?Integer.parseInt(v2[i]):0;

        	if(q1<q2)return -1;
        	else if(q1>q2) return 1;
        }
    	
    	return 0;
    }

}
