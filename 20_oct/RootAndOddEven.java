import java.util.*;
class RootAndOddEven
{
	// calculating square 
	private static void square(float num){
		System.out.println("Square of number "+num+" is = "+ (num*num)); 
	}
	// calculating cube 
	private static void cube(float num) {
		System.out.println("Cube of number "+num+" is = "+ (num*num*num));
	}
	// checking odd or even number
	private static void oddOrEven(float num)
	{
		if(num % 2 == 0)
			System.out.println(num+" is Even number");
		else
			System.out.println(num+" is Odd number");

	} 
		


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// input a number
		System.out.println("Enter a number :");
		float num = sc.nextFloat(); 

		// displaying the choices
		System.out.println("1. Square ");
		System.out.println("2. Cube ");
		System.out.println("3. Check number is odd or even"); 
		System.out.println("5. Exit ");
		System.out.print("Enter the choice : ");
		int choice = sc.nextInt();
		// start switch case 
		switch(choice)
		{
			case 1 : square(num);
					break;
			case 2 : cube(num);
					break;
			case 3 : oddOrEven(num);
					break; 
			case 5 : System.exit(0);
					break;
			default : System.out.println("Wrong Input!");
		}
		// end switch statement
	}
}