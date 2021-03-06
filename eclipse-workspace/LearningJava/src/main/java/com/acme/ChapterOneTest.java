package com.acme;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Vector;

import java.io.File;
import java.util.Date;

import org.junit.jupiter.api.Test;

class ChapterOneTest {

	@Test
	public void testFindMax() {

		int[] numbers = new int[] { 3, 7, 4, 4, 5, 6 };
		int maximum = ChapterOne.findMax(numbers);
		System.out.println(maximum);
	}

	@Test
	public void testPrintHello() {
		ChapterOne.printhello();
	}

	@Test
	public void testPrintOperations() {
		ChapterOne.printOperations(5, 6);
	}

	@Test
	public void testPrintMulttable() {
		ChapterOne.printMulttable(9);
	}

	@Test
	public void testPrintCircle() {
		ChapterOne.printCircle(5);
	}

	@Test
	public void testPrintSwap() {
		ChapterOne.printSwap(4, 6);
	}

	@Test
	public void testSumOfArrayElements() {
		ChapterOne.averageOfArrayElements();
	}

	@Test
	public void testCheckSpecificValue() {
		ChapterOne.checkSpecificValue();
	}

	@Test
	public void testfindIndex() {
		ChapterOne.findIndex();
	}

	@Test
	public void testConcatenatedString() {
		ChapterOne.printConcatenatedString();
	}

	@Test
	public void testStringTrim() {
		ChapterOne.stringTrim();
	}

	@Test
	public void testStringUpperCase() {
		ChapterOne.stringUpperCase();
	}

	@Test
	public void testStringLowerCase() {
		ChapterOne.stringLowerCase();
	}

	@Test
	public void testStringSubstring() {
		ChapterOne.stringSubstring();
	}

	@Test
	public void testStringReplace() {
		ChapterOne.stringReplace();
	}

	@Test
	public void testStringLength() {
		ChapterOne.stringLength();
	}

	@Test
	public void testStringStartwith() {
		ChapterOne.stringStartwith();
	}

	@Test
	public void testStringReplaceAll() {
		ChapterOne.stringReplaceAll();
	}

	@Test
	public void testStringCompare() {
		ChapterOne.stringCompare();
	}

	@Test
	public void testSmallest() {
		ChapterOne.findSmallest(34, 14, 95);
	}

	@Test
	public void testAverage() {
		int[] inputs = new int[] { 3, 3, 3 };
		double expectedAverage = 3.0;
		double calculatedAverage = ChapterOne.findAverage(inputs);
		assertEquals(expectedAverage, calculatedAverage);
	}

	@Test
	public void testSumOfDigits() {
		ChapterOne.sumOfDigits(32);

	}

	@Test
	public void testLoopYear() {
		ChapterOne.checkIfLeapYear(2000);
	}

	@Test
	public void testTriangleArea() {
		ChapterOne.triagleArea(10, 20, 30);
	}

	@Test
	public void testPentagonArea() {
		ChapterOne.PentagonArea(8, 9);
	}

	@Test
	public void testPrintMatrix() {
		ChapterOne.printMatrix(3);
	}

	@Test
	public void testMathRandom() {
		double x = Math.random() * 2;
		System.out.println((int) x);
	}

	@Test
	public void testFileOrDirectory() {
		String directoryName = "/Users/vdeepthi";
		ChapterOne.checkFileOrDirectory(directoryName);
	}

	@Test
	public void testCheckReadPermission() {
		String directoryName = "/Users/vdeepthi";
		ChapterOne.checkReadPermission(directoryName);
	}

	@Test
	public void testCheckWritePermission() {
		String directoryName = "/Users/vdeepthi";
		ChapterOne.CheckWritePermission(directoryName);
	}

	@Test
	public void testCreateFile() throws Exception {
		ChapterOne.createFile();
	}

	@Test
	public void testWordsInString() {
		String a = "Hello this is deepthii";
		int expectedValue = 5;
		int numberOfWords = ChapterOne.wordsinString(a);
		System.out.println(numberOfWords);
		assertEquals(expectedValue, numberOfWords);
	}

	@Test
	public void testmiddleWord() {
		String a = "Helloy";
		String b = ChapterOne.middleWord(a);
		System.out.println(b);
	}

	@Test
	public void testCompareFiles() {

		String pathName = "/Users/vdeepthi/eclipse-workspace/LearningJava/varanasi";
		File a = new File(pathName);
		pathName = "/tmp/xyz.txt";
		File b = new File(pathName);
		int result = ChapterOne.compareFiles(a, b);
		System.out.println(result);
	}

	@Test
	public void testVowels() {
		String input = "I AM DEEPTHI";
		int expectedVowels = 5;
		int noOfVowels = ChapterOne.findVowels(input);
		assertEquals(expectedVowels, noOfVowels);
		// System.out.println(noOfVowels);
	}

	@Test
	public void testreadInput() throws Exception {
		ChapterOne.readInput();
	}

	@Test
	public void testfileSizes() {
		String pathName = "/Users/vdeepthi/eclipse-workspace/LearningJava/varanasi";
		File file = new File(pathName);
		double size = ChapterOne.fileSizes(file);
		System.out.println(size);
	}

