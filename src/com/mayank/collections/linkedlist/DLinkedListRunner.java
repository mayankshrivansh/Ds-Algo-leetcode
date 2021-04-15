package com.mayank.collections.linkedlist;

public class DLinkedListRunner {

	public static void main(String[] args) {
		DLinkedList list = new DLinkedList();
		list.insert(12);
		list.insert(13);
		list.insert(14);
		
		list.insertAtStart(23);
		list.show();
		System.out.println();
		list.insertAtIndex(3, 27);

		list.show();
		System.out.println();
		System.out.println(list.deleteAtEnd());
		System.out.println();
		list.show();
		System.out.println();
		System.out.println(list.deleteAtStart());
		System.out.println();

		list.show();
		System.out.println();
		System.out.println(list.deleteAtIndex(1));
		System.out.println();

		list.show();
	}

}
