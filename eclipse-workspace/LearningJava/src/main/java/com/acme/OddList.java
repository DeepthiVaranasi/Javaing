package com.acme;

public class OddList {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList();

		Node node = new Node(20, null);
		myLinkedList.addNode(node);

		node = new Node(33, null);

		myLinkedList.addNode(node);

		node = new Node(45, null);
		myLinkedList.addNode(node);

		node = new Node(17, null);
		myLinkedList.addNode(node);

		node = new Node(18, null);
		myLinkedList.addNode(node);

		int size = myLinkedList.getSize();
		System.out.println(size);
		
		int[] values = myLinkedList.getValues();
		values = myLinkedList.getValues();
		for(int value : values) {
			System.out.println(value);
		}

		LinkedList oddLinkedList = new LinkedList();

	
		

		int i;
		for (i = 0; i < size; i++) {
			if (values[i] % 2 != 0) {
				Node node1 = new Node(values[i], null);
				oddLinkedList.addNode(node1);
			}
		}

		values = oddLinkedList.getValues();
		for(int value : values) {
			System.out.println(value);
		}
		
		
		

	}
}
