package com.acme;

public class Node {
	public int data;
	Node nextNode;
	
	public Node(int value, Node node) {
		this.data = value;
		this .nextNode = node;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	

}
