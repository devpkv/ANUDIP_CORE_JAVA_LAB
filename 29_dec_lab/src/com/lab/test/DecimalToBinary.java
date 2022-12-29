package com.lab.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {

	public static void toBinary(int num) {
		
		byte binary[] = new  byte[100];
		int count = 0;
		
		while(num > 0)
		{
			binary[count++] = (byte) (num % 2);
			num /= 2;
		}
		 
		for(int i = count - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int num = Integer.parseInt(br.readLine());
		
		toBinary(num);
		
		
		// Alternate library for conversion decimal to binary
		
		System.out.println("\n"+ Integer.toBinaryString(num));
	}

}
