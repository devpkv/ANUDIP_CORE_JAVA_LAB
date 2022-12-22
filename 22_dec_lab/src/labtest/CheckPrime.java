package labtest;

import java.util.Scanner;

public class CheckPrime {
	
	public static boolean isPrime(long num) {
		
		for(int i = 2; i < num / 2; i++) 
			if(num % i == 0)
				return false; 
		
		return true;
	}


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long num = sc.nextLong();
		if(isPrime(num)) System.out.println(num+ " is a prime number.");
		else System.out.println(num+ " is not a prime number.");
		
		sc.close();
	}
	

}
