package com.suman.LinkedList;

public class SinglyLinkedList implements MyLinkedList {

	Node head = null;
	int count = 0;

	class Node {
		Node next;
		int ele;

		Node(int ele) {
			this.ele = ele;
			next = null;
		}
	}

	public int size() {
		return count;
	}

	public void add(int ele) {
		if (head == null) {
			head = new Node(ele);
			count++;
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(ele);
		count++;
	}

	public void remove(int index) {
		if (index >= size()) {
			throw new RuntimeException("Index doesn't exist");
		}

		if (index == 0) {
			Node temp = head;
			head = head.next;
			temp = null;
			count--;
			return;
		}

		Node current = head;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		Node temp = current.next;
		current.next = current.next.next;
		temp = null;
		count--;
	}

	public int get(int index) {
		if (index >= size()) {
			throw new RuntimeException("Index doesn't exist");
		}

		if (index == 0) {
			return head.ele;
		}

		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.ele;
	}

	public void add(int index, int ele) {
		if (index >= size()) {
			throw new RuntimeException("Index doesn't exist");
		}

		if (index == 0) {
			Node temp = head;
			head = new Node(ele);
			head.next = temp;
			count++;
			return;
		}

		Node current = head;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		Node temp = current.next;
		current.next = new Node(ele);
		current.next.next = temp;
		count++;

	}

	public void set(int index, int ele) {
		if (index >= size()) {
			throw new RuntimeException("Index doesn't exist");
		}

		if (index == 0) {
			head.ele = ele;
			return;
		}

		Node current = head;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		current.next.ele = ele;
	}

	public void mergeSortedLists(SinglyLinkedList A, SinglyLinkedList B) {
		Node currentA = A.head;
		Node currentB = B.head;
		SinglyLinkedList C = new SinglyLinkedList();
		C.add(0);
		Node currentC = C.head;
		Node mergedNode = currentC;

		while (true) {
			if (currentA == null) {
				currentC.next = currentB;
				this.head = mergedNode.next;
				this.count = A.size() + B.size();
				break;
			}
			if (currentB == null) {
				currentC.next = currentA;
				this.head = mergedNode.next;
				this.count = A.size() + B.size();
				break;
			}

			if (currentA.ele <= currentB.ele) {
				currentC.next = new Node(currentA.ele);
				currentC = currentC.next;
				currentA = currentA.next;
			} 
			else {
				currentC.next = new Node(currentB.ele);
				currentC = currentC.next;
				currentB = currentB.next;
			}
		}
	}
	
	public void sort(){
		Node current = this.head;
		Node index = this.head;
		while(current != null){
			index = current.next;
			while(index != null){
				if(current.ele > index.ele){
					int temp = current.ele;
					current.ele = index.ele;
					index.ele = temp;
				}
				index = index.next;
			}
			current = current.next;
		}
	}
	
	public void printReverse(Node current){
		if(current.next != null){
			printReverse(current.next);
		}
		System.out.println(current.ele);
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < size(); i++) {
			builder.append(get(i));
			if (i != size() - 1) {
				builder.append(", ");
			}
		}
		builder.append("]");
		return builder.toString();
	}
}
