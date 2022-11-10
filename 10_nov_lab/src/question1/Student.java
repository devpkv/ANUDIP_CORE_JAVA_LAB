package question1;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number of student you want to add ?");
		int num = sc.nextInt();
		String[] name = new String[num];
		String[] deprt = new String[num];
		int roll[] = new int[num];
		float marks[] = new float[num];
		
		// add student details -- 
		
		for(int i =0; i < num; i++)
		{
			System.out.println("Enter Student details :");
			System.out.print("Name : ");
			name[i] = sc.next();
			System.out.print("Deparment : ");
			deprt[i] = sc.next();
			System.out.print("Roll : ");
			roll[i] = sc.nextInt();
			System.out.print("Marks : ");
			marks[i] = sc.nextFloat();
		}
		
		// print student record
		System.out.println("+++++++++++++++++++++ DETAILS +++++++++++++++++++++");
		for(int i =0; i < num; i++)
		{
			System.out.println((i+1)+" Student details :");
			System.out.println("Name : "+ name[i]); 
			System.out.println("Deparment : "+ deprt[i]); 
			System.out.println("Roll : "+ roll[i]); 
			System.out.println("Marks : "+ marks[i]); 
		}
		
		sc.close();
		

	}

}