	@Test
	public void testfindLongestWords() throws Exception {
		String filePath = "/Users/vdeepthi/eclipse-workspace/LearningJava/varanasi";
		String longestWord = ChapterOne.findLongestWords(filePath);
		System.out.println(longestWord);
	}

	@Test
	public void testreadFile() throws Exception {
		String filePath = "/Users/vdeepthi/eclipse-workspace/LearningJava/varanasi";
		ChapterOne.readFile(filePath);
	}

	@Test
	public void testreadFileByFile() throws Exception {
		String filePath = "/Users/vdeepthi/eclipse-workspace/LearningJava/varanasi";
		File file = new File(filePath);
		ChapterOne.readFile(file);
	}

	@Test
	public void testlastModified() throws Exception {
		String filePath = "/Users/vdeepthi/eclipse-workspace/LearningJava/varanasi";
		Date lastModified = ChapterOne.lastModified(filePath);
		System.out.println(lastModified);
	}

	@Test
	public void testCreateArrayList() {
		ChapterOne.CreateArrayList();
	}

	@Test
	public void testPrintArrayList() {
		ChapterOne.PrintArrayList();
	}

	@Test
	public void testAddInToArrayList() {
		ChapterOne.addInToArrayList();
	}

	@Test
	public void testGetElement() {
		ChapterOne.getElement();
	}

	@Test
	public void testSetElement() {
		ChapterOne.setElement();
	}

	@Test
	public void testRemoveElement() {
		ChapterOne.removeElement();
	}

	@Test
	public void testSearchElement() {
		ChapterOne.searchElement();
	}

	@Test
	public void testSortArray() {
		ChapterOne.sortArray();
	}

	@Test
	public void testCopyArray() {
		ChapterOne.copyArray();
	}

	@Test
	public void shuffleArray() {
		ChapterOne.shuffleArray();
	}

	@Test
	public void testReverseArray() {
		ChapterOne.reverseArray();
	}

	@Test
	public void testSubArray() {
		ChapterOne.subArray();
	}

	@Test
	public void testJoinArrays() {
		ChapterOne.joinArrays();
	}

	@Test
	public void testswapElementsInArray() {
		ChapterOne.swapElementsInArray();
	}

	@Test
	public void testEmptyArray() {
		ChapterOne.emptyArray();
	}

	@Test
	public void testCheckIfEmpty() {
		ChapterOne.checkIfEmpty();
	}

	@Test
	public void testIncreaseSizeOfArray() {
		ChapterOne.increaseSizeOfArray();
	}

	@Test
	public void testCreateLinkedList() {
		ChapterOne.createLinkedList();
	}

	@Test
	public void testDisplayLinkedList() {
		ChapterOne.displayLinkedList();
	}

	@Test
	public void testAddInToLinkedList() {
		ChapterOne.addInToLinkedList();
	}

	@Test
	public void testAdddInToLinkedList() {
		ChapterOne.adddInToLinkedList();
	}

	@Test
	public void testOffersFirst() {
		ChapterOne.offersFirst();
	}

	@Test
	public void testOffersLast() {
		ChapterOne.offersLast();
	}

	@Test
	public void insertElements() {
		ChapterOne.insertElements();
	}

	@Test
	public void getElements() {
		ChapterOne.getElements();
	}

	@Test
	public void getFirstAndLast() {
		ChapterOne.getFirstAndLast();
	}

	@Test
	public void displayElements() {
		ChapterOne.displayElements();
	}

	@Test
	public void removeElements() {
		ChapterOne.removeElements();
	}

	@Test
	public void removeFirstAndLast() {
		ChapterOne.removeFirstAndLast();
	}

	@Test
	public void removeAll() {
		ChapterOne.removeAll();
	}

	@Test
	public void swapElements() {
		ChapterOne.swapElements();
	}

	@Test
	public void shuffleElements() {
		ChapterOne.shuffleElements();
	}

	@Test
	public void joinLinkedList() {
		ChapterOne.joinLinkedLists();
	}

	@Test
	public void removeAndReturn() {
		ChapterOne.removeAndReturn();
	}

	@Test
	public void retrieveLastElement() {
		ChapterOne.retrieveLastElement();
	}

	@Test
	public void elementExists() {
		ChapterOne.elementExists();
	}

	@Test
	public void conversion() {
		ChapterOne.conversion();
	}

	@Test
	public void checckIfEmpty() {
		ChapterOne.checckIfEmpty();
	}

	@Test
	public void replaceElements() {
		ChapterOne.replaceElements();
	}

	@Test
	public void createHashSet() {
		ChapterOne.createHashSet();
	}

	@Test
	public void displayHashSet() {
		ChapterOne.displayHashSet();
	}

	@Test
	public void printSize() {
		ChapterOne.printSize();
	}

	@Test
	public void removeHashElements() {
		ChapterOne.removeHashElements();
	}

	@Test
	public void isEmpty() {
		ChapterOne.isEmpty();
	}

