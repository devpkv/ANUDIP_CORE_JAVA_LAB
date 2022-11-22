package question3;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Select menu {1,2,3}: ");
		
		String str = sc.next();
		
		try {
			int len = str.length(); 
			if(len == 1)
			{
				int num = Integer.parseInt(str);
				if(num >= 1 && num <=3)
					System.out.println("You choose "+num+" menu");
				else
					throw new InputCheckEception("Invalid input");
			}
			else
				throw new CharacterCheck("Wrong input");
			
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
