package com.mayank.collections.stack;

public class StackLLRunner {

	public static void main(String[] args) {

		StackLL stack = new StackLL();
		
		stack.push(4);
		stack.push(34);
		stack.push(50);
		stack.push(65);
		stack.push(90);
		stack.display();

		stack.pop();
		stack.pop();
		stack.display();
		System.out.println(stack.peek());
		stack.display();

		
	}

}
