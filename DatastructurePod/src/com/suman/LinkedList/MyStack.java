package com.suman.LinkedList;

public class MyStack {

	Node head = null;
	int count = 0;
	
	class Node{
		int ele;
		Node next;
		Node(int ele){
			this.ele = ele;
			next = null;
		}
	}
	
	public void push(int val){
		if(head == null){
			head = new Node(val);
			count++;
			return;
		}
		
		Node current = head;
		head = new Node(val);
		head.next = current;
		count++;
	}
	
	public int peek(){
		return head.ele;
	}
	
	public int pop(){
		int val = head.ele;
		Node temp = head;
		head = head.next;
		temp = null;
		count--;
		return val;
	}
	
	public int size(){
		return count;
	}
	
	public String toString(){
		String s = "[";
		Node current = head;
		boolean isfirst = true;
		
		while(current != null){
			if(isfirst){
				isfirst = false;
			}
			else{
				s += ", ";
			}
			
			s += current.ele;
			current = current.next;
		}
		s += "]";
		return s;
	}
}
