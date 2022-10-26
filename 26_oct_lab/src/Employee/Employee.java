package Employee;

import java.util.Scanner;

public class Employee {
	
	int eid;
	String name;
	String department;
	float salary;
	
	// Declaring set details methods this used to take user input of employee details
	public void setDetails()
	{
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the flowing deatils of employee");
		System.out.print("ID ` Employee id will auto assign perfix with 'MEID' ` : ");
		this.eid = sc.nextInt();
		
		System.out.print("NAME : ");
		this.name = sc.next();
		
		System.out.print("DEPARMENT : ");
		this.department = sc.next();
		
		System.out.print("SALARY : ");
		this.salary = sc.nextFloat();
		
		sc.close();
		
	}
	
	// printing  employee details
	public void getDetails()
	{
		System.out.println("Employee Id : MEID"+ eid);
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee Deparment : "+ department);
		System.out.println("Employee Salary : "+ salary);
	}
	
	
}
