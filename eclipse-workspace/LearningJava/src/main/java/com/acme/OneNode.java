package com.acme;

public class OneNode {
	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		Node node1 = new Node(11, null);
		linkedList.addNode(node1);
		System.out.println(linkedList);
		int size = linkedList.getSize();
		System.out.println(size);
		int[] values = linkedList.getValues();
		for (int value : values) {
			System.out.println(value);
		}
		Node[] nodes = linkedList.getNodes();
		for (Node node : nodes) {
			System.out.println(node.getData());
		}
	}

}
