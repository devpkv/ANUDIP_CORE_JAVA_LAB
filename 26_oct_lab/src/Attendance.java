import java.util.Scanner;

public class Attendance {

	private static void checkEligblity(int totalClasses, int attendedClasses)
	{
		int criteria_per = 75;
		float attended_per = totalClasses * criteria_per / 100 ;
		if(attended_per <= attendedClasses) 
			System.out.println("You are allowed to sit in upcoming exam... "); 
		else
		 	System.out.println("You are not allowed to sit for upcoming exam... "); 
	}
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);

		// input -> Total classes
		System.out.print("Number of class held ? = ");
		int totalClasses = sc.nextInt();

		// input -> Total attended classses
		System.out.print("Number of classes you attended? = ");
		int attendedClasses = sc.nextInt();
		checkEligblity(totalClasses, attendedClasses);
		sc.close();
	}

}
