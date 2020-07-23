package com.acme;

import java.util.Arrays;

public class ArrayList {
	int position = 0;
	int capacity = 5;
	int[] elements = new int[capacity];

	public void addElement(int element) {
		if (position == elements.length) {
			int newArray = elements.length * 3;
			elements = Arrays.copyOf(elements, newArray);
			elements[position++]=element;
		} else {
			elements[position++] = element;
		}
	}
	
	public int getElement(int position) {
		return elements[position];
	}

}
