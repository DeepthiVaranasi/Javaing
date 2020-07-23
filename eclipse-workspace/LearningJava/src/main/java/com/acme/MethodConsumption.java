package com.acme;

public class MethodConsumption {
	
	public static void main(int myNumber) {
		System.out.println(myNumber);
	}
	
	public static void main(String[] args) {
		String myWord = "Hello";
		String middleWord = ChapterOne.middleWord(myWord);
		System.out.println(middleWord);
		MethodConsumption.main(middleWord);
		int myNumber = 3;
		main(myNumber);
	}
	
	public static void main(String name) {
		System.out.println(name);
		int myNumber = 8;
		main(myNumber);
	}

}
