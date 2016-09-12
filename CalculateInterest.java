//Alec Griego
//9/11/16
//CST-100
//Lydia Fritz
//Interest Calculator
//////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class CalculateInterest {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter the balance and interest rate:   ");
		double balance = userInput.nextDouble();
		double interestRate = userInput.nextDouble();
		
		//Perform the calculation
		double monthInterest = balance* (interestRate/1200);
		
		//Print the results
		System.out.print("Next months interest will be: ");
		System.out.print(monthInterest);
		
	}

}
