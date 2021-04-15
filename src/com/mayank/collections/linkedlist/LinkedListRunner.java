package com.mayank.collections.linkedlist;

public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(3);
		list.insert(7);
		list.insert(9);
		list.insert(45);
		
		list.insertAtStart(100);
		
		list.insertAtIndex(2, 55);
		
		list.deleteAt(0);

		
		list.show();
	}

}
