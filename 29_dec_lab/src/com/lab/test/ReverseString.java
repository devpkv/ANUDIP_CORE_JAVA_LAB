package com.lab.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	
	public static String reverse(String str)
	{
		
		int len = str.length();
		String rev_str = "";
		
		for(int i = len - 1; i >= 0; i--)
		{
			rev_str += str.charAt(i);
			 
		}
		
		return rev_str;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str = br.readLine(); 
		System.out.println("Reversed String : "+ reverse(str));
	}

}
