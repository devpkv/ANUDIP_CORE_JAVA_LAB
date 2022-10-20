import java.util.*;
class OldestOrYoungest{

	private static void OldAndYoung(int age1,int age2,int age3)
	{
		// declear old and young variable
		int old,young;
		// checking age of olest one
		if(age1 > age2 && age1 > age3)
			old = age1;
		else if(age2 > age3)
			old = age2;
		else
			old = age3;

		// checking age of youngest one
		if(age1 < age2 && age1 < age3)
			young = age1;
		else if(age2 < age3)
			young = age2;
		else
			young = age3; 


		System.out.println("Oldest = "+old+" and Youngest = "+young);

	}

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);

		
		// input -> age of three people
		System.out.print("Enter Age 1 = ");
		int age1 = sc.nextInt();
		System.out.print("Enter Age 2 = ");
		int age2 = sc.nextInt();
		System.out.print("Enter Age 3 = ");
		int age3 = sc.nextInt();

		 // calling OldAndYoung function
		OldAndYoung function(age1,age2,age3);



	}
}