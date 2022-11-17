package question2;

public class StringFunctions {

	public static void main(String[] args) {
		 
		String str = "Pankaj Kumar";
		
		// Length method is used to find length of string
		
		System.out.println("Length of String is : "+ str.length());
		
		// .equals() is used to compare two strings

		String s1 = "core"; // "java" If we put "java" instead of "core" in the case of s1. It will print "both stings are same." 
		String s2 = "java";
		if(s1.equals(s2)) 
			System.out.println("Both strings are same"); 
		else
			System.out.println("Both strings are not same"); 
		
		// .equalsIgnoreCase() -> ignore the case of strings while comparing
			
		s1 = "Java";
		
		if(s1.equalsIgnoreCase(s2)) 
			System.out.println("Both strings are same"); 
		else
			System.out.println("Both strings are not same"); 
		
		// .charAt(0) -> return the character of specified position of string
		
		System.out.println(s1.charAt(2));
		
		
		// s1.concat(s2) it return the concatenated string
		System.out.println(s1.concat(s2));
		 
	}

}
