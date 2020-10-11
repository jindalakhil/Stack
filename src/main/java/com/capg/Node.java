package com.capg;

public class Node<K> implements INode<K>{
//	private K key;
//	private Node next;
//	
//	public Node(K key) {
//		this.key = key;
//		this.next = null;
//	}
//
//	public K getKey() {
//		return key;
//	}
//
//	public void setKey(Node key) {
//		this.key = key;
//	}
//
//	public Node getNext() {
//		return next;
//	}
//
//	public void setNext(Node next) {
//		this.next = next;
//	}
	
	private  K key;
	private INode next;
	
	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = next;
	}
}
