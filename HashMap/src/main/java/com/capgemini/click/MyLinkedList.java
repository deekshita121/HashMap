package com.capgemini.click;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLinkedList<K> {
	private static final Logger log = LogManager.getLogger(MyLinkedList.class);
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public INode pop() {
		INode temp = this.head;
		this.head = head.getNext();
		return temp;
	}

	public INode search(K key) {
		INode temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey().equals(key))
				return temp;
			else
				temp = temp.getNext();
		}
		return null;
	}

	public void printMyNodes() {
		log.info("My Nodes: " + head);
	}

	public String toString() {
		return "MyLinkedListNodes{" + head + '}';
	}
}