	@Test
	public void conversionHashToArrayList() {
		ChapterOne.conversionHashTArrayList();
	}

	@Test
	public void removeAlllElements() {
		ChapterOne.removeAlllElements();
	}

	@Test
	public void testFactorial() {
		int fact = ChapterOne.fact(5);
		System.out.println(fact);
	}

	@Test
	public void testDesc() {
		ChapterOne.desc(5);
	}

	@Test
	public void testAsc() {
		ChapterOne.asc(2);
	}

	@Test
	public void testExp() {
		int expo = ChapterOne.exp(2, 3);
		System.out.println(expo);
	}

	@Test
	public void testFib() {
		int fibResult = ChapterOne.fib(3);
		System.out.println(fibResult);
	}

	@Test
	public void testPrintBinary() {
		ChapterOne.printBinary(4);
	}

	@Test
	public void testArrayLength() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6 };
		ChapterOne.arrayLength(numbers);
	}

	@Test
	public void printReverseArray() {
		int[] numbers = new int[] { 3, 7, 4 };
		ChapterOne.printReverseArray(numbers);
	}

	@Test
	public void testArraySum() {
		int[] numbers = new int[] { 3, 7, 4 };
		ChapterOne.arraySum(numbers);
	}

	@Test
	public void testArrayAverage() {
		int[] numbers = new int[] { 3, 7, 4 };
		ChapterOne.arrayAverage(numbers);
	}

	@Test
	public void testGetlargest() {
		int[] numbers = { 2, 3, 4, 5, 6, 7 };
		int largest = ChapterOne.getLargest(numbers);
		System.out.println(largest);
	}

	@Test
	public void testArraysAsParameters() {
		int[] numbers1 = new int[] { 1, 2, 3, 4 };
		int[] numbers2 = new int[] { 2, 3, 4, 5 };
		ChapterOne.arraysAsParameters(numbers1, numbers2);
	}

	@Test
	public void testCheckEquality() {
		int[] numbers1 = new int[] { 1, 2, 3, 4 };
		int[] numbers2 = new int[] { 1, 2, 3, 4 };
		ChapterOne.checkEquality(numbers1, numbers2);
	}

	@Test
	public void testTwoDArray() {
		ChapterOne.twoDArray();

	}

	@Test
	public void testVectorArraySize() {
		ChapterOne.vectorSize();
	}

	@Test
	public void testVectorSetSize() {
		ChapterOne.vectorSetSize();
	}

	@Test
	public void testVectorArrayCapacity() {
		ChapterOne.vectorArrayCapacity();
	}

	@Test
	public void testVectorSetCapacity() {
		ChapterOne.vectorSetCapacity();
	}

	@Test
	public void testVectorAddElements() {
		ChapterOne.vectorAddElements();
	}

	@Test
	public void testVectorGetElement() {
		ChapterOne.vectorGetElement();
	}

	@Test
	public void testvectorPrintElements() {
		ChapterOne.vectorPrintElements();
	}

	@Test
	public void testvectorContains() {
		ChapterOne.vectorContains();
	}

	@Test
	public void testVecotrOperations() {
		ChapterOne.vectorOperations();
	}

	@Test
	public void testPrintTwoD() {
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		ChapterOne.printTwoD(mat);
	}

	@Test
	public void testPrintTwooD() {
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		ChapterOne.printTwooD(mat);
	}

	@Test
	public void testPrint2D() {
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		ChapterOne.print2D(mat);
	}

	@Test
	public void testPrintThreeD() {
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		ChapterOne.printThreeD(mat);
	}

	@Test
	public void testPrint3D() {
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		ChapterOne.print3D(mat);
	}

	@Test
	public void testBubbleSort() {
		int[] nums = { 41, 3, 72, 11, 3, -1};
		ChapterOne.bubbleSort(nums);
	}
	
	@Test
	public void testSelectionSort() {
		int[] nums = { 41, 3, 72, 11, 3, -1};
		ChapterOne.selectionSort(nums);
	}
	
	@Test
	public void testSwap()
	{
		int a = 50;
		int b = 75;
		ChapterOne.swap(a, b);
		
	}
	
	@Test
	public void testMerge() {
		int arr[] = {12, 11, 13, 5, 6, 7};
   	 
     // ChapterOne.merge(arr, l, m, r);
	}
	
	@Test
	public void testDuplicates() {
		String s = "deepthi";
		ChapterOne.duplicates(s);
	}
	
	@Test
	public void testVoowels() {
		String s = "deepthi";
		ChapterOne.vowels(s);
	}
	

	@Test
	public void testPalindrome() {
		String string = "lalala";
		ChapterOne.palindrome(string);
	}
	
	@Test
	public void testCheckString() {
		String string = "lalala";
		ChapterOne.checkString(string);

		
	}
	
	@Test
	public void testStringReverse() {
		String string = "deepthi";
		ChapterOne.stringReverse(string);
		
	}
	@Test 
	public void TestBubbleSort()
	{
		int[] array = { 4,3,2,1};
		BubbleSort.bubbleSort(array);
		int number=17;
		ChapterOne.binary(number);
		
	}
	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */

}
