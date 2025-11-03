package Skillbuilder;

import java.util.Scanner;

public class Delivery {
	public static void main (String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the length of the package: ");
		double len = userInput.nextDouble();
		
		System.out.println("The width: ");
		double wid = userInput.nextDouble();
		
		System.out.println("The height: ");
		double hei = userInput.nextDouble();
		
		if (len >10 || wid >10 || hei>10) {
			System.out.println("REJECT");
		}
		else {
			System.out.println("ACCEPT");
		}
	}
	
}

