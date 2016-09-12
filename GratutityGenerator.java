//Alec Griego
//9/11/16
//CST-100
//Lydia Fritz
//Gratuity Generator
//////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class GratutityGenerator {
	public static void main(String[] args) {
		//Create the scanner for input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt the user for the two numbers
		System.out.print("Please enter a subtotal and gratutity percent.");
		double subtotal = userInput.nextDouble();
		double gratuity = userInput.nextDouble();
		
		//Do math operations for the gratuity. 
		double finalGratuity = gratuity / 100;
		finalGratuity = subtotal * finalGratuity;
		double finalSubtotal = subtotal + finalGratuity;
		
		//Print the results.
		System.out.print("The subtotal is:    $");
		System.out.print(finalSubtotal);
		System.out.print("\n");
		
		System.out.print("The gratuity is:   $");
		System.out.print(finalGratuity);
		System.out.print("\n");
		
	}

}
