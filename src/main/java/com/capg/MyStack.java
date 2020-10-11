package com.capg;

public class MyStack {

	private final LinkedList linkedList;

	public MyStack() {
		this.linkedList = new LinkedList();
	}

	public void push(INode node) {
		linkedList.add(node);
	}

	public void print() {
		linkedList.printNode();;
	}
	
	public INode peek() {
		return linkedList.head;
	}

	public INode pop() {
		return linkedList.pop();
	}

	public static void main(String[] args) {

	}
}