package labtest;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(long num) {
			
			long rev = 0, rem, temp = num;
			while(num > 0)
			{
				rem = num % 10;
				rev = rev * 10 + rem; 
				num = num / 10;
			}
			 
			if(rev == temp)
				return true;
			
			return false;
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long num = sc.nextLong();
		if(isPalindrome(num)) System.out.println(num+ " is a palidrome number.");
		else System.out.println(num+ " is not a palidrome number.");
		
		sc.close();
	}

}
