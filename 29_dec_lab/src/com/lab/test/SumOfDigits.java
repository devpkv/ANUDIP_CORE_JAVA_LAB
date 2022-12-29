package com.lab.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {

	public static int digitSum(long num)
	{
		int sum = 0, unitDigit; 
		while(num > 0)
		{
			unitDigit = (int) (num % 10);
			sum += unitDigit;
			num = num / 10;
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		long num = Long.parseLong(br.readLine()); 
		System.out.println(num+" digits sum = "+digitSum(num));

	}

}
