package labtest;

import java.util.Scanner;

public class PrintDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("++++++++ EMPLOYEE DETAIL'S ++++++++++");
		 
		Employee e = new Employee();
		System.out.print("Name :");
		e.setName(sc.nextLine());
		System.out.print("Age :");
		e.setAge(sc.nextInt());
		System.out.print("Phone Number :");
		e.setPhone(sc.nextLong());
		sc.skip("\\R"); // skipping next line separator
		System.out.print("Address :");
		e.setAddress(sc.nextLine());
		System.out.print("Salary :");
		e.setSalary(sc.nextDouble());
		sc.skip("\\R"); // skipping next line separator
		System.out.print("Specialization :");
		e.setSpecialization(sc.nextLine());
		System.out.print("Department :");
		e.setDeparment(sc.nextLine());
		
		
		System.out.println("++++++++ MEMBER DETAIL'S ++++++++++");
		
		Manager m = new Manager();
		System.out.print("Name :");
		m.setName(sc.nextLine());
		System.out.print("Age :");
		m.setAge(sc.nextInt());
		System.out.print("Phone Number :");
		m.setPhone(sc.nextLong());
		sc.skip("\\R"); // skipping next line separator
		System.out.print("Address :");
		m.setAddress(sc.nextLine());
		System.out.print("Salary :");
		m.setSalary(sc.nextDouble());
		sc.skip("\\R"); // skipping next line separator
		System.out.print("Specialization :");
		m.setSpecialization(sc.nextLine());
		System.out.print("Department :");
		m.setDeparment(sc.nextLine());
		
		
		System.err.println("======= EMPLOYEE DETAIL ========");
		System.out.println("Name :" + e.getName());
		System.out.println("Age :" + e.getAge());
		System.out.println("Phone Number :" + e.getPhone());
		System.out.println("Address :" + e.getAddress());
		System.out.println("Salary :" + e.getSalary());
		System.out.println("Specialization :" + e.getSpecialization());
		System.out.println("Department :" + e.getDeparment());
		
		
		System.err.println("======= MEMBER DETAIL ========");
		System.out.println("Name :" + m.getName());
		System.out.println("Age :" + m.getAge());
		System.out.println("Phone Number :" + m.getPhone());
		System.out.println("Address :" + m.getAddress());
		System.out.println("Salary :" + m.getSalary());
		System.out.println("Specialization :" + m.getSpecialization());
		System.out.println("Department :" + m.getDeparment());
		sc.close();

	}

}
