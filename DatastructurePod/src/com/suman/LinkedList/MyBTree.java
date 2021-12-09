package com.suman.LinkedList;

public class MyBTree {

	private Node root;

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
		
		@Override
		public String toString() {
			return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
		}
	}
	
	@Override
	public String toString() {
		return "MyBTree [root=" + root + "]";
	}

	public void add(int data) {
		root = add(root, data);
	}

	private Node add(Node node, int data) {
		if(node == null){
			node = new Node(data);
			return node;
		}
		if(data < node.data){
			node.left = add(node.left, data);
		}
		else if(data > node.data){
			node.right = add(node.right, data);
		}
		return node;
	}
	
	public void sortData(){
		inOrder(root);
	}

	private void inOrder(Node node) {
		if(node != null){
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
	}
	
	public void mirrorOfTree(){
		root = mirrorOfTree(root);
	}

	private Node mirrorOfTree(Node node) {
		if(node != null){
			Node right = mirrorOfTree(node.right);
			Node left = mirrorOfTree(node.left);
			node.left = right;
			node.right = left;
		}
		return node;
	}
	
	public void remove(int element){
		root = remove(root, element);
	}

	private Node remove(Node node, int element) {
		if(node == null){
			return node;
		}
		else if(element < node.data){
			node.left = remove(node.left, element);
		}
		else if(element > node.data){
			node.right = remove(node.right, element);
		}
		else{
			if(node.left == null){
				return node.right;
			}
			else if(node.right == null){
				return node.left;
			}
			else{
				node.data = getMinRight(node.right);
				node.right = remove(node.right, node.data);
			}
		}
		return node;
	}

	private int getMinRight(Node node) {
		int min = node.data;
		while(node != null){
			min = node.left.data;
			node = node.left;
		}
		return min;
	}
}
