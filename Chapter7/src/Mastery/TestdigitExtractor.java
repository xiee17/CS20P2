package Mastery;

import java.util.Scanner;

public class TestdigitExtractor {
	public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
		digitExtractor extractor = new digitExtractor();
		
		System.out.println("Enter an integer: ");
		int integer = userInput.nextInt();
		extractor.setNumber(integer);
		
		char choice;
		do {
		System.out.println("show (W)hole numer.");
		System.out.println("show (O)nes place number.");
		System.out.println("show (T)ens place number.");
		System.out.println("show (H)undreds place number.");
		System.out.println("(Q)uit");
		System.out.println("Enter your choice: ");
		choice = userInput.next().toUpperCase().charAt(0);
		
		switch(choice) {
		case 'W':
			System.out.println(extractor.getWhole());
			break;
		case 'O':
			System.out.println(extractor.getOnes());
			break;
		case 'T':
			System.out.println(extractor.getTens());
			break;
		case 'H':
			System.out.println(extractor.getHundreds());
			break;
		default:
			System.out.println("Invalid number");
			break;
			
		}
	}while(choice != 'Q');
	}


}
