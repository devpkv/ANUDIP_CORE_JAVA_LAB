package question4;

import java.util.Scanner;

public class Calculator {

	private static void sum(int num1, int num2) {  
		System.out.println(num1 + num2);
	}
	private static void sub(int num1, int num2) {  
		System.out.println(num1 - num2);
	}
	private static void div(int num1, int num2) {  
		System.out.println((float) num1 / num2);
	}
	private static void mul(int num1, int num2) {  
		System.out.println(num1 * num2);
	}
	public static void main(String[] args) {  
		
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			if(num1>0 && num2 > 0)
			{
				System.out.println("1. Addition +");
				System.out.println("2. Subtraction -");
				System.out.println("3. Multiplication *");
				System.out.println("4. Division /");
				System.out.println("5. Exit "); 
				int ch = sc.nextInt();
				
				switch(ch)
				{
					case 1: sum(num1, num2);
					break;
					case 2: sub(num1, num2);
					break;
					case 3: mul(num1, num2);
					break;
					case 4: div(num1, num2);
					break;
					case 5: System.exit(0);
					default : System.out.println("Wrong Input!");
					
				}
			}
			else
				throw new NumberException("Number should be grater than 0");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
