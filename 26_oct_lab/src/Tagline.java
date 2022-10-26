import java.util.Scanner;

public class Tagline {

	private static void printAbbr(String abbr)
	{
		 
		switch(abbr){

			case "honda" -> System.out.println("The power of dreams"); 
			case "amul" -> System.out.println("The Taste of India"); 
			case "lg" -> System.out.println("Life's Good"); 
			default -> System.out.println("Wrong Input!");
						 
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an abbreviation(Honda,Amul,LG)");
		String abbr = sc.next().toLowerCase();
		printAbbr(abbr);
		
		sc.close();
		
	}

}
