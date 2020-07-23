package com.acme;

import java.io.*;
import java.util.*;

public class ChapterOne {

	

	public static void printhello() {
		System.out.println("Hello");
		System.out.println("Deepthi");
	}

	public static void printOperations(int a, int b) {
		int sum = a + b;
		int diff = a - b;
		int mult = a * b;
		int mod = a % b;
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(mult);
		System.out.println(mod);
	}

	public static void printMulttable(int n) {
		int i;
		for (i = 0; i < 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}

	}

	public static void printCircle(int r) {
		double area;
		double circum;
		area = 2 * 3.14 * r;
		circum = 3.14 * r * r;
		System.out.println("Radius of circle is : " + area);
		System.out.println("circumference of circle is : " + circum);
	}

	public static void printAverage(int a, int b, int c) {
		int sum = a + b + c;
		float average = sum / 3;
		System.out.println("Average is : " + average);
	}

	public static void printRectangle(int l, int b) {
		double area = l * b;
		double perimeter = 2 * (l + b);
		System.out.println("Area of rectangleis : " + area);
		System.out.println("Perimeter of rectangle is : " + perimeter);
	}

	public static void printSwap(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("value of a is " + a);
		System.out.println("value os b is " + b);
	}

	public static void printCompare(int a, int b) {
		if (a == b) {
			System.out.println("a is equal to b");
		}
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("a is lesser than b");
		}
	}

	public static void printOddnumbers(int n) {
		for (int i = 1; i < n; i = i + 2) {
			System.out.println(i);
		}
	}

	public static void printEvennumbers(int n) {
		for (int i = 0; i < n; i = i + 2) {
			System.out.println(i);
		}
	}

	public static void sumOfArrayElements() {
		int array[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < 5; i++)
			sum = sum + array[i];
		System.out.println("Sum is :" + sum);
	}

	public static void averageOfArrayElements() {
		int array[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int a = 0; a < 5; a++)
			sum = sum + array[a];
		int length = 5;
		double average = sum / length;
		System.out.println("Average is : " + average);
	}

	public static void checkSpecificValue() {
		int array[] = { 20, 30, 40, 50, 60 };
		for (int i = 0; i < 5; i++)
			if (array[i] == 50)
				System.out.println("Item found");
			else
				System.out.println("Item you have entered is not in the array list");
	}

	public static void findIndex() {
		int array[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < 5; i++) {
			System.out.println("Index and its values are: " + i + "-" + array[i]);
		}
	}
	/*
	 * public static void removeElement() { int array[] = {1,2,3,4,5}; for(int
	 * i=0;i<5;i++) if(array[i]=5)
	 * 
	 * }
	 */

	public static int findMax(int[] numbers) {
		int max = numbers[0];
		int noOfelements = numbers.length;

		for (int i = 0; i < noOfelements; i++) {
			if (max < numbers[i]) {
				max = numbers[i];

			}
		}
		return max;
	}

	public static void printConcatenatedString() {
		String a = "Hello";
		String b = "Gopal mama";
		String c = a.concat(b);
		System.out.println("String after concatenation is " + c);
	}

	public static void stringTrim() {
		String a = "This is     ";
		String b = a.trim();
		System.out.println("String after trimming is " + b);
	}

	public static void stringUpperCase() {
		String a = "i am deepthi";
		String b = a.toUpperCase();
		System.out.println("String in uppercase form" + b);
	}

	public static void stringLowerCase() {
		String a = "I AM DEEPTHI";
		String b = a.toLowerCase();
		System.out.println("String in lowercase form" + b);
	}

	public static void stringSubstring() {
		String a = "I am Deepthi";
		String b = a.substring(5, 10);
		String c = a.substring(7);
		System.out.println("Substring is:" + b);
		System.out.println("Substring is : " + c);
	}

	public static void stringReplace() {
		String a = "I am a cat";
		String b = a.replace('c', 'r');
		System.out.println("String after replacement : " + b);
	}

	public static void stringLength() {
		String a = "Hellloooooo";
		int length = a.length();
		System.out.println("Length of the string is " + length);
	}

	public static void stringStartwith() {
		String a = "Deepthi is lalala";
		String b = "Deepthi ennfjnfn";
		boolean c = a.startsWith(b);
		System.out.println("Does it start with the same word?" + c);
	}

	public static void stringReplaceAll() {
		String a = "Cat is my favorite";
		String b = a.replaceAll("cat", "rat");
		System.out.println("String after replacing the whole word" + b);
	}

	public static void stringCompare() {
		String a = "Hi ThiS Is DeEpThI";
		String b = "Hi this is deepthi";
		boolean c = a.equalsIgnoreCase(b);
		System.out.println("Are the two strings equla?" + c);
	}

	public static void findSmallest(int a, int b, int c) {
		if ((a < b) && (a < c)) {
			System.out.println(a);
		}
		if (b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

	public static double findAverage(int[] inputs) {
		int length = inputs.length;
		int sum = 0;
		for (int i = 0; i < inputs.length; i++) {
			sum = sum + inputs[i];
		}
		double average = sum / length;
		return average;
	}

	public static void sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println(n);
	}

	public static void checkIfLeapYear(int year) {
		boolean a = (year % 4) == 0;
		System.out.println(a);
	}

	public static void triagleArea(int a, int b, int c) {
		int s = a + b + c;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println(area);
	}

	public static void PentagonArea(int a, int b) {
		double area = (a * b * b) / (4 * Math.tan(Math.PI / a));
		System.out.println(area);
	}

	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}

	public static void checkFileOrDirectory(String directoryName) {
		File a = new File(directoryName);
		if (a.exists()) {
			System.out.println("Directory exists");
		} else {
			System.out.println("Doesnt exist");
		}
	}

	public static void checkReadPermission(String directoryName) {
		File a = new File(directoryName);
		if (a.canRead()) {
			System.out.println("Readable file");
		} else {
			System.out.println("Not a readable file");
		}
	}

	public static void CheckWritePermission(String directoryName) {
		File a = new File(directoryName);
		if (a.canWrite()) {
			System.out.println("Writable file");
		} else {
			System.out.println("Not a writable file");
		}
	}

	public static void createFile() throws Exception {
		File a = new File("deepthi");
		a.createNewFile();
		File b = new File("varanasi");
		b.createNewFile();
	}

	public static int wordsinString(String a) {

		int words = 1;
		char space = ' ';
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == space) {
				words++;
			}
		}
		return words;
	}

	public static String middleWord(String a) {
		String middleWord;
		int position;
		int length;
		if (a.length() % 2 == 0) {
			position = a.length() / 2 - 1;
			length = 2;
		} else {
			position = a.length() / 2;
			length = 1;
		}
		middleWord = a.substring(position, position + length);
		return middleWord;
	}

	public static int compareFiles(File a, File b) {
		int c = a.compareTo(b);
		return c;

	}

	public static int findVowels(String input) {
		int vowels = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u' || input.charAt(i) == 'A' || input.charAt(i) == 'E'
					|| input.charAt(i) == 'O' || input.charAt(i) == 'u' || input.charAt(i) == 'I') {
				vowels++;
			}
		}
		return vowels;
	}

	public static void readInput() throws IOException {
		BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input your name: ");
		String name = R.readLine();
		System.out.println("Your name is: " + name);
	}

	public static double fileSizes(File file) {
		double fileSizeInMegaBytes = file.length() / (1024 * 1024);
		return fileSizeInMegaBytes;
	}

	public static String findLongestWords(String filePath) throws FileNotFoundException {

		String longest_word = "";
		String current;
		File file = new File(filePath);
		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {
			current = sc.next();
			if (current.length() > longest_word.length()) {
				longest_word = current;
			}

		}
		sc.close();
		return longest_word;
	}

	public static void readFile(String filePath) throws Exception {

		String strLine;

		BufferedReader br = new BufferedReader(new FileReader(filePath));

		while ((strLine = br.readLine()) != null) {
			System.out.println(strLine);
		}
		br.close();
	}

	public static void readFile(File file) throws Exception {

		String strLine;

		BufferedReader br = new BufferedReader(new FileReader(file));

		while ((strLine = br.readLine()) != null) {
			System.out.println(strLine);
		}
		br.close();
	}

	public static Date lastModified(String filePath) throws Exception {
		File a = new File(filePath);
		a.createNewFile();
		Date date = new Date(a.lastModified());
		return date;
	}

	public static void CreateArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		System.out.println(list);
	}

	public static void PrintArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		for (String element : list) {
			System.out.println(element);
		}
	}

	public static void addInToArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		System.out.println(list);
		list.add(1, "element3");
		System.out.println(list);

	}

	public static void getElement() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		System.out.println(list);
		list.add(1, "element3");
		System.out.println(list);
		String element = list.get(2);
		System.out.println(element);

	}

	public static void setElement() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		System.out.println(list);
		list.add(1, "element3");
		System.out.println(list);
		String element = list.get(2);
		System.out.println(element);
		list.set(2, "element0");
		System.out.println(list);

	}

	public static void removeElement() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		System.out.println(list);
		list.add(1, "element3");
		System.out.println(list);
		String element = list.get(2);
		System.out.println(element);
		list.set(2, "element0");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);

	}

	public static void searchElement() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		System.out.println(list);
		list.add(1, "element3");
		System.out.println(list);
		String element = list.get(2);
		System.out.println(element);
		list.set(2, "element0");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		if (list.contains("element0")) {
			System.out.println("Element found!!!!");
		}
	}

	public static void sortArray() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		System.out.println(list);
		list.add(1, "element3");
		System.out.println(list);
		String element = list.get(2);
		System.out.println(element);
		list.set(2, "element0");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

	public static void copyArray() {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("element1");
		list1.add("element2");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("element3");
		list2.add("element4");
		System.out.println("Before copying:" + list2);
		Collections.copy(list1, list2);
		System.out.println("After copying:" + list2);
	}

	public static void shuffleArray() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		System.out.println(list);
		list.add(1, "element3");
		System.out.println(list);
		String element = list.get(2);
		System.out.println(element);
		list.set(2, "element0");
		Collections.shuffle(list);
		System.out.println(list);
	}

	public static void reverseArray() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		list.add(1, "element3");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

	public static void subArray() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("element1");
		list.add("element2");
		list.add(1, "element3");
		System.out.println(list);
		List<String> sub_List = list.subList(0, 2);
		System.out.println("List of subArray " + sub_List);
	}

	public static void joinArrays() {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("element1");
		list1.add("element2");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("element3");
		list2.add("element4");
		ArrayList<String> list3 = new ArrayList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
	}

	public static void swapElementsInArray() {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("element1");
		list1.add("element2");
		list1.add("element3");
		Collections.swap(list1, 1, 2);
		System.out.println(list1);
	}

	public static void emptyArray() {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("element1");
		list1.add("element2");
		list1.add("element3");
		list1.removeAll(list1);
		System.out.println(list1);
	}

	public static void checkIfEmpty() {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("element1");
		list1.add("element2");
		list1.add("element3");
		list1.removeAll(list1);
		System.out.println("is it empty?" + list1.isEmpty());
	}

	public static void increaseSizeOfArray() {
		ArrayList<String> list1 = new ArrayList<String>(3);
		list1.add("element1");
		list1.add("element2");
		list1.add("element3");
		list1.ensureCapacity(4);
		list1.add("element4");
		System.out.println(list1);
	}

	public static void createLinkedList() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		System.out.println(list);
	}

	public static void displayLinkedList() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		for (String element : list) {
			System.out.println(element);
		}
	}

	public static void addInToLinkedList() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		System.out.println("Before adding" + list);
		list.add(1, "1.5");
		System.out.println("After adding" + list);
	}

	public static void adddInToLinkedList() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		System.out.println("Before adding" + list);
		list.addFirst("0");
		list.addLast("3");
		System.out.println("after adding" + list);
	}

	public static void offersFirst() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		System.out.println("Before adding " + list);
		/*
		 * list.addFirst("0"); list.addLast("3");
		 */
		list.offerFirst("5");
		System.out.println("after adding " + list);
	}

	public static void offersLast() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		System.out.println("Before adding " + list);
		list.offerLast("5");
		System.out.println("after adding " + list);
	}

	public static void insertElements() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		System.out.println("Before adding " + list);
		LinkedList<String> list1 = new LinkedList<String>();
		list1.addAll(list);
		list1.add("9");
		System.out.println(list1);
	}

	public static void getElements() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		String element = list.get(2);
		System.out.println(element);
	}

	public static void getFirstAndLast() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		String element = list.getFirst();
		System.out.println("First element " + element);
		element = list.getLast();
		System.out.println("last element " + element);
	}

	public static void displayElements() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
	}

	public static void removeElements() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		System.out.println("Before removing" + list1);
		list1.remove("2");
		list1.remove(0);
		System.out.println("After removing" + list1);
	}

	public static void removeFirstAndLast() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		System.out.println("Before removing" + list1);
		list1.removeFirst();
		list1.removeLast();
		System.out.println("After removing" + list1);
	}

	public static void removeAll() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		System.out.println("Before removing" + list1);
		list1.removeAll(list1);
		System.out.println(list1);
	}

	public static void swapElements() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		System.out.println("Before swapping" + list1);
		Collections.swap(list1, 1, 2);
		System.out.println("After swapping" + list1);

	}

	public static void shuffleElements() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		System.out.println("Before shuffling" + list1);
		Collections.shuffle(list1);
		System.out.println("After shuffling" + list1);

	}

	public static void joinLinkedLists() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		System.out.println(list1);
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("4");
		list2.add("5");
		System.out.println(list2);
		LinkedList<String> list3 = new LinkedList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
	}

	public static void removeAndReturn() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		String element = list1.remove(2);
		System.out.println(list1);
		System.out.println(element);
	}

	public static void retrieveLastElement() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		String element = list1.getLast();
		System.out.println(element);
	}

	public static void elementExists() {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		boolean exists = list1.contains("2");
		System.out.println(exists);
	}

	public static void conversion() {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		LinkedList<String> list2 = new LinkedList<String>(list1);
		System.out.println(list2);

	}

	public static void checckIfEmpty() {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		boolean empty = list1.isEmpty();
		System.out.println(empty);
		list1.removeAll(list1);
		empty = list1.isEmpty();
		System.out.println(empty);

	}

	public static void replaceElements() {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		System.out.println(list1);
		list1.set(0, "0");
		System.out.println(list1);

	}

	public static void createHashSet() {
		HashSet<String> list = new HashSet<String>();
		list.add("1");
		list.add("2");
		System.out.println(list);
	}

	public static void displayHashSet() {
		HashSet<String> list = new HashSet<String>();
		list.add("1");
		list.add("2");
		for (String element : list) {
			System.out.println(element);
		}
	}

	public static void printSize() {
		HashSet<String> list = new HashSet<String>();
		list.add("1");
		list.add("2");
		int size = list.size();
		System.out.println(size);
	}

	public static void removeHashElements() {
		HashSet<String> list = new HashSet<String>();
		list.add("1");
		list.add("2");
		list.remove("1");
		System.out.println(list);
	}

	public static void isEmpty() {
		HashSet<String> list = new HashSet<String>();
		list.add("1");
		list.add("2");
		list.removeAll(list);
		System.out.println(list);
		boolean empty = list.isEmpty();
		System.out.println(empty);
	}

	public static void conversionHashTArray() {
		HashSet<String> list = new HashSet<String>();
		list.add("1");
		list.add("2");
		ArrayList<String> list1 = new ArrayList<String>(list);
		System.out.println(list1);
	}

	public static void conversionHashTArrayList() {
		HashSet<String> list = new HashSet<String>();
		list.add("1");
		list.add("2");
		ArrayList<String> list1 = new ArrayList<String>(list);
		System.out.println(list1);
	}

	public static void removeAlllElements() {
		HashSet<String> list = new HashSet<String>();
		list.add("1");
		list.add("2");
		list.removeAll(list);
		System.out.println(list);

	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);

		}

	}

	public static void desc(int n) {
		if (n <= 0) {
			return;
		} else {
			System.out.println(n);
			desc(n - 1);
		}
	}

	public static void asc(int n) {
		if (n >= 15) {
			return;
		}
		System.out.println(n);
		asc(n + 1);
	}

	public static int exp(int x, int a) {
		if (a == 0) {
			return 1;
		}
		if (a == 1) {
			return x;
		}
		return x * exp(x, a - 1);
	}

	public static int fib(int n) {
		if (n <= 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void printBinary(int n) {
		if (n > 0) {
			printBinary(n / 2);
			int a = n % 2;
			System.out.println(a);
		}
	}

	public static void arrayLength(int[] numbers) {
		int length = numbers.length;
		System.out.println(length);
	}

	public static void printReverseArray(int[] numbers) {
		int length = numbers.length;
		for (int i = length; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public static void arraySum(int[] numbers) {
		int sum = 0;
		int length = numbers.length;
		for (int i = 0; i < length; i++)
			sum = sum + numbers[i];
		System.out.println("Sum is :" + sum);
	}

	public static void arrayAverage(int[] numbers) {
		int sum = 0;
		int length = numbers.length;
		for (int i = 0; i < length; i++)
			sum = sum + numbers[i];
		double average = sum / length;
		System.out.println("Average is :" + average);
	}

	public static int getLargest(int[] numbers) {
		int largest = numbers[0];
		int noOfelements = numbers.length;

		for (int i = 0; i < noOfelements; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];

			}
		}
		return largest;
	}

	public static void arraysAsParameters(int[] numbers1, int[] numbers2) {
		int length1 = numbers1.length;
		int length2 = numbers2.length;
		boolean equals = length1 == length2;
		System.out.println(equals);
	}

	public static void checkEquality(int[] numbers1, int[] numbers2) {
		for (int i = 0; i <= numbers1.length; i++) {
			if (numbers1[i] == numbers2[i]) {
				System.out.println("Equals");
			}
		}
	}

	public static void twoDArray() {
		double[][][] carDealers = new double[10][5][7];
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 5; j++)
				for (int k = 0; k < 7; k++)
					carDealers[i][j][k] = 10.00;
	}

	public static void vectorSize() {
		Vector<Integer> numbers = new Vector<Integer>();
		int size = numbers.size();
		System.out.println("Size:" + size);

	}

	public static void vectorSetSize() {
		Vector<Integer> numbers = new Vector<Integer>();
		int size = numbers.size();
		System.out.println("Before:" + size);
		numbers.setSize(10);
		size = numbers.size();
		System.out.println("After:" + size);

	}

	public static void vectorArrayCapacity() {
		Vector<Integer> numbers = new Vector<Integer>();
		int capacity = numbers.capacity();
		System.out.println("capacity:" + capacity);

	}

	public static void vectorSetCapacity() {
		Vector<Integer> numbers = new Vector<Integer>(20);
		int capacity = numbers.capacity();
		System.out.println("capacity:" + capacity);
		numbers.ensureCapacity(30);
		System.out.println("capacity:" + capacity);

	}

	public static void vectorAddElements() {
		Vector<Integer> numbers = new Vector<Integer>();
		int size = numbers.size();
		System.out.println("Size:" + size);
		numbers.add(1);
		numbers.addElement(2);
		System.out.println(numbers);
	}

	public static void vectorGetElement() {
		Vector<Integer> numbers = new Vector<Integer>();
		int size = numbers.size();
		System.out.println("Size:" + size);
		numbers.add(1);
		numbers.addElement(2);
		int number = numbers.get(1);
		System.out.println(number);
	}

	public static void vectorPrintElements() {
		Vector<Integer> numbers = new Vector<Integer>();
		numbers.add(1);
		numbers.addElement(2);
		for (Integer e : numbers) {
			System.out.println(e);
		}
	}

	public static void vectorContains() {
		Vector<Integer> numbers = new Vector<Integer>();
		numbers.add(1);
		numbers.addElement(2);
		if (numbers.contains(1)) {
			System.out.println("Yeaah");
		}
	}

	public static void vectorOperations() {
		Vector<Integer> numbers = new Vector<Integer>(20);
		numbers.add(1);
		numbers.addElement(2);
		int eOne = (int) numbers.firstElement();
		System.out.println("First Element:" + eOne);
		int eTwo = (int) numbers.lastElement();
		System.out.println("Lst Element:" + eTwo);
		int eThree = numbers.indexOf(1);
		System.out.println("Index:" + eThree);
		boolean empty = numbers.isEmpty();
		System.out.println("Checking if empty" + empty);
		int index1 = numbers.lastIndexOf(1);
		System.out.println("Last index" + index1);
		numbers.removeAllElements();
		System.out.println("Numbers:" + numbers);
		numbers.add(1);
		numbers.addElement(2);
		int elementremoved = (int) numbers.remove(2);
		System.out.println(elementremoved);
		numbers.setElementAt(2, 1);
		System.out.println("Numbers:" + numbers);
		String str = numbers.toString();
		System.out.println(str);
	}

	public static void printTwoD(int mat[][]) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}
	}

	public static void printTwooD(int mat[][]) {

		for (int[] row : mat) {
			for (int column : row) {
				System.out.print(column + " ");
			}
		}
	}

	public static void print2D(int mat[][]) {
		for (int[] row : mat) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static void printThreeD(int mat[][]) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}
	}

	public static void print3D(int mat[][]) {
		for (int[] row : mat) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static void bubbleSort(int[] nums) {
		int nIterations = nums.length - 1;
		int oIterations = nums.length - 1;
		for (int i = 0; i < oIterations; i++) {

			for (int j = 0; j < nIterations; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}

			}
			nIterations = nIterations - 1;

		}
		for (int num : nums) {
			System.out.println(num);
		}
	}

	public static void selectionSort(int[] nums) {
		int nIterations = nums.length - 1;

		for (int i = 0; i < nIterations; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[smallestIndex]) {
					smallestIndex = j;
				}
			}
			int smallerNumber = nums[smallestIndex];
			nums[smallestIndex] = nums[i];
			nums[i] = smallerNumber;
		}
		for (int num : nums) {
			System.out.println(num);
		}
	}
     public static void swap(int a, int b)
     {
    	 a = a* b;
    	 b = a/b;
    	 a = a/b;
    	 System.out.println("After swapping");
    	 System.out.println(a);
    	 System.out.println(b);
     }
     
     public static void duplicates(String s) {
    	 char[] characters = s.toCharArray();
    	 Map<Character,Integer> charMap = new HashMap<Character,Integer>();
    	 for(Character ch : characters) {
    		 if(charMap.containsKey(ch)) {
    			 charMap.put(ch, charMap.get(ch) + 1);
    			 }
    		 else {
    			 charMap.put(ch,  1);
    		 }
    		 }
    	 Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
    	 System.out.println("Duplicate characters are" );
    	 for(Map.Entry<Character, Integer> entry : entrySet) {
    		 if (entry.getValue() > 1) {
    			 System.out.println(entry.getKey());
    			 System.out.println(entry.getValue());
    		
    		 }
    	 }
     }
     
     public static void vowels(String s) {
    	 char[] chars = s.toCharArray();
    	 int vowels = 0;
    	 for( char c : chars) {
    		 switch (c) {
    		 case 'a' :
    		 case 'e' :
    		 case 'o' :
    		 case 'u' :
    			 vowels++;
    			 break;
    			 default:
    		 }
    	 }
    	 System.out.println("Vowels : "+vowels);
     }
     
     public static void palindrome(String string)
     {
         StringBuffer stringBuffer = new StringBuffer(string);
         StringBuffer newString = stringBuffer.reverse();
         System.out.println(newString);
         String finalString = newString.toString();
         if(string.equals(finalString))
         {
             System.out.println("palindrome");
         }
         else
         {
             System.out.println("not a palindrome");
         }
         
     }
     
    	    public static void checkString(String string)
    	    {
    	        for(int i = 0; i < string.length(); i++)
    	        {
    	            if(string.charAt(i) < 'A' || string.charAt(i) > 'Z' && string.charAt(i) < 'a' || string.charAt(i) > 'z' )
    	            {
    	                System.out.println("True");
    	            }
    	        }
    	        System.out.println("False");
    	    }

    	

