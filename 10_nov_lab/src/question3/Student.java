package question3;

import java.util.Scanner;

public class Student {
	
	// method to print student rank
	private static void printRank(String[] name, float[] marks, int len)
	{
		
		 
		// shorting marks in descending order with their names
		for(int i =0; i < len-1; i++)
		{ 
			for(int j =0; j < len - 1; j++)
			{
				if(marks[j] < marks[j+1])
				{
					float temp = marks[j+1];
					marks[j+1] = marks[j];
					marks[j] = temp;
					
					// interchanging names
					
					String temp_name = name[j+1];
					name[j+1] = name[j];
					name[j] = temp_name;
				}
			}
			
			
		}
		System.out.println("+++++++++++++++++++++ STUDENT RANK DETAILS +++++++++++++++++++++");
		for(int k =0; k < len; k++)
		{
			 
			System.out.println("RANK "+ (k+1) + " Name : "+ name[k]+" with marks "+ marks[k]); 
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number of student you want to add ?");
		int num = sc.nextInt();
		String[] name = new String[num]; 
		float marks[] = new float[num];
		
		// add student details -- 
		
		for(int i =0; i < num; i++)
		{
			System.out.println("Enter Student details :");
			System.out.print("Name : ");
			name[i] = sc.next(); 
			System.out.print("Marks : ");
			marks[i] = sc.nextFloat();
		}
		
		// print student rank with name
		printRank(name, marks, num);
		
		sc.close();
	}
}
