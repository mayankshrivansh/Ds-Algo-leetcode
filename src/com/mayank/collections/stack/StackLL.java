package com.mayank.collections.stack;

import com.mayank.collections.linkedlist.Node;

public class StackLL {

	Node head;
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public int pop() {
		int data = head.data;
		head = head.next;
//		System.out.println(data);
		return data;
	}
	
	public void display() {
		Node cur = head;
		while(cur.next!=null){
			System.out.println(cur.data);
			cur =cur.next;
		}
		System.out.println(cur.data);
	}
	
	public int peek() {
		int data = head.data;
		return data;
	}
}
