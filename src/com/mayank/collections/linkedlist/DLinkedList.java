package com.mayank.collections.linkedlist;

public class DLinkedList {
	Dnode head;
	
	public void insert(int data) {
		Dnode n = new Dnode(data);
		
		if(head ==null) {
			head = n;
		}
		else {
			Dnode cur = head;
			while(cur.next!=null) {
				cur=cur.next;
			}
			cur.next = n;
			n.prev = cur;
		}
	}
	
	public void insertAtStart(int data) {
		Dnode n = new Dnode(data);
		n.next = head;
		head.prev =n;
		head = n;
	}
	
	public void insertAtIndex(int index, int data) {
		Dnode n = new Dnode(data);
		if (index == 0) {
			insertAtStart(data);
		}
		else {
			Dnode cur = head;
			for(int i=0; i<index-1; i++) {
				cur = cur.next;
			}
			n.next = cur.next;
			cur.next.prev = n;
			cur.next = n;
			n.prev = cur;
		}
	}
	
	public int deleteAtEnd() {
		if(head==null) {
			return -1;
		}
		else if (head.next ==null) {
			return head.data;
		}
		else {
			int data = 0;
			Dnode cur = head;
			while(cur.next.next!=null) {
				cur =cur.next;
			}
			data = cur.next.data;
			cur.next =null;
			return data;
		}
	}
	
	public int deleteAtStart() {
		int data = 0;
		if(head==null) {
			return -1;
		}
		else if (head.next ==null) {
			data =head.data;
			head =null;
			return data;
		}
		else {
			data =head.data;
			head =head.next;
			return data;
		}
	}
	
	public int deleteAtIndex(int index) {
		int data = 0;
		if(index ==0) {
			return deleteAtStart();
		}
		else {
			Dnode cur = head;
			for(int i=0; i<index-1; i++) {
				cur = cur.next;
			}
			data = cur.next.data;
			cur.next = cur.next.next;
			cur.next.prev = cur;
			return data;
		}
	}
	
	
    public void show(){
        Dnode cur = head;
        while(cur.next!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
        System.out.println(cur.data);
    }
}
