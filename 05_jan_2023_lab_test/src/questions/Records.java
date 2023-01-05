package questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Records {
	
	public static void menu() {
		
		System.out.println("1. Add New Record.");
		System.out.println("2. Show All Record.");
		System.out.println("3. Exit.");
	}
	
	public static void addNewRecords(Scanner sc) throws IOException
	{ 
		FileWriter file = new FileWriter("records.txt",true);
		sc.skip("\\R");
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Phone Number : ");
		long phone = sc.nextLong();
		
		String str = name + " @ " +phone + "\n";
		
		file.write(str);
		
		file.close();
		
	}
	
	public static void showRecords() throws IOException
	{  
		FileReader file = new FileReader("records.txt");
		BufferedReader r = new BufferedReader(file);
		String data;
		Hashtable<Long, String> h = new Hashtable<>();
		while((data = r.readLine()) != null)
		{
			StringTokenizer st = new StringTokenizer(data,"@");
			String name = st.nextToken().trim();
			Long phone = Long.parseLong(st.nextToken().trim());
			h.put(phone, name);
		}
		
		
		for(Long read : h.keySet())
		{
			System.out.println("Name : "+h.get(read)+ " Phone no : "+ read);
		}
		
		r.close();
		file.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		
		
		do {
			menu();
			int choice = sc.nextInt(); 
			 
			switch(choice)
			{
				case 1 : addNewRecords(sc);
					 	break;
				case 2 : showRecords();
			 			break;
				case 3 : System.exit(0); 
			 	default : System.err.println("Wrong Input!");
			}
			
			
			System.out.println("Do you want to continue ? (y,n)");
			ch = sc.next().charAt(0);
		}while(ch == 'y');
		 
		
		
		sc.close(); 

	}

}
