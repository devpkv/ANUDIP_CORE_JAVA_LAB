package question3;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter menu : ");
		
		int num = sc.nextInt();
		
		try {
			
			if(num >= 1 && num <=3)
				System.out.println("You choose "+num+" menu");
			else
				throw new InputCheckEception("Invalid input");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			sc.close();
		}
		 
		
	}

}
