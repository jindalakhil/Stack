package com.capg;

import org.junit.Test;

import com.capg.LinkedList;
import com.capg.Node;

import org.junit.Assert;


public class LinkedListTest {
	@Test
	public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		Node<Integer> fourthNode = new Node<Integer>(16);
		Node<Integer> fifthNode = new Node<Integer>(26);
		Node<Integer> sixth = new Node<Integer>(20);
		LinkedList list = new LinkedList();
		list.add(firstNode);
		list.add(secondNode);
		list.add(thirdNode);
		list.add(fifthNode);
		list.add(sixth);
		//list.printNode();
		list.addInMiddle(fourthNode);
		list.printNode();
		list.popLast();
		list.printNode();
	}
}
