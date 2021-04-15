package com.mayank.collections.queue;

import com.mayank.collections.linkedlist.Node;

public class Queue {

	Node head;
	
	public void enqueue(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	public int dequeue() {
		Node secondLast = head;
		while(secondLast.next.next!=null) {
			secondLast = secondLast.next;
		}
		int data = secondLast.next.data;
		secondLast.next =null;
		return data;
	}
	
	public void display() {
		Node cur = head;
		while(cur.next!=null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
		System.out.println(cur.data);
	}
}
