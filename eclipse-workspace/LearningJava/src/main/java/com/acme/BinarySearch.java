package com.acme;

public class BinarySearch {
	public static void main(String[] args)
	{
        int[] array = {11,22,33};
        int element = 22;
        int start = 0;
        int end = array.length - 1;
        while(start ==end)
        {
        int mid;
        mid = (start + end)/2;
        if(element == array[mid])
        {
        	System.out.println("element found at position : "+ mid);
        		
        }
        else if(element  > array[mid])
        {
        	start = mid + 1;
        }
        else if(element < array[mid])
        {
        	end = mid -1;
        }
        else
        {
        	System.out.println("element not found");
        }
      
		}
        
	}
	}


