//Alec Griego
//9/11/16
//CST-100
//Lydia Fritz
//Trip Calculator
//////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class TripCalculator {

	public static void main(String[] args) {
		//Create a scanner for input. 
		Scanner userInput = new Scanner(System.in);

		//Get the values from the user. 
		System.out.print("Enter the driving distance:  ");
		double drivingDistance = userInput.nextDouble();
		
		System.out.print("Enter miles per gallon:   ");
		double mpg = userInput.nextDouble();
		
		System.out.print("Enter the price per gallon:   ");
		double price = userInput.nextDouble();
		
		//Perform the calculation
		double finalCost = (drivingDistance / mpg) * price; 
		
		//Print the results
		System.out.print("The final cost of driving is:   ");
		System.out.print(finalCost);
		
	}

}
