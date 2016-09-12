//Alec Griego
//9/11/16
//CST-100
//Lydia Fritz
//Substring Checker
//////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class SubStringCalculator {
	public static void main(String[] args) 
	{
		//Create scanner for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt for input
		System.out.print("Enter the first string:   ");
		String s1 = userInput.nextLine();
		
		System.out.print("Enter the second string:   ");
		String s2 = userInput.nextLine();

		//If the original string contains the substring alert the user.
		if (s1.contains(s2))
		{
			System.out.println("s1 contains s2");
		}
		
		//If it does not contain alert the user it does not. 
		else 
		{
			System.out.println("s2 is not a substring of s1");
		}
	}

}
