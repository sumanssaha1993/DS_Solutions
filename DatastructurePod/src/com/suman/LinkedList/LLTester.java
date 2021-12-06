package com.suman.LinkedList;

public class LLTester {
	public static void main(String[] args) {
		/*SinglyLinkedList ll = new SinglyLinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		
		System.out.println(ll.toString());
		
		ll.remove(3);
		
		System.out.println(ll.toString());
		
		ll.add(3, 4);
		
		System.out.println(ll.toString());
		
		ll.add(3, 0);
		
		System.out.println(ll.toString());
		
		ll.set(3, 10);
		
		System.out.println(ll.toString());*/
		
		/*DoublyLinkedList ll = new DoublyLinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		
		ll.insertNodeInSortedList(10);
		
		System.out.println(ll.toString());*/
		
		/*SinglyLinkedList ll1 = new SinglyLinkedList();
		ll1.add(5);
		ll1.add(10);
		ll1.add(15);
		ll1.add(20);
		ll1.add(35);
		ll1.add(55);
		ll1.add(60);
		
		SinglyLinkedList ll2 = new SinglyLinkedList();
		ll2.add(1);
		ll2.add(2);
		ll2.add(8);
		ll2.add(25);
		ll2.add(40);
		ll2.add(50);
		ll2.add(65);
		
		SinglyLinkedList ll3 = new SinglyLinkedList();
		ll3.mergeSortedLists(ll1, ll2);
		System.out.println(ll3.toString());*/
		
		SinglyLinkedList ll1 = new SinglyLinkedList();
		ll1.add(15);
		ll1.add(3);
		ll1.add(7);
		ll1.add(2);
		ll1.add(1);
		ll1.add(9);
		ll1.add(5);
		
		ll1.sort();
		System.out.println(ll1.toString());
	}
}
