import java.util.*;
class ShoppingBill{

	private static void productCost(int qyt)
	{
		// default values
		int unitCost = 540;
		int discount = 10;
		float bill = unitCost * qyt; 
		// checking bill amount
		if(bill >= 2000)
		{
			
			System.out.println("Total Shopping bill = "+ bill);
			// discout in bill
			bill =  bill * (100 - discount) / 100;
			System.out.println("Congratulation, you are eligible for "+discount+"% discount");
			System.out.println("Net. Shopping bill = "+bill);
		}	
		else
			System.out.println("Total Shopping bill = "+ bill);

	}

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);

		
		// input -> Quantity of the product
		System.out.print("Enter quantity = ");
		int qyt = sc.nextInt();

		 
		productCost(qyt);



	}
}