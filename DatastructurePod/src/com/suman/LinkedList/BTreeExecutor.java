package com.suman.LinkedList;

public class BTreeExecutor {

	public static void main(String[] args) {
		MyBTree mbt = new MyBTree();
		mbt.add(8);
		mbt.add(2);
		mbt.add(5);
		mbt.add(18);
		mbt.add(4);
		mbt.add(3);
		mbt.add(13);
		mbt.sortData();
		System.out.println(mbt);
		
		mbt.remove(4);
		mbt.sortData();
		System.out.println(mbt);
		
		System.out.println("------------------------");
		
		mbt.mirrorOfTree();
		mbt.sortData();
		System.out.println(mbt);
		
		
	}
}
