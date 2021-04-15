package com.mayank.collections.stack;

public class StackRunner {

	public static void main(String[] args) {
		
		Dstack demo = new Dstack();
		
		demo.push(4);
		demo.show();
		System.out.println(demo.size());
		demo.push(6);
		demo.show();

		System.out.println(demo.size());

		demo.push(9);
		demo.show();
		demo.pop();
		demo.show();





	}

}