public static void stringReverse(String string)
{
    String[] newArray = string.split(" ");
for(int i = newArray.length - 1; i >= 0; i--)
    System.out.print(newArray[i] + " ");
}


public static void binary(int number)
{
int[] binary = new int[1000];
int i = 0 ;
while(number > 0)
{
        binary[i] = number % 2;
        number = number / 2;
        i++;
}
for(int j =i;j>=0;j--)
//System.out.print(j);
System.out.print(binary[j]);
}


public static void main(String[] args) {
	int[] numbers = new int[] { 3, 7, 4 };
	/*
	 * System.out.println(args.length); ChapterOne.printhello();
	 * ChapterOne.printOperations(5, 7); ChapterOne.printMulttable(8);
	 * ChapterOne.printCircle(3); ChapterOne.printAverage(3, 4, 5);
	 * ChapterOne.printRectangle(5, 6); ChapterOne.printSwap(2, 3);
	 * ChapterOne.printCompare(4, 5); ChapterOne.printOddnumbers(10);
	 * ChapterOne.printEvennumbers(10); ChapterOne.sumOfArrayElements();
	 * ChapterOne.averageOfArrayElements(); ChapterOne.checkSpecificValue();
	 * ChapterOne.findIndex();
	 */
	int maximum = ChapterOne.findMax(numbers);
	System.out.println(maximum);

}

}






 

    		 
    	