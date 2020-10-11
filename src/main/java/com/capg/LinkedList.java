package com.capg;

public class LinkedList {
	private INode head;
	private INode tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode node) {
		if(this.tail == null) {
			this.tail = node;
		}
		if(head == null ) {
			this.head = node;
		}
		else {
//			node.setNext(head);
//			head = node;      // This will also work.
			
			INode tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode node) {
		if(this.tail == null) {
			this.tail = node;
		}
		if(head == null ) {
			this.head = node;
		}
		else {
			INode tempNode = this.tail;
			this.tail = node;
			this.tail.setNext(node);
		}
	}
	
	public void printNode() {
		INode temp = head;
		while(temp!=null) {
			System.out.println(temp.getKey());
			temp = temp.getNext();
		}
	}
	
	public void addInMiddle(INode node) {
		INode slow = head;
		INode fast = head.getNext();
		if(head == null) {
			this.head=node;
			this.tail = node;
		}
		
		while(fast!=null && fast.getNext()!=null) {
			slow=slow.getNext();
			fast = fast.getNext().getNext();
		}
		
		INode temp = slow.getNext();
		slow.setNext(node);
		node.setNext(temp);
	}
	
	public void popLast() {
		INode temp = this.head;
		while(temp.getNext()!=null && temp.getNext().getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(null);
		this.tail = temp;
	}
}
