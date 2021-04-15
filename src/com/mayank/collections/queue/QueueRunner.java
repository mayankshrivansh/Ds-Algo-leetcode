package com.mayank.collections.queue;

public class QueueRunner {

	public static void main(String[] args) {

		Queue queue = new Queue();
		
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.display();
System.out.println();
		System.out.println(queue.dequeue());
		System.out.println();

//		queue.display();
		queue.enqueue(22);
		queue.display();
		System.out.println();

		queue.enqueue(23);
		queue.display();
		System.out.println();

		queue.enqueue(24);
		queue.display();
		System.out.println();

		System.out.println(queue.dequeue());

		System.out.println();
		queue.display();

				
	}

}
