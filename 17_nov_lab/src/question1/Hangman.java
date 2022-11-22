package question1;

import java.util.Scanner;

public class Hangman {
	
	private static void setWords(String[] words, int len, Scanner sc)
	{
		 
		System.out.println("Enter "+ len+" words :");
		
		for(int i = 0; i < len; i++)
		{
			words[i] = sc.next();
		}
		
		// displaying group of string from the users
		System.out.println("++++ GROUP OF WORDS ++++");
		for(int i = 0; i < len; i++)
		{
			System.out.print(words[i]+" ");
		}
		
		System.out.println();
		 
	}
	// displaying dash
	private static void dash(String str)
	{
		
		int wlen = str.length();
		System.out.print("Selected word is : ");
		for(int i = 1; i <= wlen; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		// STEP 1. How many words you want to store.  
		System.out.print("How many words you want to store ? ");
		int len = sc.nextInt();
		// STEP 2. Creating string array to store words.
		String[] words = new String[len];
		
		// STEP 3. Creating string array to store words.
		setWords(words, len, sc);
		
		// STEP 4. Choose a word at random from the list of strings. 
		char ch = 'y'; 
		// wrong attempts, correct guess attempts
		int wrong = 0, correct = 0;;
		
		do {
			System.out.println("Choose a random word from the list [ 1 to "+len+" ] ?");
			int random = sc.nextInt();
			if(random > 0 && random <= len)
			{
				String str = words[random - 1];
				dash(str);
				
				// taking guess word from the user
				System.out.print("Enter the word you want guess :");
				String guess = sc.next();
				if(str.equalsIgnoreCase(guess))
				{
					System.out.println("Wonnn!, You guessed correct.");
					correct++;
				}
				else
				{
					System.out.println("You lose!, You guessed wrong.");
					wrong++;
				}
				// Displaying the final scores
				System.out.println("You final score is :");
				System.out.println("CORRECT = "+ correct);
				System.out.println("WRONG = "+ wrong);
				
			}
			else
				System.out.println("Exceed the words limit");
		
			// asking user to play again or not;
			System.out.println("Are you want to continue? (y/n)");
			ch = sc.next().charAt(0);
			
		}while(ch == 'y');
		 
		sc.close();

	}

}
