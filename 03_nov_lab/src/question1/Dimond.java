package question1;

import java.util.Scanner;

public class Dimond {

	// method for printing diamond shape
	private static void printDimond(int n)
	{
		// Declaring the initial space to print 
		 int space = n - 1;
		 
		 // printing upper diamond rows
		 for(int i = 1; i <= n; i++)
		 {
			 // printing spaces
			 for(int j = 1; j <= space; j++)
				 System.out.print(" ");
			 // printing x 
			 for(int k = 1; k <= i; k++)
				 System.out.print("X ");
			 // line beak to print to next line
			 System.out.println();
			 
			 // decreasing space value to print in every next line
			 space--;
		 }
		 
		 
		 space = 1;
		 for(int i = n-1; i >= 0; i--)
		 {
			// printing spaces
			 for(int j = 1; j <= space; j++)
				 System.out.print(" ");
			 
			// printing x
			 for(int k = 1; k <= i; k++)
				 System.out.print("X ");
			 
			 // line beak to print to next line
			 System.out.println();
			// increasing space value to print in every next line
			 space++;
		 }
	}
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		do {
			System.out.print("Enter the rows = ");
			// rows user input 
			int row = sc.nextInt();
			printDimond(row);
			
			// option to continue the program
			System.out.println("Are you want to continue ? (y/n)");
			ch = sc.next().charAt(0);
		}
		while(ch == 'y');
		sc.close();
	}

}
