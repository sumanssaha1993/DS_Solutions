package com.suman.LinkedList;

public class MyArrayList {

	private Object[] arr;
	private int p = 0;
	
	public MyArrayList(){
		this(10);
	}
	
	public MyArrayList(int length){
		arr = new Object[length];
	}
	
	public void add(Object ele){
		if(p >= arr.length){
			increase();
		}
		
		arr[p++] = ele;
	}
	
	public void add(int index, Object ele){
		if(p >= arr.length){
			increase();
		}
		for(int i = size()-1; i>= index; i--){
			arr[i+1] = arr[i];
		}
		arr[index] = ele;
		p++;
	}
	
	public void remove(int index){
		for(int i=index; i<size(); i++){
			arr[i] = arr[i+1];
		}
		arr[size()-1] = null;
		p--;
	}
	
	public Object get(int index){
		return arr[index];
	}

	private void increase() {
		Object[] temp = new Object[arr.length * 2];
		for(int i=0; i<size(); i++){
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	public int size(){
		return p;
	}
	
	public String toString(){
		String s = "[";
		for(int i=0; i<size(); i++){
			if(i != 0){
				s += ", ";
			}
			s += arr[i];
		}
		s += "]";
		return s;
	}
}
