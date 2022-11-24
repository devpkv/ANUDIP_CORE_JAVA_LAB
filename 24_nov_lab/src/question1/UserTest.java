package question1;

import java.util.Scanner;

public class UserTest {

	public static void display(University u)
	{
		System.out.println("First Name :"+ u.getFirstName());
		System.out.println("Last Name :"+ u.getLastName());
		System.out.println("Age :"+ u.getAge());
		 
	}
	
	public static void student()
	{  
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.println("Enter Student Details :");
		 
		
		System.out.print("$ First Name : ");
		s.setFirstName(sc.nextLine());
		
		System.out.print("$ Last Name : ");
		s.setLastName(sc.nextLine()); 
		 
		System.out.print("$ Age : ");
		s.setAge(sc.nextInt()); 
		
		sc.nextLine();
		
		System.out.print("$ Course : ");
		s.setCourse(sc.nextLine());
		
		System.out.print("$ Student Id : ");
		s.setId(sc.nextLine());
		
		// display student details
		System.out.println(" +++++++++++ Student Details +++++++++++++");
		display(s); // common data
		System.out.println("Course :"+ s.getCourse());
		System.out.println("Student Id"+ s.getId());
		
		sc.close();
	}
	
	
	public static void employee()
	{
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		
		System.out.println("Enter Employee Details :");
		 
		
		System.out.print("$ First Name : ");
		e.setFirstName(sc.nextLine());
		
		System.out.print("$ Last Name : ");
		e.setLastName(sc.nextLine()); 
		 
		System.out.print("$ Age : ");
		e.setAge(sc.nextInt()); 
		
		sc.nextLine();
		
		System.out.print("$ Department : ");
		e.setDepartment(sc.nextLine());
		
		System.out.print("$ Salary : ");
		e.setSalary(sc.nextDouble());
		sc.nextLine();
		
		System.out.print("$ Designation : ");
		e.setDesignation(sc.nextLine());
		
		// display student details
		System.out.println(" +++++++++++ Employee Details +++++++++++++");
		display(e); // common data
		System.out.println("Department :"+ e.getDepartment());
		System.out.println("Salary : "+ e.getSalary());
		System.out.println("Designation : "+ e.getDesignation());
		
		
		sc.close();
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Available option
		
		System.out.println("What type of details you want to enter ?");
		System.out.println("1. Student");
		System.out.println("2. Employee");
		
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1: student();
			break;
		case 2: employee();
			break;
		default: System.out.println("Wrong Input !");
		         System.exit(ch);
		}
		sc.close();

	}

}
