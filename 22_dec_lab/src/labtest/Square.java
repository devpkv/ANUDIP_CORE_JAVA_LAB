package labtest;

import java.util.Scanner;

public class Square extends Reactangle{

	
	public Square(double length, double breadth) {
		super(length, breadth); 
	}

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Length : ");
		double l = sc.nextDouble();
		
		System.out.print("Breadth : ");
		double b = sc.nextDouble();
		
		Square s = new Square(l, b);
		
		System.out.println("Area : "+ s.area());
		System.out.println("Perimeter : "+ s.perimeter());
		
		sc.close();
		
	}

}
