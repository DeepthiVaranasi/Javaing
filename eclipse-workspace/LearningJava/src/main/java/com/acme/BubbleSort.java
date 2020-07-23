package com.acme;

public class BubbleSort {
	public static void bubbleSort(int[] array)
	{
		int n = array.length;
		for(int i = 0 ; i < n-1; i++)
		{
			for(int j = i+1; j < n-i-1; j++)
			{
			if ( array [j] > array [j+1])
			{
				int temp =array[j]; 
				array[j]= array[j+1];
				array[j+1] = temp;
				
			}
			}
		}
		for(int k = 0 ; k < n ; k++)
		{
			System.out.println(array[k]);
		}
	}

}
