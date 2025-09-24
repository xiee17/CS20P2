package SkillBuilders;

import java.util.Scanner;

public class Digit {
	
	public static void main(String[] args)
	{

	Scanner userInput = new Scanner(System.in);
	
	//Get digits from user
			System.out.print("Enter two digits number: ");
			int number = userInput.nextInt();
			
			int tens, ones;
			
			tens = number / 10;
			ones = number % 10;
			
			System.out.println("Tens = "+ tens);
			
			System.out.println("Ones = "+ ones);

	}
}
