package com.suman.LinkedList;

public class MyQueue {

	Node head = null;
	Node tail = null;
	int count = 0;
	
	class Node{
		int ele;
		Node next;
		Node(int ele){
			this.ele = ele;
			next = null;
		}
	}
	
	public void add(int val){
		if(head == null){
			head = new Node(val);
			tail = head;
			count++;
			return;
		}
		
		tail.next = new Node(val);
		tail = tail.next;
		count++;
	}
	
	public int peek(){
		return head.ele;
	}
	
	public int poll(){
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
