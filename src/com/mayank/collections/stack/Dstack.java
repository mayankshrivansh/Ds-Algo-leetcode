package com.mayank.collections.stack;

public class Dstack {

	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;

	public void push(int data) {

		if(size()>=capacity/2) {
			expand();
		}

		stack[top] = data;
		top++;

	}

	private void expand() {
		int cap2 = capacity*2;

		int newStack[] = new int[cap2];
		System.arraycopy(stack, 0, newStack, 0, size());
		stack = newStack;
		capacity =cap2;
	}

	public int pop() {
		int data=0;

		if (isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			top--;
			data = stack[top];
			stack[top]= 0;
			if (size()<=(capacity/2)/2) {
				shrink();
			}
		}
		return data;
	}

	private void shrink() {
		int cap2= capacity/2;
		int newStack[] = new int[cap2];
		System.arraycopy(stack, 0, newStack, 0, size());
		stack = newStack;
		capacity=cap2;
	}

	public int peak() {
		return stack[top-1];
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top<=0;
	}

	public void show() {
		for(int n: stack) {
			System.out.print(n+ " ");
		}
		System.out.println();
	}
}
