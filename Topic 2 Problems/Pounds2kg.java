//Alec Griego
//9/11/16
//CST-100
//Lydia Fritz
//Pounds to kilogram converter.
//////////////////////////////////////////////////////////////////

import java.util.Scanner;


public class Pounds2kg {
	public static void main(String[] args) {
		//Create the scanner to receiver input.
		Scanner userInput = new Scanner(System.in);
		
		//Have user enter the number of pounds to be converted.
		System.out.print("Enter the number of pounds to be converted:   ");
		double numberOfPounds = userInput.nextFloat();
		
		//Do the math
		double conversionValue = .454;
		double numberOfKg = conversionValue * numberOfPounds;
		
		//Print the results
		System.out.print(numberOfPounds);
		System.out.print(" pounds ");
		System.out.print(" is ");
		System.out.print(numberOfKg);
		System.out.print(" kg. \n");
		
		

	}

}
