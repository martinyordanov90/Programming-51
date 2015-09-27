package com.hackbulgaria.programming51.week5;

public class Node<T> {
	private T data;
	Node<T> next;
	public String value;
	
	public Node(T data){
		this.setData(data);
		setNext(null);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
