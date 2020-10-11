package com.capg;

public class MyStack {

	private final LinkedList mll;

	public MyStack() {
		this.mll = new LinkedList();
	}

	public void push(INode node) {
		mll.add(node);
	}

	public void print() {
		mll.printNode();;
	}

	public static void main(String[] args) {

	}

}