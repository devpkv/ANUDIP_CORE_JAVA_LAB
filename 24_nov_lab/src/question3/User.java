package question3;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// employee details
		Employee e = new Employee();
		
		System.out.println("Enter Employee Details :");
		
		System.out.print("$ Name : ");
		e.setName(sc.nextLine());
		
		System.out.print("$ Age : ");
		e.setAge(sc.nextInt()); 
		sc.nextLine();
		System.out.print("$ Phone Number : ");
		e.setPhone(sc.nextLine());
		
		System.out.print("$ Address : ");
		e.setAddress(sc.nextLine());
		
		System.out.print("$ Salary : ");
		e.setSalary(sc.nextDouble());
		sc.nextLine();
		System.out.print("$ Specialization : ");
		e.setSpecialization(sc.nextLine());
		
		
		 
		// Manager details
		Manager m = new Manager();
		
		System.out.println("Enter Manager Details :");
		
		System.out.print("$ Name : ");
		m.setName(sc.nextLine());
		
		System.out.print("$ Age : ");
		m.setAge(sc.nextInt()); 
		sc.nextLine();
		System.out.print("$ Phone Number : ");
		m.setPhone(sc.nextLine());
		
		System.out.print("$ Address : ");
		m.setAddress(sc.nextLine());
		
		System.out.print("$ Salary : ");
		m.setSalary(sc.nextDouble());
		sc.nextLine();
		
		System.out.print("$ Department : ");
		m.setDepartment(sc.nextLine());
		
		 System.out.println(" +++ Employee Details : +++ \n Name=" + e.getName() + ", \n Age=" + e.getAge() + ", \n Phone=" + e.getPhone() + ""
			 		+ ", \n Address=" + e.getAddress() + ", \n Salary=" + e.printSalary() + " , \n Specialization = "+e.getSpecialization()+"");
		 
		 System.out.println(" +++ Manager Details : +++ \n Name=" + m.getName() + ", \n Age=" + m.getAge() + ", \n Phone=" + m.getPhone() + ""
		 		+ ", \n Address=" + m.getAddress() + ", \n Salary=" + m.printSalary() + " , \n Department = "+m.getDepartment()+"");
		 
		 
		 sc.close();

	}

	 

}
