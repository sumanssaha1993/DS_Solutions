package com.suman.LinkedList;

public class DoublyLinkedList implements MyLinkedList {
	Node head = null;
	int count = 0;

	class Node {
		Node next;
		Node prev;
		int ele;

		Node(int ele) {
			this.ele = ele;
			next = prev = null;
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
		current.next.prev = current;
		count++;
	}

	public void remove(int index) {
		if (index >= size()) {
			throw new RuntimeException("Index doesn't exist");
		}

		if (index == 0) {
			head = head.next;
			head.prev = null;
			count--;
			return;
		}

		Node current = head;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		Node temp = current.next;
		current.next = current.next.next;
		current.next.prev = current;
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
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		return current.next.ele;
	}

	public void add(int index, int ele) {
		if (index >= size()) {
			throw new RuntimeException("Index doesn't exist");
		}

		if (index == 0) {
			Node temp = head;
			head = new Node(ele);
			head.next = temp;
			head.next.prev = head;
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
		current.next.prev = current;
		current.next.next.prev = current.next;
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

	public void insertNodeInSortedList(int ele) {
		Node current = head;
		if (ele < head.ele) {
			add(0, ele);
			return;
		}
		for (int i = 0; i < size(); i++) {
			if (i == size() - 1) {
				add(ele);
				break;
			}
			if (ele > current.ele && ele < current.next.ele) {
				add(i + 1, ele);
				break;
			}
			current = current.next;
		}
	}

	public void reverse() {
		Node temp = null;
		Node current = head;
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}

		if (temp != null) {
			head = temp.prev;
		}
	}
}
