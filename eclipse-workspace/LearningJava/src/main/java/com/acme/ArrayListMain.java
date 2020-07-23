package com.acme;

public class ArrayListMain {
	public static void main(String args[]) {
		ArrayList arrayList = new ArrayList();
		arrayList.addElement(10);
		arrayList.addElement(20);
		arrayList.addElement(30);
		arrayList.addElement(40);
		arrayList.addElement(50);
		arrayList.addElement(60);
		
		int element = arrayList.getElement(5);
		System.out.println(element);

	}
}
