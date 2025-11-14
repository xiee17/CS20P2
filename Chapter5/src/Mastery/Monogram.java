package Mastery;

import java.util.Scanner;
public class Monogram {
		public static void main(String [] args) {
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Enter your first name:");
			String firstname = userInput.nextLine();
			
			System.out.println("Enter your middle initial:");
			String middlename = userInput.nextLine();
			
			System.out.println("Enter your last name:");
			String lastname = userInput.nextLine();
			
			char FirstInitial = Character.toLowerCase(firstname.charAt(0));
			
			char LastInitial = Character.toUpperCase(lastname.charAt(0));
			
			char MiddleInitial = Character.toLowerCase(middlename.charAt(0));
			
			System.out.println("Your monogram is: " + FirstInitial + LastInitial + MiddleInitial);
		

		}
	}
