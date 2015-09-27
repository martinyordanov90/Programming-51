package com.hackbulgaria.programming51.week8;

import java.util.LinkedList;


public class BST<T extends Comparable<T>> {
	private Node<T> root;
	
	public BST(){
		root = null;
	}
	
	public boolean empty(){
		return root == null;
	}
	
	public void add(T data){
		if(empty()){
			root = new Node<T>(data);
		} else{
			
			if(data.compareTo(root.data) < 0) {
				addRecursive(data, root.left);
			
			// if (data.compareTo(root.data)< 0) {
				// root.left = new Node<T>(data);
			}else {
				addRecursive(data, root.right);
			}
		}
	}
	
	
	private void addRecursive(T data, Node<T> root){
		if (root == null) {
			return;
		}
		if (root.left == null || root.right == null) { // ako sme namerili listo 
			if(data.compareTo(root.data) < 0){ // proverqvame dali data e po-malko
				root.left = new Node<T>(data); // dabavi v lqvo
			}
		}else{
			root.right = new Node<T>(data); // dobavi v dqsno
		
		
		//if (root == null) {
		//	root = new Node<T>(data);
			
		//}else {
			if(data.compareTo(root.data) < 0){ // proverka dali data e po-malko
				if (root.left == null) {
					root.left = new Node<T>(data);
				}
				addRecursive(data, root.left); // dabovqme v lqvo
			} else{
				if (root.right == null) {
					root.right = new Node<T>(data);
				}
				addRecursive(data, root.right); // dobavqme v dqsno
			}
		}
		//}
	}
	
	private String toStringRecursive(Node<T> root){
		
		if (root == null) return ""; {
			
		}
		String str = "";
		str += toStringRecursive(root.left);
		str += root.data + " ";
		str+= toStringRecursive(root.right);
		return str;
	}
	
	public String toString(){
		String str = "";
		str += toStringRecursive(root);
		return str;
	}

	public void clear(){
		root = null;
	}
	public void balance(){
		// spisuk sus sortirani elementi(ot durvoto)
		LinkedList<T> l = toList();
		clear();
		balanceRecursive(new LinkedList<T>());
	}
	public LinkedList<T> toList(){
		
		return toListRecursive(root,new LinkedList<T>(Node<T> root,LinkedList<T>);
	}
	
	private void toListRcursive(Node<T> root) {
		l.add(root data);
		return ;
	}

	private void balanceRecursive(LinkedList<T> l){
		
	}
}

