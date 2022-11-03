package question3;

import java.util.Scanner;

public class PigglieBank {

	public static void main(String[] args) {
		
		// creating object of bank class
		Bank b = new Bank();
		
		// with parameter
		//Bank b = new Bank(10);
		
	 
	   Scanner sc = new Scanner(System.in);
	   char ch = 'y';
	   // displaying initial the amount
	   System.out.println("Inital amount in your piggie bank is :" + b.getBalance());
	   do {
		   
		   System.out.print("How much amount you want to add = ");
		   double amt = sc.nextDouble();
		   b.setBalance(amt);
		// displaying the amount
		   System.out.println("Total amount in your piggie bank is :" + b.getBalance());
		 
		System.out.print("Are you want to add more amount ? (y/n) : ");
		ch = sc.next().charAt(0);
		}while(ch == 'y'); 

	}

}
