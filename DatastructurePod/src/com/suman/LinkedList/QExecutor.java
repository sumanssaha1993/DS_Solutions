package com.suman.LinkedList;

public class QExecutor {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.add(10);
		queue.add(15);
		queue.add(20);
		
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		queue.poll();
		queue.poll();
		System.out.println(queue);
	}
}
