package com.suman.LinkedList;

public class StackExecutor {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(15);
		stack.push(20);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		stack.pop();
		stack.pop();
		System.out.println(stack);
	}
}
