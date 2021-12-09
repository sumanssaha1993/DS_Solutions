package com.suman.LinkedList;

public class ALTester {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		list.add(2, 3);
		
		System.out.println(list);
		
	}
}
