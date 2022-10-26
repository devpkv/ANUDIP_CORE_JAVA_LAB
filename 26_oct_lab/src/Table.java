import java.util.Scanner;

public class Table {

	private static void printTable(int num)
	{
		 
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(num+" x "+ i +" = "+ (i*num));
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to print the table");
		int num = sc.nextInt();
		printTable(num);
		
		sc.close();
		
	}


}
