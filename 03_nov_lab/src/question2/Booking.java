package question2;

import java.util.Scanner;

public class Booking {

	// displaying room type
	private static void roomType()
	{
		System.out.println("Room Type :");
		System.out.println("1. 3 Star Room");
		System.out.println("2. 5 Star Room");
	}
	// displaying room option
	private static void bookingOption(int rType)
	{
		switch(rType)
		{
			case 1 : standardRoom();	
					break;
			case 2 : dulexRoom();	 
					break;
			default : System.out.println("Wrong input!");
					 
		}
	}
	
	// 3 Star Room method
	private static void standardRoom()
	{
		Room standard = new Room("3 Star");
		
		System.out.println("Your room is booked :");
		System.out.println("Pay the booking amount :" + standard.getPrice());
	}
	
	// 5 Star Room method
	private static void dulexRoom()
	{
		Scanner sc = new Scanner(System.in);
		
		// asking to user weather use need AC or not
		System.out.println("You want to AC in your room or not? (y/n)");
		char ch = sc.next().charAt(0);
		boolean ac = false;
		if(ch == 'y')
			ac = true;
		
		
		// dulex room price 10000
		float price = 1000.35f;
		Room dulex = new Room(3500,"5 Star",ac,150.0f);
		// set default price
		dulex.setPrice(price);
		// printing the booking amount
		System.out.println("Booking amount :" + dulex.getPrice());
		// asking user have discount coupon or not 
		System.out.println("do you have a discount coupon? (y/n) ");
		ch = sc.next().charAt(0); 
		if(ch == 'y')
		{
			System.out.print("Enter discout(%) = ");
			float discount = sc.nextFloat();
			// set the discounted price
			dulex.setPrice(price, discount); 
		}
		 
		
		// print the left amount to pay 
		System.out.println("Your room is booked :");
		System.out.println("Pay the booking amount :" + dulex.getPrice());
		
		sc.close();
	}
	
	
	
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		 
	 
		// displaying the room option
		roomType();
		int roomType = sc.nextInt();
		// calling the booking method
		bookingOption(roomType);
		 
		
		
		// exception occurred after program execution (nosuchelementexception)
		/*
		  Scanner sc = new Scanner(System.in);
			char ch = 'y';
		   
		   do {
			// displaying the room option
			roomType();
			int roomType = sc.nextInt();
			// calling the booking method
			bookingOption(roomType);
			System.out.print("Are you want to continue ? (y/n) : ");
			ch = sc.next().charAt(0);
		}while(ch == 'y');*/
		
		 
		
		sc.close();
	}

}
