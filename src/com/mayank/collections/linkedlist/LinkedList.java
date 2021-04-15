package com.mayank.collections.linkedlist;

public class LinkedList {

	Node head;
	
	public void insert(int data) {
		Node n = new Node(data);
		n.next = null;
		
		if (head==null) {
			head=n;
		}
		else {
			Node cur = head;
			while (cur.next!= null) {
				cur = cur.next;
			}
			cur.next = n;
		}

	}
	
	public void show() {
		Node cur = head;
		
		while(cur.next!=null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
		System.out.println(cur.data);

	}
	
	public void insertAtIndex(int index, int data) {
		Node n = new Node(data);
		n.next = null;
		
		if (index==0) {
			n.next = head;
			head = n;		}
		else {
			Node cur = head;
			for(int i=0; i<index-1;i++) {
				cur = cur.next;
			}
			n.next = cur.next;
			cur.next = n;
		}
	}
	
	public void deleteAt(int index) {
		Node cur = head;
		
		if (index==0) {
			head=head.next;
		}
		else {
		for(int i=0; i<index-1; i++) {
			cur=cur.next;
		}
		cur.next=cur.next.next;
		}
	}
	
	public void insertAtStart(int data) {
		Node n = new Node(data);
		n.next = null;
		n.next = head;
		head = n;
	}
}
