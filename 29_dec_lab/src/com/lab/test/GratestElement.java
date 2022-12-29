package com.lab.test;

public class GratestElement {

	public static int gratestElement(int[] arr)
	{
		int MAX = arr[0];
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(MAX < arr[i+1])
			{
				MAX = arr[i+1];
			}
		}
		
		return MAX;
	}
	
	public static void main(String[] args) {
		
		int []arr = {23,5,43,56,34,54,67,23,33,1};
		System.out.println("Gratest Element is "+ gratestElement(arr));
	}

}
