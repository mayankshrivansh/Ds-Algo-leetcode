package com.mayank.collections.stack;
import java.util.Stack;
public class ValidParentheses {

	public static void main(String[] args) {
		String s = "([}}])";
		System.out.println(isValid(s));
	}
	
    public static boolean isValid(String s) {
    	Stack<Character> stack =  new Stack<Character>();
        
        for(char c : s.toCharArray()) {
        	if(c=='(' || c=='{' || c=='[') {
        		stack.push(c);
        	}else if(c==')' && !stack.isEmpty() && stack.peek().equals('(')) {
        		stack.pop();
        	}else if(c=='}' && !stack.isEmpty() && stack.peek().equals('{')) {
        		stack.pop();
        	}else if(c==']' && !stack.isEmpty() && stack.peek().equals('[')) {
        		stack.pop();
        	}
        	else {
        		return false;
        	}
        }
    	
    	return stack.isEmpty();
    }

}
