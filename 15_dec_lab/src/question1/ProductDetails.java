package question1;

import java.io.*;
import java.util.Scanner;

public class ProductDetails {
	
	 
	public static void main(String[] args) throws IOException {
		
		File f = new File("D://ProductDetails.txt");
		boolean result = f.createNewFile();
		if(result)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Product Id");
			String pid = sc.next();
			System.out.println("Enter Product Name");
			String name = sc.next();
			System.out.println("Enter Product Price");
			double price = sc.nextDouble();
			
			String details = pid+" "+name+" "+price;
			FileWriter fw = new FileWriter("D://ProductDetails.txt");
			
			fw.write(details);
			fw.close();
			sc.close();
			
		}
		

	}

}
