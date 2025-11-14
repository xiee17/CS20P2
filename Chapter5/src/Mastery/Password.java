package Mastery;

import java.util.Scanner;

public class Password {
	public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
		
		String cpassword = "inside";
		int attempt = 0;
		
		do {
			System.out.println("Enter the password");
			String password = userInput.nextLine();
			attempt++;
		
			if (password.equals(cpassword)) {
				System.out.print("Welcome");
				break;
			}
			if (attempt == 3) {
				System.out.println("Access denied");
			} 
		} while (attempt < 3);
	}
}