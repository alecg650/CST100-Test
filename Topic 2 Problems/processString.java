//Alec Griego
//9/11/16
//CST-100
//Lydia Fritz
//String Processor
//////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class processString {
	public static void main(String[] args) {
		//Create a scanner for user input
		Scanner userInput = new Scanner(System.in);
		
		//Get the string from the user.
		System.out.print("Enter the string:   ");
		String userString = userInput.nextLine();
		
		//Print the first character from the users string. 
		System.out.print("The first character of the string is:  ");
		System.out.println(userString.charAt(0));
		
		//Print the length from the users string. 
		System.out.print("The length of the string is:   ");
		System.out.print(userString.length());
		
	}

}
